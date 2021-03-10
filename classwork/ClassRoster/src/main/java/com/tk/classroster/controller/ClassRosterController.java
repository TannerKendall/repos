/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tk.classroster.controller;

import com.tk.classroster.dao.ClassRosterDao;
import com.tk.classroster.dao.ClassRosterPersistanceException;
import com.tk.classroster.dto.Student;
import com.tk.classroster.service.ClassRosterDataValidationException;
import com.tk.classroster.service.ClassRosterDuplicateIdException;
import com.tk.classroster.service.ClassRosterServiceLayer;
import com.tk.classroster.ui.ClassRosterView;
import java.util.List;

/**
 *
 * @author Tanner Kendall
 */
public class ClassRosterController {
    
    private ClassRosterView view;;
    private ClassRosterServiceLayer service;
    
    public void run(){
        boolean keepGoing = true;
        int menuSelection = 0;
        
        try {
            while(keepGoing) {

                menuSelection = getMenuSelection();

                switch (menuSelection){
                    case 1:
                        listStudents();
                        break;
                    case 2:
                        createStudent();
                        break;
                    case 3:
                        viewStudent();
                        break;
                    case 4:
                        removeStudent();
                        break;
                    case 5:
                        keepGoing = false;
                        break;
                    default:
                        unknownCommand();
                }

            }
            exitMessage();
        } catch(ClassRosterPersistanceException e) {
            view.displayErrorMessage(e.getMessage());
        }
    }
    
    private int getMenuSelection() {
        return view.printMenuAndGetSelection();
    }
    
    private void createStudent() throws ClassRosterPersistanceException {
        view.displayCreateStudentBanner();
        boolean hasErrors = false;
        
        do{
            Student currentStudent = view.getNewStudentInfo();
            try{
                service.createStudent(currentStudent);
                view.displayCreateSuccessBanner();
                hasErrors = false;
            } catch(ClassRosterDuplicateIdException | ClassRosterDataValidationException e){
                hasErrors = true;
                view.displayErrorMessage(e.getMessage());
            }
        }while(hasErrors);
        
    }
    
    private void listStudents() throws ClassRosterPersistanceException {
        view.displayDisplayAllBanner();
        List<Student> studentList = service.getAllStudents();
        view.displayStudentList(studentList);
    }
    
    private void viewStudent() throws ClassRosterPersistanceException{
        view.displayDisplayStudentBanner();
        String studentId = view.getStudentIdChoice();
        Student student = service.getStudent(studentId);
        view.displayStudent(student);
    }
    
    private void removeStudent() throws ClassRosterPersistanceException {
        view.displayRemoveStudentBanner();
        String studentId = view.getStudentIdChoice();
        Student removedStudent = service.removeStudent(studentId);
        view.displayRemoveResult(removedStudent);
    }
    
    private void unknownCommand() {
        view.displayUnknownCommandBanner();
    }
    
    private void exitMessage() {
        view.displayExitBanner();
    }
    
    public ClassRosterController(ClassRosterServiceLayer service, ClassRosterView view) {
        this.service = service;
        this.view = view;
    }
    
}
