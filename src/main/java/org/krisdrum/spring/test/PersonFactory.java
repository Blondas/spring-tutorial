package org.krisdrum.spring.test;

/**
 * Created by chris on 2015-02-26.
 */
public class PersonFactory {
    public Person createPerson(int id, String name) {
        System.out.println("Using factory to create person.");
        return new Person(id, name);
    }
}
