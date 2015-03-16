package org.krisdrum.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by chris on 2015-02-25.
 */
public class App {
    public static void main(String[] args) {
        App app = new App();

//        app.tutorials_1_13();
//        app.tutorials_14();
//        app.tutorials_15_16();
//        app.tutorials_17();
        app.tutorials_18();
    }

    private void tutorials_1_13() {
        ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");


        Person person = (Person) context.getBean("person");

        person.setTaxId(666);

        Address address = (Address) context.getBean("address");

        System.out.println(person);

        Address address2 = (Address) context.getBean("address2");
        System.out.println(address2);

        ((FileSystemXmlApplicationContext) context).close();
    }

    private void tutorials_14() {
        ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");

        FruitBasket basket = (FruitBasket)context.getBean("fruitBasket");
        System.out.println(basket);

        ((FileSystemXmlApplicationContext) context).close();
    }

    private void tutorials_15_16() {
        ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");

        Jungle jungle = (Jungle)context.getBean("jungle");
        System.out.println(jungle);

        ((FileSystemXmlApplicationContext) context).close();
    }

    private void tutorials_17() {
        ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");

        Jungle2 jungle = (Jungle2)context.getBean("jungle2");
        System.out.println(jungle);

        ((FileSystemXmlApplicationContext) context).close();
    }

    private void tutorials_18() {
        ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");

        Jungle3 jungle = (Jungle3)context.getBean("jungle3");
        System.out.println(jungle);

        ((FileSystemXmlApplicationContext) context).close();
    }
}
