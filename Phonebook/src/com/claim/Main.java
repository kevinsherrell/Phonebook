package com.claim;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;


//        Person newPerson = new Person("Kevin", "M", "Sherrell ");
//        Address newAddress = new Address("1520", "Washington Ave.", "St. Louis", "MO", "63103 ");
//        PhoneNumber newPhoneNumber = new PhoneNumber("555-555-5555");
//
//        Person person2 = new Person("Marvin", "Gay");
//        Address address2 = new Address();
//        PhoneNumber phone2 = new PhoneNumber("677-555-5555");
//
//        Entry entry = new Entry(newPerson, newAddress, newPhoneNumber);
//        Entry secondEntry = new Entry(person2, address2, phone2);
//
//
//        Entry[] entries = new Entry[]{entry};
//        Entry entryStart = new Entry();
//        Entry[] entries = new Entry[] {entryStart};


        while (running) {
            System.out.println("Welcome to the phone book system. Please choose from the following menu: \n(1) Search\n(2) Add\n(3) Delete\n(4) Exit");

            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("Your choice was 1");
            } else if (choice == 2) {
                boolean addEntryRunning = true;
                while (addEntryRunning) {
//
                    System.out.println("Please enter your information : ");
                    sc.nextLine();
                    String inputString = sc.nextLine();
                    addEntry(inputString);
                    System.out.println("Would you like to add another entry? : (y)es (n)o");
//
                    char choice2 = sc.nextLine().charAt(0);
                    if (choice2 == 'y') {
                        sc.nextLine();
//

                        continue;
                    } else {
                        addEntryRunning = false;
                        break;
                    }
                }

            } else if (choice == 3) {
                System.out.println("Your choice was 3");

            } else if (choice == 4) {
                running = false;
                System.out.println("Your choice was 4");
                break;
            }
        }
    }

//    public static void createEntry(String information) {
////        CONVERT INPUT STRING TO ARRAY, SEPARATED BY COMMAS
//        String[] informationSplit = information.split(",");
////        PERSON
//        String personInfo = informationSplit[0];
//        String[] personInfoSplit = personInfo.split(" ");
////        ADDRESS
//        String addressInfo = "";
//        for (int i = 1; i <= informationSplit.length - 2; i++) {
//            addressInfo += informationSplit[i];
//        }
//        String[] addressInfoSplit = addressInfo.split(" ");
////        PHONE
//        String phoneInfo = informationSplit[informationSplit.length - 1];
//        String[] phoneInfoSplit = phoneInfo.split(" ");
//
//        Person person = new Person();
//        person.setFirstName(personInfoSplit[0]);
//        person.setLastName(personInfoSplit[personInfoSplit.length - 1]);
//        if (personInfoSplit.length == 3) {
//            person.setMiddle1(personInfoSplit[1]);
//        } else if (personInfoSplit.length == 4) {
//            person.setMiddle2(personInfoSplit[2]);
//        }
//        Address address = new Address();
////        address.setHouseNumber();
////        address.setStreet();
////        address.setCity();
////        address.setState();
////        address.setZip();
//        PhoneNumber phoneNumber = new PhoneNumber();
////        phoneNumber.setPhoneNumber();
//        Entry entry = new Entry(person, address, phoneNumber);
//        Entry[] entries = new Entry[1];
//        addEntry(entries, entry);
//    }


    public static void addEntry(String information) {
//        CONVERT INPUT STRING TO ARRAY, SEPARATED BY COMMAS
        String[] informationSplit = information.split(",");
//        Check if split worked
        for (int i = 0; i < informationSplit.length; i++) {
            System.out.println("INFORMATION STRING" + informationSplit[i]);
        }
//        PERSON
        String personInfo = informationSplit[0];
        String[] personInfoSplit = personInfo.split(" ");
//        Check if split worked
        for (String s : personInfoSplit) {
            System.out.println("PERSON INFORMATION" + s);
        }
//        ADDRESS
        String addressInfo = "";
        for (int i = 1; i < informationSplit.length - 2; i++) {
            addressInfo += informationSplit[i];
        }
        addressInfo = addressInfo.trim();
        System.out.println(addressInfo);
        System.out.println(addressInfo.trim());
        String[] addressInfoSplit = addressInfo.split(" ");
//        Check if address info split works
        for (String s : addressInfoSplit) {
            System.out.println("ADDRESS INFORMATION" + s);
        }
//        PHONE
        String phoneInfo = informationSplit[informationSplit.length - 1].trim();
        System.out.println("PHONE INFO: " + phoneInfo);

        Person person = new Person();
        System.out.println(personInfoSplit.length);
        person.setFirstName(personInfoSplit[0]);
        System.out.println("1" + person.getFirstName());
        person.setLastName(personInfoSplit[personInfoSplit.length - 1]);
        if (personInfoSplit.length > 2) {
            person.setMiddle1(personInfoSplit[1]);
        } else if (personInfoSplit.length > 4) {
            person.setMiddle2(personInfoSplit[2]);
        }
        Address address = new Address();
//        address.setHouseNumber();
//        address.setStreet();
//        address.setCity();
//        address.setState();
//        address.setZip();
        PhoneNumber phoneNumber = new PhoneNumber();
//        phoneNumber.setPhoneNumber();
//        Entry entry = new Entry(person, address, phoneNumber);

        Entry entryStart = new Entry(person, address, phoneNumber);
        Entry[] entries = new Entry[]{entryStart};

        int length = entries.length;
        Entry[] newArray = new Entry[length + 1];
        System.out.println(newArray.toString());
        for (int i = 0; i < length; i++) {
            newArray[i] = entries[i];
            System.out.println(newArray[i]);
        }
        newArray[newArray.length - 1] = entryStart;

        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i].toString());
        }
    }


}
