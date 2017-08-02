package com.example.adrian.android_java_diffutil;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Adrian_Czigany on 8/2/2017.
 */

public final class DataProvider {

    public static List<Person> getDefaultPersonList() {
        List<Person> persons = new ArrayList<>();

        persons.add(new Person(12, 12, "Michael"));
        persons.add(new Person(14, 14, "Rafael"));
        persons.add(new Person(16, 16, "John"));
        persons.add(new Person(18, 18, "John"));

        return persons;
    }

    public static List<Person> getNewPersonList() {
        List<Person> persons = new ArrayList<>();

//        persons.add(new Person(5, 5, "Michael"));
//        persons.add(new Person(6, 6, "Jack"));
//        persons.add(new Person(7, 7, "Rafael"));
//        persons.add(new Person(8, 8, "John"));
//        persons.add(new Person(9, 9, "John"));
//        persons.add(new Person(10, 10, "John"));
//        persons.add(new Person(11, 11, "John"));

        persons.add(new Person(12, 12, "Michael"));
        persons.add(new Person(13, 13, "Jack"));
        persons.add(new Person(14, 14, "Rafael"));
        persons.add(new Person(15, 15, "John"));
        persons.add(new Person(16, 16, "John"));
        persons.add(new Person(17, 17, "John"));
        persons.add(new Person(18, 18, "John"));

        return persons;
    }

}
