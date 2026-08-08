package com.encapsulation;

public class User {
    // evry class default value is null String is DataType and Class also
    private String username;
    private String password;

    //getter method for username
    public String getUsername() {
        return username;
    }

    //setter method for username
    public void setUsername(String username) {
        this.username = username;
    }

    //getter for password
    public String getPassword(){
        return password;
    }

    //setter for password
    public void setPassword(String password){
        this.password = password;
    }
}
