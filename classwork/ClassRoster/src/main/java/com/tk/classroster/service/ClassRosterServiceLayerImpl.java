/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tk.classroster.service;

import com.tk.classroster.dao.ClassRosterAuditDao;
import com.tk.classroster.dao.ClassRosterDao;
import com.tk.classroster.dao.ClassRosterPersistanceException;
import com.tk.classroster.dto.Student;
import java.util.List;

/**
 *
 * @author Tanner Kendall
 */
public class ClassRosterServiceLayerImpl implements ClassRosterServiceLayer {

    private ClassRosterAuditDao auditDao;
    ClassRosterDao dao;
    
    public ClassRosterServiceLayerImpl(ClassRosterDao dao, ClassRosterAuditDao auditDao){
        this.dao = dao;
        this.auditDao = auditDao;
    }
    
    @Override
    public void createStudent(Student student) throws ClassRosterDuplicateIdException,
            ClassRosterDataValidationException,
            ClassRosterPersistanceException {
        
        //First check to see if there's already a student associated
        // with the given student ID.
        //If so, we're all done here - throw a ClassRosterDuplicateIdException
        if(dao.getStudent(student.getStudentId()) != null){
            throw new ClassRosterDuplicateIdException("ERROR: Could not create student."
                    + " Student ID " + student.getStudentId() + " already exists");
        }
        
        //Now validate all the fields on the given student object.
        // This method will throw an exception if any of the validation
        //rules are violated.
        validateStudentData(student);
        
        //We passed all our business rules checks so go ahead and persist
        // the Student object
        dao.addStudent(student.getStudentId(), student);
        
        //The student was successfully created, now write to the audit log
        auditDao.writeAuditEntry("Student " + student.getStudentId() + " CREATED");
    }

    @Override
    public List<Student> getAllStudents() throws ClassRosterPersistanceException {
        return dao.getAllStudents();
    }

    @Override
    public Student getStudent(String studentId) throws ClassRosterPersistanceException {
        return dao.getStudent(studentId);
    }

    @Override
    public Student removeStudent(String studentId) throws ClassRosterPersistanceException {
        Student removedStudent = dao.removeStudent(studentId);
        //Write to audit log
        auditDao.writeAuditEntry("Student " + studentId + " REMOVED");
        return removedStudent;
    }
    
    private void validateStudentData(Student student) throws ClassRosterDataValidationException{
        
       if(student.getFirstName() == null
               || student.getFirstName().trim().length() == 0
               || student.getLastName() == null
               || student.getLastName().trim().length() == 0
               || student.getCohort() == null
               || student.getCohort().trim().length() == 0){
            
            throw new ClassRosterDataValidationException("Error: All fields "
                    + "[First Name, Last Name, Cohort] are required.");
       } 
        
    }
    
}
