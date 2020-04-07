package com.journear.app.core.entities;

import com.journear.app.core.interfaces.Persistable;

public class User implements Persistable {


    public String userName;
    public String email;
    public String password;



    public String phoneValue;
    public String dobValue;
    public String gender;

    public User(){

    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String userID;

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneValue() {
        return phoneValue;
    }

    public void setPhoneValue(String phoneValue) {
        this.phoneValue = phoneValue;
    }

    public String getDobValue() {
        return dobValue;
    }

    public void setDobValue(String dobValue) {
        this.dobValue = dobValue;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }





}
