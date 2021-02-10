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
public class Book1 {
    private int numOfPages;
    private String title;
    private String copyrightYear;
    private String chapters;

    public int getNumOfPages() {
        return numOfPages;
    }

    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCopyrightYear() {
        return copyrightYear;
    }

    public void setCopyrightYear(String copyrightYear) {
        this.copyrightYear = copyrightYear;
    }

    public String getChapters() {
        return chapters;
    }

    public void setChapters(String chapters) {
        this.chapters = chapters;
    }

    public Book1(int numOfPages, String title, String copyrightYear, String chapters) {
        this.numOfPages = numOfPages;
        this.title = title;
        this.copyrightYear = copyrightYear;
        this.chapters = chapters;
    }
    
    
}
