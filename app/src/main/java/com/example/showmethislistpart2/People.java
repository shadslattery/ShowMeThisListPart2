package com.example.showmethislistpart2;



public class People {
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;

    public People(String FirstName, String LName, String Email, String Phone){
        this.firstName = FirstName;
        this.lastName = LName;
        this.email = Email;
        this.phoneNumber = Phone;
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
