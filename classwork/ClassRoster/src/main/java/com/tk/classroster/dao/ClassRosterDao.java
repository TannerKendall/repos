/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tk.classroster.dao;

import com.tk.classroster.dto.Student;
import java.util.List;

/**
 *
 * @author Tanner Kendall
 */
public interface ClassRosterDao {
    
    /**
     * Adds the given student to the roster and associates it with the given
     * student id. If there is already a student associated with the given
     * student id it will return that student object, otherwise it will return null.
     * 
     * @param studentId with which the student is to be associated
     * @param student student to be added to the roster
     * @return the Student object previously associated with the given student id if it still exists, null otherwise
     * @throws ClassRosterDaoException
     * 
     */
    Student addStudent(String studentId, Student student) throws ClassRosterDaoException;
    
    /**
     * Returns a List of all students in the roster
     * 
     * @return List containing all students in the roster
     * @throws ClassRosterDaoException
     */
    List<Student> getAllStudents() throws ClassRosterDaoException;
    
    /**
     * Returns the student object associated with the given student id.
     * Returns null if no such student exists
     * 
     * @param studentId Id of the student to retrieve
     * @return the Student object associated with the given student id, null if no such student exists
     * @throws ClassRosterDaoException
     */
    Student getStudent(String studentId) throws ClassRosterDaoException;
    
    /**
     * Removes from the roster the student associated with the given id
     * Returns the student object that is being removed or null if there is no student associated with given id
     * 
     * @param studentId of student to be removed
     * @return Student object that was removed or null if no student was associated with given id
     * @throws ClassRosterDaoException
     */
    Student removeStudent(String studentId) throws ClassRosterDaoException;
}
