/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tk.dvdlibrary;

import com.tk.dvdlibrary.controller.DVDLibraryController;
import com.tk.dvdlibrary.dao.DVDLibraryDao;
import com.tk.dvdlibrary.dao.DVDLibraryDaoFileImpl;
import com.tk.dvdlibrary.ui.DVDLibraryView;
import com.tk.dvdlibrary.ui.UserIO;
import com.tk.dvdlibrary.ui.UserIOConsoleImpl;

/**
 *
 * @author Tanner Kendall
 */
public class App {
    
    public static void main(String[] args) {
        
        UserIO myIo = new UserIOConsoleImpl();
        
        DVDLibraryView myView = new DVDLibraryView(myIo);
        
        DVDLibraryDao myDao = new DVDLibraryDaoFileImpl();
        
        DVDLibraryController controller = new DVDLibraryController(myDao, myView);
    
        controller.run();
        
    }
    
}
