/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tk.addressbook;

import com.tk.addressbook.controller.AddressBookController;
import com.tk.addressbook.dao.AddressBookDao;
import com.tk.addressbook.dao.AddressBookDaoFileImpl;
import com.tk.addressbook.ui.AddressBookView;
import com.tk.addressbook.ui.UserIO;
import com.tk.addressbook.ui.UserIOConsoleImpl;

/**
 *
 * @author Tanner Kendall
 */
public class App {
    public static void main(String[] args) {
        
        UserIO myIo = new UserIOConsoleImpl();
        
        AddressBookView myView = new AddressBookView(myIo);
        
        AddressBookDao myDao = new AddressBookDaoFileImpl();
        
        AddressBookController controller = new AddressBookController(myDao, myView);
        
        controller.run();
        
    }
}
