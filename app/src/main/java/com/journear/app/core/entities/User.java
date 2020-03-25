package com.journear.app.core.entities;

public class User {
    private int userID;
    private int userRatings;

    public User(){

    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getUserRatings() {
        return userRatings;
    }

    public void setUserRatings(int userRatings) {
        this.userRatings = userRatings;
    }
}
