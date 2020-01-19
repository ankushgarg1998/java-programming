package com.ankush;

import com.ankush.Contact;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> contacts;

    // CONSTRUCTOR
    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.contacts = new ArrayList<Contact>();
    }

    // PUBLIC FUNCTIONS
    public void printAllContacts() {
        printContacts();
    }

    public void addNewContact() {
        Contact newContact = Contact.fetchContact();
        if(findContactByName(newContact.getName()) != null)
            System.out.println("Contact already exists.");
        else {
            addContact(newContact);
            System.out.println("Contact added successfully.");
        }
    }

    public void searchForAContact() {
        Contact c = getContactByInputName();
        if(c != null) {
            c.printContact();
        }
    }

    public void removeContact() {
        Contact c = getContactByInputName();
        if(c != null) {
            removeThisContact(c);
            System.out.println("Contact deleted successfully.");
        }
    }

    public void updateContact() {
        Contact c = getContactByInputName();
        if(c != null) {
            System.out.println("Enter new contact details:");
            Contact newContact = Contact.fetchContact();
            updateThisContact(c, newContact);
            System.out.println("Contact update successfully.");
        }
    }


    // PRIVATE FUNCTIONS
    private void addContact(Contact contact) {
        contacts.add(contact);
    }

    private void removeThisContact(Contact c) {
        contacts.remove(c);
    }

    private void updateThisContact(Contact old, Contact c) {
        contacts.set(contacts.indexOf(old), c);
    }

    private Contact findContactByName(String name) {
        for(int i=0; i<contacts.size(); i++) {
            if(name.equals(contacts.get(i).getName())) {
                return contacts.get(i);
            }
        }
        return null;
    }

    private void printContacts() {
        if(contacts.size() == 0)
            System.out.println("No contacts available.");
        for(int i=0; i<contacts.size(); i++)
            contacts.get(i).printContact();
        System.out.println("---");
    }

    private Contact getContactByInputName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name to search for: ");
        String search = sc.nextLine();
        Contact c = findContactByName(search);
        if(c != null)
            return c;
        else {
            System.out.println("No contact with the name \"" + search + "\" exists.");
            return null;
        }
    }
}
