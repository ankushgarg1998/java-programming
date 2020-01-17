package com.ankush;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        MobilePhone mobilePhone = new MobilePhone("7838765583");
        do {
            System.out.println("Select Option: ");
            System.out.println("1. Print list of contacts.");
            System.out.println("2. Add a new contact.");
            System.out.println("3. Update and existing contact.");
            System.out.println("4. Remove a contact");
            System.out.println("5. Search for a contact.");
            System.out.println("6. Quit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    mobilePhone.printAllContacts();
                    break;

                case 2:
                    mobilePhone.addNewContact();
                    break;

                case 3:
                    mobilePhone.updateContact();
                    break;

                case 4:
                    mobilePhone.removeContact();
                    break;

                case 5:
                    mobilePhone.searchForAContact();
                    break;

                default:
                    break;
            }
            if(choice != 6) {
                System.out.println("Press Enter to continue.");
                String temp = sc.nextLine();
                temp = sc.nextLine();
            }
        } while(choice != 6);
    }
}
