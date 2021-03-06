/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tk.classroster;

import com.tk.classroster.controller.ClassRosterController;
import com.tk.classroster.dao.ClassRosterAuditDao;
import com.tk.classroster.dao.ClassRosterAuditDaoFileImpl;
import com.tk.classroster.dao.ClassRosterDao;
import com.tk.classroster.dao.ClassRosterDaoFileImpl;
import com.tk.classroster.service.ClassRosterServiceLayer;
import com.tk.classroster.service.ClassRosterServiceLayerImpl;
import com.tk.classroster.ui.ClassRosterView;
import com.tk.classroster.ui.UserIO;
import com.tk.classroster.ui.UserIOConsoleImpl;

/**
 *
 * @author Tanner Kendall
 */
public class App {
    
    public static void main(String[] args) {
        
        UserIO myIo = new UserIOConsoleImpl();
        
        ClassRosterView myView = new ClassRosterView(myIo);
        
        ClassRosterDao myDao = new ClassRosterDaoFileImpl();
        
        ClassRosterAuditDao myAuditDao = new ClassRosterAuditDaoFileImpl();
        
        ClassRosterServiceLayer myService = new ClassRosterServiceLayerImpl(myDao, myAuditDao);
        
        ClassRosterController controller = new ClassRosterController(myService, myView);
        
        controller.run();
    }
    
}
