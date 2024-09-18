package org.example;

public class Person {
    String firstname;
    String lastName;
    int age;
    String education;
    String from;
    int num;


    public Person(String firstname, String lastName, int age){
        this.firstname = firstname;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstname, String lastName, int age,  String education, String from, int num){
        this(firstname, lastName, age);
        this.education = education;
        this.from = from;
        this.num = num;
    }

    public String getFirstName(){
        return this.firstname;
    }
    public String getLastName(){
        return this.lastName;
    }
    public int getAge(){
        return this.age;
    }
    public Boolean isTeen(){
        if (this.age < 13 || this.age > 19) {
            return false;
        }
        return true;

    }

}
