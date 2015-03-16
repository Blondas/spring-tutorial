package org.krisdrum.spring.test.tutorial24;

/**
 * Created by chris on 2015-02-27.
 */
public class ConsoleWriter implements LogWriter {
    public void write(String text) {
        System.out.println(text);
    }
}
