/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tk.classmodeling;

/**
 *
 * @author Tanner Kendall
 */
public class Book2 {
    private String author;
    private String publisher;
    private int numOfPages;
    private String genre;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Book2(String author, String publisher, int numOfPages, String genre) {
        this.author = author;
        this.publisher = publisher;
        this.numOfPages = numOfPages;
        this.genre = genre;
    }
    
    
            
}
