/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tk.dvdlibrary.dto;

/**
 *
 * @author Tanner Kendall
 */
public class DVD {
    
    private String title;
    private String releaseDate;
    private String mpaaRating;
    private String director;
    private String studio;
    private String userRating;
    //private boolean valid;

    public DVD(String title){
        this.title = title;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getMpaaRating() {
        return mpaaRating;
    }

    public void setMpaaRating(String mpaaRating) {
        if(mpaaRating.equalsIgnoreCase("G") || mpaaRating.equalsIgnoreCase("PG") || 
                mpaaRating.equalsIgnoreCase("PG13") || mpaaRating.equalsIgnoreCase("PG-13") || mpaaRating.equalsIgnoreCase("R") || mpaaRating.equalsIgnoreCase("Unrated")){
            this.mpaaRating = mpaaRating;
        } else {
            this.mpaaRating = "Unrated";
        }
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public String getUserRating() {
        return userRating;
    }

    public void setUserRating(String userRating) {
        this.userRating = userRating;
    }
    
    
    
}
