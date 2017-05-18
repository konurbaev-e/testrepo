package org.abrakadabra;

import java.io.File;

public class Person implements UsedInterface {
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

    public void showFirstName(long age){
        File file;
        System.out.println(this.firstName);
    }

    private void alert(){
        String message = "hello";
        System.out.println("Alert");
    }

    public static void print(String input){
        System.out.println(input);
    }

    @Override
    public void usedMethod(String parameterInUsedMethod) {
        System.out.println(parameterInUsedMethod);
    }
}
