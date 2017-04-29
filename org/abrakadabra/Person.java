package org.abrakadabra;

public class Person {
    private String firstName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void flush(boolean isNull, String str){
        if (isNull){
            this.firstName = null;
        } else {
            this.firstName = "";
        }
    }
}