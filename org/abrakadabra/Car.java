package org.abrakadabra;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Car {
    private Person person;

    String color;

    public static void main(String[] args) {
        Person president = new Person();
        String myFirstName = president.getFirstName();
        president.showFirstName(4);

        List<String> stringList = Arrays.asList("1", "2","3");
        stringList.forEach(input -> Person.print("2"));

        Map<String, String> stringMap = Collections.EMPTY_MAP;
        stringMap.containsKey("1");

    }
}
