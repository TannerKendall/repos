/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tk.classroster.dao;

/**
 *
 * @author Tanner Kendall
 */
public class ClassRosterPersistanceException extends Exception {
    
    public ClassRosterPersistanceException(String message) {
        super(message);
    }
    
    public ClassRosterPersistanceException(String message, Throwable cause) {
        super(message, cause);
    }
    
}
