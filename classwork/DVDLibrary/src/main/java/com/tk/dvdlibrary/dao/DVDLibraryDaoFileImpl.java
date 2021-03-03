/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tk.dvdlibrary.dao;

import com.tk.dvdlibrary.dto.DVD;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Tanner Kendall
 */
public class DVDLibraryDaoFileImpl implements DVDLibraryDao {

    public static final String LIBRARY_FILE = "library.txt";
    public static final String TEMP_FILE = "temp.txt";
    public static final String DELIMITER = "%%";
    private Map<String, DVD> dvds = new HashMap<>();
    
    
    @Override
    public DVD addDVD(String title, DVD dvd) throws DVDLibraryDaoException {
        loadLibrary();
        DVD newDVD = dvds.put(title, dvd);
        writeLibrary();
        return newDVD;
    }

    @Override
    public DVD removeDVD(String title) throws DVDLibraryDaoException {
        loadLibrary();
        DVD removedDVD = dvds.remove(title);
        writeLibrary();
        return removedDVD;
    }

    @Override
    public List<DVD> getAllDVDs() throws DVDLibraryDaoException {
        loadLibrary();
        return new ArrayList<DVD>(dvds.values());
    }

    @Override
    public DVD getDVD(String title) throws DVDLibraryDaoException {
        loadLibrary();
        return dvds.get(title);
    }

    @Override
    public DVD editDVD(String newTitle, String oldTitle) throws DVDLibraryDaoException {
        DVD editedDVD = dvds.remove(oldTitle);
        removeDVD(oldTitle);
        dvds.put(newTitle, editedDVD);
        return editedDVD;
    }
    
    private DVD unmarshallDVD(String dvdAsText){
        
        // dvdAsText is expecitng a line read in from our file.
        // Then we split that line on the DELIMITER, in this case "%%",
        // leaving an array of strings stored in dvdTokens.
        // pattern: Title%%ReleaseDate%%MPAArating%%Director%%Studio%%UserRating
        
        String[] dvdTokens = dvdAsText.split(DELIMITER);
        
        // title at 0 index
        String title = dvdTokens[0];
        
        // then use title to create new DVD object to satisfy requirements of DVD constructor
        DVD dvdFromFile = new DVD(title);
        
        // fill out remaning tokens
        dvdFromFile.setReleaseDate(dvdTokens[1]);
        dvdFromFile.setMpaaRating(dvdTokens[2]);
        dvdFromFile.setDirector(dvdTokens[3]);
        dvdFromFile.setStudio(dvdTokens[4]);
        dvdFromFile.setUserRating(dvdTokens[5]);
        
        // return dvd object
        return dvdFromFile;
    }
    
    private void loadLibrary() throws DVDLibraryDaoException {
        
        Scanner scanner;
        
        try {
            scanner = new Scanner(new BufferedReader(new FileReader(LIBRARY_FILE)));
        } catch (FileNotFoundException e) {
            throw new DVDLibraryDaoException("-_- Could not load library data into memory.", e);
        }
        
        // currentLine will hold most recent line read from file
        String currentLine;
        
        // currentDVD holds most recent DVD unmarshalled
        DVD currentDVD;
        
        // go through LIBRARY_FILE line by line, decoding each into a DVD object by calling
        //unmarshallDVD method.
        // while we still have more lines in the file
        while(scanner.hasNextLine()){
            // get next line
            currentLine = scanner.nextLine();
            // unmarshall into a DVD
            currentDVD = unmarshallDVD(currentLine);
            // use title as map key for our DVD object
            dvds.put(currentDVD.getTitle(), currentDVD);
        }
        scanner.close();
    }
    
    private String marshallDVD(DVD dvd){
        
        //get out each property in correct order and concatenate with DELIMITER as a spacer
        String dvdAsText = dvd.getTitle() + DELIMITER;
        
        dvdAsText += dvd.getReleaseDate() + DELIMITER;
        dvdAsText += dvd.getMpaaRating() + DELIMITER;
        dvdAsText += dvd.getDirector() + DELIMITER;
        dvdAsText += dvd.getStudio() + DELIMITER;
        dvdAsText += dvd.getUserRating();
        // skip delimiter on last property
        
        return dvdAsText;
    }
    
    /**
     * Writes all DVDs in the roster out to LIBRARY_FILE. see loadLibrary for file format.
     * 
     * @throws DVDLibraryDaoException if an error occurs writing file
     */
    private void writeLibrary() throws DVDLibraryDaoException {
        // not handling IOException but translating to an app specific exception
        // and simple throwing it to the code that called us.
        // It is the responsibility of the calling code to handle an errors that occur.
        
        PrintWriter out;
        
        try{
            out = new PrintWriter(new FileWriter(LIBRARY_FILE));
        } catch (IOException e) {
            throw new DVDLibraryDaoException("Could not save DVD data.", e);
        }
        
        // Write out DVD objects to the LIBRARY_FILE.
        // reuse getAllDVDs method
        
        String dvdAsText;
        List<DVD> dvdList = this.getAllDVDs();
        
        for(DVD currentDVD : dvdList){
            //turn DVD into String
            dvdAsText = marshallDVD(currentDVD);
            // write the DVD object to file
            out.println(dvdAsText);
            out.flush();
        }
        out.close();
    }
    
    private void overwriteLibrary() throws DVDLibraryDaoException {
        
        
    }
    
}
