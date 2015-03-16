package org.krisdrum.spring.test.tutorial;

import org.springframework.beans.factory.annotation.Qualifier;

/**
 * Created by chris on 2015-02-27.
 */
@Qualifier("filewriter")
public class FileWriter implements LogWriter {
    public void write(String text) {
        System.out.println(text);
    }
}
