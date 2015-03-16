package org.krisdrum.spring.test.tutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by chris on 2015-02-27.
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");

        Logger logger = (Logger)context.getBean("logger");

        logger.writeConsole("Hello there");
        logger.writeFile("Hi again");

        ((FileSystemXmlApplicationContext) context).close();
    }
}
