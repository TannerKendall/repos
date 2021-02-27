/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tk.dvdlibrary.dao;

import com.tk.dvdlibrary.dto.DVD;
import java.util.List;

/**
 *
 * @author Tanner Kendall
 */
public interface DVDLibraryDao {
    
    /**
     * Adds the given DVD to the library and associates it with the given title.
     * If there is already a DVD associated with the given title, it will return that
     * DVD object, otherwise it will return null.
     * 
     * @param title title with which DVD is to be associated
     * @param dvd dvd to be added to the library
     * @return the DVD object previously associated with title if it exists, null otherwise.
     * @throws DVDLibraryDaoException
     */
    DVD addDVD(String title, DVD dvd) throws DVDLibraryDaoException;
    
    /**
     * Removes from the library the DVD associated with the given title.
     * Returns the DVD object that is being removed or null if there is no DVD associated
     * with the given title
     * 
     * @param title title of DVD to be removed
     * @return DVD object that was removed or null if no DVD was associated with the given title.
     * @throws DVDLibraryDaoException
     */
    DVD removeDVD(String title) throws DVDLibraryDaoException;
    
    /**
     * Edits a DVD from the library with the given title.
     * Returns the DVD object being edited or null if there is no DVD associated with the title.
     * 
     * @param oldTitle title of DVD to be edited
     * @param newTitle new title for DVD
     * @return DVD object that was edited or null if no DVD is associated with the title.
     * @throws DVDLibraryDaoException
     */
    DVD editDVD(String newTitle, String oldTitle) throws DVDLibraryDaoException;
    
    /**
     * Returns a list of all DVDs in the library.
     * 
     * @return List containing all DVDs in the roster.
     * @throws DVDLibraryDaoException
     */
    List<DVD> getAllDVDs() throws DVDLibraryDaoException;
    
    /**
     * Returns the DVD object associated with the given title.
     * Returns null if no such DVD exists
     * 
     * @param title title of the DVD to retrieve
     * @return the DVD object associated with the given title, null otherwise
     * @throws DVDLibraryDaoException
     */
    DVD getDVD(String title) throws DVDLibraryDaoException;
    
}
