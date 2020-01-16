package com.ankush;

public class HealthyBurger extends Hamburger {

    String healthyAddition1Name;
    double healthyAddition1Price;

    String healthyAddition2Name;
    double healthyAddition2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown Rye");
    }

    public void addHealthyAddition1(String name, double price) {
        this.healthyAddition1Name = name;
        this.healthyAddition1Price = price;
    }

    public void addHealthyAddition2(String name, double price) {
        this.healthyAddition2Name = name;
        this.healthyAddition2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        double hamburgerPrice =  super.itemizeHamburger();
        if(this.healthyAddition1Name != null) {
            hamburgerPrice += this.healthyAddition1Price;
            System.out.println("Added " + this.healthyAddition1Name + " for an extra " + this.healthyAddition1Price);
        }
        if(this.healthyAddition2Name != null) {
            hamburgerPrice += this.healthyAddition2Price;
            System.out.println("Added " + this.healthyAddition2Name + " for an extra " + this.healthyAddition2Price);
        }
        return hamburgerPrice;
    }
}
