package com.claim;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.println("Welcome to the phone book system. Please choose from the menu below: \n(1)Add Entry\n(2)Delete Entry\n(3)Search\n(4)Exit");
        boolean running = true;
        Entry[] entries = new Entry[1];
        Entry entry = new Entry();
        String input = sc.nextLine();


            createEntry(input);
            addToArray(createEntry(input), entries);

    }


    public static Entry createEntry(String input) {
        System.out.println("Create Entry has been called");
//        CONVERT INPUT STRING TO AN ARRAY, SEPARATED BY COMMAS
        String[] inputSplit = input.split(",");
//        check if split worked
//        for(String s: inputSplit){
//            System.out.println(s);
//        }

//        PERSON
        String firstName, middle, lastName;
        String personInput = inputSplit[0];
        String[] personInputSplit = personInput.split(" ");
        for (String s : personInputSplit) {
            System.out.println(s);
        }
        firstName = personInputSplit[0].trim();
        middle = "";
        for (int i = 1; i < personInputSplit.length - 1; i++) {
            middle += personInputSplit[i] + " ";
//            System.out.println(middle);
        }
        lastName = personInputSplit[personInputSplit.length - 1];

//       ADDRESS
        String addressInput = "";
        for (int i = 1; i < inputSplit.length - 1; i++) {
            addressInput += inputSplit[i] + "";
        }
//        addressInput = addressInput.trim();

//        System.out.println(addressInput);

        String[] addressInputSplit = addressInput.split(" ");

//        for(String s: addressInputSplit){
//            System.out.print(s);
//        }
//        System.out.println(addressInputSplit.length);

        String houseNumber, street, city, state, zip;

        houseNumber = addressInputSplit[0];

//        System.out.println(houseNumber);

        street = addressInputSplit[1] + " " + addressInputSplit[2];

//        System.out.println(street);

        city = addressInputSplit[3] + " " + addressInputSplit[4];

//        System.out.println(city);

        state = addressInputSplit[5];

//        System.out.println(state);

        zip = addressInputSplit[addressInputSplit.length - 1];

//        System.out.println(zip);

//        Phone Number
        String phoneNumber = inputSplit[inputSplit.length - 1];
//        System.out.println(phoneNumber.trim());

//        ACTUALLY CREATING THE ENTRY
        Person person = new Person(firstName, middle, lastName);
        Address address = new Address(houseNumber, street, city, state, zip);
        PhoneNumber phone = new PhoneNumber(phoneNumber);

//        System.out.println(new Entry(person, address, phone));

        return new Entry(person, address, phone);

    }

    public static Entry [] addToArray(Entry entry, Entry [] entries){
        entries[entries.length -1] = entry;
        System.out.println("Line 102 (original array): "+ entries[0] + " ArrayLength: "+entries.length);
        Entry [] newArray = new Entry[entries.length + 1];
        System.out.println("Line 104 (new larger array Array created): " + newArray[0] + " ArrayLength: "+newArray.length);
        for(int i = 0; i < entries.length; i++){
            newArray[i] = entries[i];
        System.out.println("line 107 new array: " + newArray[i]);
        }
        System.out.println("Line 109: " + newArray[0] +" ArrayLength: "+ newArray.length);
        return newArray;
    }
}
