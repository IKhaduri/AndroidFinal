package com.example.irakli.finalproject.service;

public class UserDetails {
    private String UserId;
    private String Username;
    private String Name;
    private String LastName;
    private String PhoneForSms;
    private boolean Active;

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String userId) {
        UserId = userId;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getPhoneForSms() {
        return PhoneForSms;
    }

    public void setPhoneForSms(String phoneForSms) {
        PhoneForSms = phoneForSms;
    }

    public boolean isActive() {
        return Active;
    }

    public void setActive(boolean active) {
        Active = active;
    }

}
