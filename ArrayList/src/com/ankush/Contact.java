package com.ankush;

import java.util.Scanner;

public class Contact {
    private String name;
    private String number;

    public Contact(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public static Contact fetchContact() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name: ");
        String a = sc.nextLine();
        System.out.println("Enter Number: ");
        String b = sc.nextLine();
        return new Contact(a, b);
    }

    public void printContact() {
        System.out.println("Contact Name: " + this.name + ". Contact Number: " + this.number);
    }
}
