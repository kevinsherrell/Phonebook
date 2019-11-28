package com.claim;

public class Person {
    private String firstName, middle,  lastName;
    public Person(){
        this("","","");
    }
    public Person(String firstName, String middle, String lastName) {
        this.firstName = firstName;
        this.middle = middle;
        this.lastName = lastName;
    }
    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddle() {
        return middle;
    }

    public void setMiddle(String middle) {
        this.middle = middle;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getNameLength(){
       String [] array = new String[] {firstName, middle, lastName};
       String [] newArray = new String[array.length];
       int counter = 0;
       for(int i =0; i < array.length; i++){
           if(array[i] != null){
               counter += 1;
           }
       }
       System.out.println(counter);
       return (counter);
   }

   public String toString(){
        if(this.getNameLength() == 3){
            return firstName.trim() + " " + middle.trim() + " " + lastName.trim();
        }
        return firstName.trim() + lastName.trim();
   }

}
