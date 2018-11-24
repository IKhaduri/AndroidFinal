package com.example.irakli.finalproject.login;

public class Validator {
    private final String ErrorEmptyTemplate = "The %s field cannot be empty";
    private final String ErrorShortTemplate = "The %s field cannot be less than %d characters long";
    private final String ErrorConnectionString = " and ";
    private String curErrorMessage = "";
    public void validateLength(String field, String name, int minCharacterCount){
        if (field == null || field.length()==0)
            appendToErrorMessage(String.format(ErrorEmptyTemplate, name));
        else if (field.length() < minCharacterCount)
            appendToErrorMessage(String.format(ErrorShortTemplate, name, minCharacterCount));
    }

    public void clear(){
        curErrorMessage = "";
    }

    public String getErrorMessage(){
        return curErrorMessage;
    }
    private void appendToErrorMessage(String message){
        if (curErrorMessage.length()==0)
            curErrorMessage = message;
        else
            curErrorMessage += ErrorConnectionString + message;

    }

}
