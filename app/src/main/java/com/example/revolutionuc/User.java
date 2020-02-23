package com.example.revolutionuc;

public class User {
String UserID;
String UserName;
String UserUsername;
String UserPassword;

public User(){

}

    public User(String userID, String userName, String userUsername, String userPassword) {
        this.UserID = userID;
        this.UserName = userName;
        this.UserUsername = userUsername;
        this.UserPassword = userPassword;
    }

    public String getUserID() {
        return UserID;
    }

    public String getUserName() {
        return UserName;
    }

    public String getUserUsername() {
        return UserUsername;
    }

    public String getUserPassword() {
        return UserPassword;
    }
}
