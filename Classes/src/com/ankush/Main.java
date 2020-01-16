package com.ankush;

public class Main {

    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.6, "White");
        double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAddition1("Tomato", 0.32);
        hamburger.addHamburgerAddition2("Lettuce", 0.24);
        hamburger.addHamburgerAddition3("Cheese", 0.17);
        System.out.println("Total Burger price is " + hamburger.itemizeHamburger());
    }
}
