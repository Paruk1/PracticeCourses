package com.alfabank.work16;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age) throws InvalidAgeException{
        if(age < 0 || age > 120){
            throw new InvalidAgeException("Range of [1 : 120]");
        }
        this.age = age;
    }
}
