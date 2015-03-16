package org.krisdrum.spring.test.tutorial19;

/**
 * Created by chris on 2015-02-27.
 */
public class FileWriter implements LogWriter{
    public void write(String text) {
        System.out.println(text);
    }
}
