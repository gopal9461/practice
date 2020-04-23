package com.company;

public class Student {
    String name;
    int roll;
    String phone;
    String address;

    public void showDetails(){
        System.out.println("Details of " + this.name);
        System.out.println(String.format("Roll: %d, Phone: %s, Address: %s", roll, phone, address));
    }
}
