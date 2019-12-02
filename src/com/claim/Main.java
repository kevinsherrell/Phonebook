package com.claim;

import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean running = true;
        Entry[] entries = new Entry[1];
        String addEntryGreeting = "Please Enter Your Information: ";


        while (running) {
            System.out.println("Welcome to the phone book system. Please choose from the menu below: \n(1)Add Entry\n(2)Delete Entry\n(3)Search\n(4)Exit");
            int menuChoice = sc.nextInt();

            switch (menuChoice) {
                case 1:

                    boolean addEntryRunning = true;

                    while (addEntryRunning) {
                        sc.nextLine();

                        System.out.println(addEntryGreeting);

                        String input = sc.nextLine();

                        Entry entry = createEntry(input);

                        entries = addEntry(entry, entries);

                        System.out.println("Would you like to add another entry? (y)(n)");

                        char continueEntry = sc.nextLine().charAt(0);

                        if (continueEntry == 'n') {
                            addEntryRunning = false;
                        }
                        if (continueEntry != 'y' && continueEntry != 'n') {
                            System.out.println("Invalid choice. Please enter y or n.");
                        }
                    }
                    break;
                case 2:
                    boolean searchRunning = true;
                    System.out.println(addEntryGreeting);
                    sc.nextLine();
                    String input = sc.nextLine();
                    deleteEntry(entries);
                    break;
                case 3:
                    sc.nextLine();
                    String searchInput = sc.nextLine();
                    searchEntry(entries, searchInput);
                    break;
                case 4:
                    System.out.println("Thank you for using the phone book system. Good bye.");
                    running = false;
                    break;
                default:
                    System.out.println("default has been reached");
            }
            System.out.println(entries[0].getPerson().toString());
        }
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
//        for (String s : personInputSplit) {
//            System.out.println(s);
//        }
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

    public static Entry[] addEntry(Entry entry, Entry[] entries) {

        System.out.println("Initial Array: \n" + Arrays.toString(entries));

        Entry[] newArray = new Entry[entries.length + 1];

//        System.out.println("Line 104 (new larger array Array created): " + newArray[0] + " ArrayLength: " + newArray.length);

        for (int i = 0; i < entries.length; i++) {
            newArray[i] = entries[i];
            newArray[entries.length - 1] = entry;
            System.out.println("line 107 new array: " + newArray[i]);
        }


        System.out.println("Resulting Array: \n" + Arrays.toString(newArray));


        return newArray;
    }

    public static String searchEntry(Entry[] entries, String input) {
        System.out.println("Please enter a search string: ");
        String results = "";
        for (int i = 0; i < entries.length -1; i++) {
            if (entries[i].getPerson().toString().contains(input) || entries[i].getAddress().toString().contains(input) || entries[i].getPhoneNumber().toString().contains(input)) {
                results += entries[i] + "\n";

            }
        }
        System.out.println(results);
        return results;
    }

    public static void deleteEntry(Entry[] entries) {
        System.out.println("Line 164: " + Arrays.toString(entries));
//        Search for entry
//        Loop over all entries and add all entries EXCEPT the found entry to a new array
//        Return the new array
//        Assign the new array to the entries array
    }

}
