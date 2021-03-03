/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tk.dvdlibrary.controller;

import com.tk.dvdlibrary.dao.DVDLibraryDao;
import com.tk.dvdlibrary.dao.DVDLibraryDaoException;
import com.tk.dvdlibrary.dto.DVD;
import com.tk.dvdlibrary.ui.DVDLibraryView;
import com.tk.dvdlibrary.ui.UserIO;
import com.tk.dvdlibrary.ui.UserIOConsoleImpl;
import java.util.List;

/**
 *
 * @author Tanner Kendall
 */
public class DVDLibraryController {
    
    private DVDLibraryView view;
    private DVDLibraryDao dao;
    private UserIO io = new UserIOConsoleImpl();
    
    public DVDLibraryController(DVDLibraryDao dao, DVDLibraryView view) {
        this.dao = dao;
        this.view = view;
    }
    
    public void run() {
        
        boolean keepGoing = true;
        int menuSelection;
        
        try {
            while (keepGoing) {

                menuSelection = getMenuSelection();

                switch (menuSelection) {
                    case 1:
                        addDVD();
                        break;
                    case 2:
                        removeDVD();
                        break;
                    case 3:
                        editDVD();
                        break;
                    case 4:
                        listDVDs();
                        break;
                    case 5:
                        viewDVD();
                        break;
                    case 6:
                        keepGoing = false;
                        break;
                    default:
                        unknownCommand();
                }

            }
            exitMessage();
            
        }catch(DVDLibraryDaoException e) {
            view.displayErrorMessage(e.getMessage());
        }
    }
    
    private int getMenuSelection(){
        return view.printMenuAndGetSelection();
    }
    
    private void addDVD() throws DVDLibraryDaoException {
        view.displayAddDVDBanner();
        DVD newDVD = view.getNewDVDInfo();
        dao.addDVD(newDVD.getTitle(), newDVD);
        view.displayAddSuccessBanner();
    }
    
    private void listDVDs() throws DVDLibraryDaoException {
        view.displayDisplayAllBanner();
        List<DVD> dvdList = dao.getAllDVDs();
        view.displayDVDList(dvdList);
    }
    
    private void viewDVD() throws DVDLibraryDaoException {
        view.displayDisplayDVDBanner();
        String title = view.getTitleChoice();
        DVD dvd = dao.getDVD(title);
        view.displayDVD(dvd);
    }
    
    private void removeDVD() throws DVDLibraryDaoException {
        view.displayRemoveDVDBanner();
        String title = view.getRemoveChoice();
        DVD removedDVD = dao.removeDVD(title);
        view.displayRemovalResult(removedDVD);
    }
    
    private void editDVD() throws DVDLibraryDaoException{
        
        try{
            
            view.displayEditBanner();
            
            DVD editedDVD = dao.getDVD(view.getEditTitle());
            
            String prevTitle = editedDVD.getTitle();
            
            view.editDVDFields(editedDVD);
            
            String newTitle = editedDVD.getTitle();
            
            dao.editDVD(newTitle, prevTitle);
            
            view.displayEditSuccessBanner();
            
        } catch (NullPointerException n){
            
            view.displayCantFindDVD();
            
        }
    }
    
    private void unknownCommand(){
        view.displayUnknownCommandBanner();
    }
    
    private void exitMessage(){
        view.displayExitBanner();
    }
    
}
