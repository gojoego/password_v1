package com.password.main.exception;

public class PasswordNotFoundException extends Exception {

    private int idnew_hires;
    public PasswordNotFoundException(int idnew_hires){
        super(String.format("User not found",idnew_hires));
    }

}
