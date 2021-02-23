/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tk.addressbook.dao;

import com.tk.addressbook.dto.Address;
import java.util.List;

/**
 *
 * @author Tanner Kendall
 */
public interface AddressBookDao {
    
    /**
     * Returns a list of all addresses in the book
     * 
     * @return List containing all addresses in the book
     */
    List<Address> getAllAddresses() throws AddressBookDaoException;
    
    /**
     * Adds the given Address to the book and associates it with the given Last Name.
     * If there is already an address associated with the given Last Name it will return that
     * object. otherwise it will return null.
     * 
     * @param lastName with which address is to be associated with.
     * @param address address to be added to the book
     * 
     * @return the Address object previously associated with the given Last Name if it exists
     * null otherwise
     */
    Address addAddress(String lastName, Address address) throws AddressBookDaoException;
    
    /**
     * Returns the address object associated with the given lastName.
     * Returns null if no such address exists
     * 
     * @param lastName of address to receive
     * @return the Address object associated with the given lastName, null if no such address exits
     */
    Address getAddress(String lastName) throws AddressBookDaoException;
    
    /**
     * Removes from the book the address associated with given lastName.
     * Returns the address object that is being removed or null if there is no
     * address associated with the given lastName.
     * 
     * @param lastName last name of address to be removed
     * @return Address object that was removed or null if no address was associated 
     * with the given lastName
     */
    Address removeAddress(String lastName) throws AddressBookDaoException;
    
    /**
     * Counts number of addresses in book using .size() method
     * @param addressList list of all addresses in book
     * @return Integer of addressList size
     */
    Integer getCount(List<Address> addressList) throws AddressBookDaoException;
    
}
