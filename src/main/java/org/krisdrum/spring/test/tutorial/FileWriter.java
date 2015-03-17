package org.krisdrum.spring.test.tutorial;

public class FileWriter implements LogWriter {
    public void write(String text) {
        System.out.println(text);
    }
}
