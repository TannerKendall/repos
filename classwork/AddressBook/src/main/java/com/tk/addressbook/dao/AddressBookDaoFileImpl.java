/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tk.addressbook.dao;

import com.tk.addressbook.dto.Address;
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
public class AddressBookDaoFileImpl implements AddressBookDao {
    
    private Map<String, Address> addresses = new HashMap<>();
    public static final String BOOK_FILE = "book.txt";
    public static final String DELIMITER = "::";

    @Override
    public List<Address> getAllAddresses() throws AddressBookDaoException{
        loadBook();
        return new ArrayList(addresses.values());
    }

    @Override
    public Address addAddress(String lastName, Address address) throws AddressBookDaoException{
        loadBook();
        Address newAddress = addresses.put(lastName, address);
        writeBook();
        return newAddress;
    }

    @Override
    public Address getAddress(String lastName) throws AddressBookDaoException{
        loadBook();
        return addresses.get(lastName);
    }

    @Override
    public Address removeAddress(String lastName) throws AddressBookDaoException{
        loadBook();
        Address removedAddress = addresses.remove(lastName);
        writeBook();
        return removedAddress;
    }

    @Override
    public Integer getCount(List<Address> addressList) {
        int size = addressList.size();
        return size;
    }
    
    private Address unmarshallAddress(String addressAsText) {
        // addressAsText os expecting a line read in from our file.
        // For example it might look like this
        // Joe::Cool::106::W Main St:: Kent::Ohio::44240
        // Then split the line on our DELIMITER - which is "::"
        // Leaving us with an array of Strings, stored in addressTokens
        String[] addressTokens = addressAsText.split(DELIMITER);
        
        // given patter above, last name is at index [1]
        String lastName = addressTokens[1];
        
        // Which we then use to create new Address object to satisfy requirements of constructor
        Address addressFromFile = new Address(lastName);
        
        // need to assign rest of tokens into new address object
        
        //Index 0 - firstName
        addressFromFile.setFirstName(addressTokens[0]);
        
        //Index 2 - streetAddress
        addressFromFile.setStreetAddress(addressTokens[2]);
        
        // Index 3 - city
        addressFromFile.setCity(addressTokens[3]);
        
        //Index 4 - state
        addressFromFile.setState(addressTokens[4]);
        
        // Index 5 - zip
        addressFromFile.setZip(addressTokens[5]);
        
        return addressFromFile;
    }
    
    private void loadBook() throws AddressBookDaoException {
        Scanner scanner;
        
        try{
            scanner = new Scanner(new BufferedReader(new FileReader(BOOK_FILE)));
        }catch (FileNotFoundException e) {
            throw new AddressBookDaoException("-_- Could not load book into memory", e);
        }
        
        // currentLine holds most recent line read
        String currentLine;
        
        // currentAddress holds the most recent Address unmarshalled
        Address currentAddress;
        
        // go through BOOK_FILE line by line, decoding each line into a Address object by calling 
        // unmarshallAddress method.
        // Process while we have more lines in the file
        while (scanner.hasNextLine()) {
            // get the next line in the file
            currentLine = scanner.nextLine();
            // umarshall the line into a Address object
            currentAddress = unmarshallAddress(currentLine);
            
            // going to use the lastName as map key for our address object.
            // put currentAddress into the map using lastName as key
            addresses.put(currentAddress.getLastName(), currentAddress);
        }
        // close scanner
        scanner.close();
    }
    
    private String marshallAddress(Address anAddress) {
        // We need to turn our address object into a line of text for our file.
        // Just get out each property, and concatenate with our DELIMITER as a kind of spacer
        // Start with firstName since it's first
        
        String addressAsText = anAddress.getFirstName() + DELIMITER;
        
        addressAsText += anAddress.getLastName() + DELIMITER;
        
        addressAsText += anAddress.getStreetAddress() + DELIMITER;
        
        addressAsText += anAddress.getCity() + DELIMITER;
        
        addressAsText += anAddress.getState() + DELIMITER;
        // skip delimiter on last one
        addressAsText += anAddress.getZip();
        
        return addressAsText;
    }
    
    /**
     * Writes all addresses in the book out to a BOOK_FILE. See loadBook for file format.
     * 
     * @throws ClassRosterDaoException if an error occurs writing to the file.
     */
    private void writeBook() throws AddressBookDaoException {
        PrintWriter out;
        
        // Not handling IOException but translating to an app specific exception
        // and simple throwing it to the code that called us
        try {
            out = new PrintWriter(new FileWriter(BOOK_FILE));
        } catch (IOException e) {
            throw new AddressBookDaoException("Could now save address data", e);
        }
        
        //write out the address Objects to the book file.
        
        String addressAsText;
        List<Address> addressList = this.getAllAddresses();
        for (Address currentAddress : addressList) {
            //turn address into a string
            addressAsText = marshallAddress(currentAddress);
            // write the Address object to the file
            out.println(addressAsText);
            // force PrintWriter to write line to file
            out.flush();
        }
        // clean up
        out.close();
    }
    
}
