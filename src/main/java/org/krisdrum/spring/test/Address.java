package org.krisdrum.spring.test;

/**
 * Created by chris on 2015-02-26.
 */
public class Address {
    private String street;
    private String postcode;

    public Address() {
    }

    public Address(String street, String postcode) {
        this.street = street;
        this.postcode = postcode;
    }

    public void init() {
        System.out.println("Bean created: " + this);
    }

    public void destroy() {
        System.out.println("Bean destroyed.");
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", postcode='" + postcode + '\'' +
                '}';
    }
}