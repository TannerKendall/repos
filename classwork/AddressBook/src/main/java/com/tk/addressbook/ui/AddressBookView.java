/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tk.addressbook.ui;

import com.tk.addressbook.dto.Address;
import java.util.List;

/**
 *
 * @author Tanner Kendall
 */
public class AddressBookView {
    
    private UserIO io;
    
    public int printMenuAndGetSelection(){
        io.print("Main Menu");
        io.print("1. List all addresses");
        io.print("2. Add address");
        io.print("3. Find address by last name");
        io.print("4. Remove address");
        io.print("5. Total number of addresses");
        io.print("6. Exit");
        
        return io.readInt("Please select from the above choices.", 1, 6);
    }
    
    public Address getNewAddressInfo() {
        
        //set temp values
        String firstName = io.readString("Please enter First Name");
        String lastName = io.readString("Please enter Last Name");
        String streetAddress = io.readString("Please enter Street Address (not city, state, zip)");
        String city = io.readString("Please enter City");
        String state = io.readString("Please enter State");
        String zip = io.readString("Please enter zip code");
        
        //create object
        Address currentAddress = new Address(lastName);
        currentAddress.setFirstName(firstName);
        currentAddress.setStreetAddress(streetAddress);
        currentAddress.setCity(city);
        currentAddress.setState(state);
        currentAddress.setZip(zip);
        
        return currentAddress;
        
    }
    
    public void displayNewAddressBanner(){
        io.print("=== NEW ADDRESS ADDED ===");
    }
    
    public void displayNewSuccessBanner() {
        io.readString("Address successfully added. Please hit enter to continue");
    }
    
    public void displayAddressList(List<Address> AddressList) {
        for (Address currentAddress : AddressList){
            String addressInfo = String.format("%s : %s : %s : %s : %s : %s",
                    currentAddress.getFirstName(),
                    currentAddress.getLastName(),
                    currentAddress.getStreetAddress(),
                    currentAddress.getCity(),
                    currentAddress.getState(),
                    currentAddress.getZip());
            io.print(addressInfo);
        }
        io.print("");
        io.readString("Please hit enter to continue.");
    }
    
    public void displayAddressListBanner(){
        io.print("=== Address List ===");
    }
    
    public void displayDisplayAddressBanner(){
        io.print("=== Display Address ===");
    }
    
    public String getLastNameChoice() {
        return io.readString("Please enter the Last Name.");
    }
    
    public void displayAddress(Address address) {
        if (address != null) {
            io.print(address.getFirstName() + " " + address.getLastName());
            io.print(address.getStreetAddress() + ", " + address.getCity() + ", " 
            + address.getState() + " " + address.getZip());
            io.print("");
        } else {
            io.print("No such address.");
        }
        io.readString("Please hit enter to continue.");
    }
    
    public void displayRemoveAddressBanner(){
        io.print("=== Remove Address ===");
    }
    
    public void displayRemovedResult(Address addressRecord) {
        if (addressRecord != null) {
            io.print("Address successfully removed.");
        } else {
            io.print("No such address.");
        }
        io.print("");
        io.readString("Please hit enter to continue.");
    }
    
    public void displayCountBanner(){
        io.print("=== NUMBER OF ADDRESSES IN BOOK ===");
    }
    
    public void displayCountResults(List<Address> addressList) {
        if(addressList.isEmpty()){
            io.print("There are no addresses in the book.");
        } else {
            io.print("There are " + addressList.size() + " addresses in the book");
        }
        io.print("");
        io.readString("Please hit enter to continue.");
    }
    
    public void displayExitBanner(){
        io.print("Goodbye!!");
    }
    
    public void displayUnknownCommandBanner() {
        io.print("Unknown Command!!!");
    }
    
    public AddressBookView(UserIO io) {
        this.io = io;
    }
    
    public void displayErrorMessage(String errorMsg) {
        io.print("=== ERROR ===");
        io.print(errorMsg);
    }
    
}
