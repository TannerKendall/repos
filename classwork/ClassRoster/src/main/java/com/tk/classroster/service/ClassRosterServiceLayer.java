/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tk.classroster.service;

import com.tk.classroster.dao.ClassRosterPersistanceException;
import com.tk.classroster.dto.Student;
import java.util.List;

/**
 *
 * @author Tanner Kendall
 */
public interface ClassRosterServiceLayer {
    
    void createStudent(Student student) throws
            ClassRosterDuplicateIdException,
            ClassRosterDataValidationException,
            ClassRosterPersistanceException;
    
    List<Student> getAllStudents() throws
            ClassRosterPersistanceException;
    
    Student getStudent(String studentId) throws
            ClassRosterPersistanceException;
    
    Student removeStudent(String studentId) throws
            ClassRosterPersistanceException;
    
}
