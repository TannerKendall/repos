/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tk.addressbook.controller;

import com.tk.addressbook.dao.AddressBookDao;
import com.tk.addressbook.dao.AddressBookDaoException;
import com.tk.addressbook.dao.AddressBookDaoFileImpl;
import com.tk.addressbook.dto.Address;
import com.tk.addressbook.ui.AddressBookView;
import com.tk.addressbook.ui.UserIO;
import com.tk.addressbook.ui.UserIOConsoleImpl;
import java.util.List;

/**
 *
 * @author Tanner Kendall
 */
public class AddressBookController {
   
   private AddressBookView view;
   private AddressBookDao dao;
   
    public void run(){
       
        boolean keepGoing = true;
        int menuSelection = 0;
        
        try {
            while(keepGoing){

                menuSelection = getMenuSelection();

                switch(menuSelection) {
                    case 1:
                        listAddresses();
                        break;
                    case 2:
                        addAddress();
                        break;
                    case 3:
                        viewAddress();
                        break;
                    case 4:
                        removeAddress();
                        break;
                    case 5:
                        getCount();
                        break;
                    case 6:
                        keepGoing = false;
                        break;
                    default:
                        unknownCommand();
                }
            }
            exitMessage();
        } catch (AddressBookDaoException e){
            view.displayErrorMessage(e.getMessage());
        }
    }
   
    private int getMenuSelection() {
        return view.printMenuAndGetSelection();
    }
    
    private void addAddress() throws AddressBookDaoException{
        view.displayNewAddressBanner();
        Address newAddress = view.getNewAddressInfo();
        dao.addAddress(newAddress.getLastName(), newAddress);
        view.displayNewAddressBanner();
    }
    
    private void listAddresses() throws AddressBookDaoException{
        view.displayAddressListBanner();
        List<Address> addressList = dao.getAllAddresses();
        view.displayAddressList(addressList);
    }
    
    private void viewAddress() throws AddressBookDaoException{
        view.displayDisplayAddressBanner();
        String lastName = view.getLastNameChoice();
        Address address = dao.getAddress(lastName);
        view.displayAddress(address);
    }
    
    private void removeAddress() throws AddressBookDaoException{
        view.displayRemoveAddressBanner();
        String lastName = view.getLastNameChoice();
        Address removedAddress = dao.removeAddress(lastName);
        view.displayRemovedResult(removedAddress);
    }
    
    private void getCount()throws AddressBookDaoException{
        view.displayCountBanner();
        List<Address> addressList = dao.getAllAddresses();
        view.displayCountResults(addressList);
    }
    
    private void unknownCommand(){
        view.displayUnknownCommandBanner();
    }
    
    private void exitMessage() {
        view.displayExitBanner();
    }
    
    public AddressBookController(AddressBookDao dao, AddressBookView view) {
        this.dao = dao;
        this.view = view;
    }
    
}
