package com.claim;

public class Entry {
    private Person person;
    private Address address;
    private PhoneNumber phoneNumber;

    public Entry() {
        this(new Person(
                        "", "", ""),
                new Address("", "", "", "", ""),
                new PhoneNumber(""));
    }

    public Entry(Person person, Address address, PhoneNumber phoneNumber) {
        this.person = person;
        this.address = address;
        this.phoneNumber = phoneNumber;

    }


    public Person getPerson() {
        return person;
    }

    public Address getAddress() {
        return address;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    public String toString() {

        return person.toString() + address.toString() + phoneNumber.toString();
    }

    //    METHODS
}
