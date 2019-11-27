package com.claim;

public class Person {
    private String firstName, middle1, middle2, lastName;

    public Person() {
        this("", "", "");
    }

    public Person(String firstName, String middle1, String middle2, String lastName) {
        this.firstName = firstName;
        this.middle1 = middle1;
        this.middle2 = middle2;
        this.lastName = lastName;
    }

    public Person(String firstName, String middle1, String lastName) {
        this.firstName = firstName;
        this.middle1 = middle1;
        this.lastName = lastName;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getMiddle1() {
        return middle1;
    }

    public void setMiddle1(String middle1) {
        this.middle1 = middle1;
    }

    public String getMiddle2() {
        return middle2;
    }

    public void setMiddle2(String middle2) {
        this.middle2 = middle2;
    }

    public String getFirstName() {
        System.out.println(firstName);
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddle() {
        System.out.println(middle1);
        return middle1;
    }

    public void setMiddle(String middle) {
        this.middle1 = middle;
    }

    public String getLastName() {
        System.out.println(lastName);
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String toString() {
        if (middle2 != null) {
            return firstName + middle1 + middle2 + lastName;
        } else if (middle2 == null) {
            return firstName + middle1 + lastName;
        } else {
            return firstName + lastName;

        }
    }
}
