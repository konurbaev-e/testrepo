package org.abrakadabra;

import java.util.Arrays;
import java.util.List;

public class Car {
    private Person person;

    public static void main(String[] args) {
        Person president = new Person();
        String myFirstName = president.getFirstName();
        president.showFirstName(4);

        List<String> stringList = Arrays.asList("1", "2","3");
        stringList.forEach(input -> Person.print("2"));
    }
}
