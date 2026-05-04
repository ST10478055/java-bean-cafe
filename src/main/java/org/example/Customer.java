package org.example;

public class Customer {

    private final String name;
    private int points;

    // Constructor to initialize name and points

    public Customer(String name) {
        this.name = name;
        this.points = 0;
    }

    // adds 10 points

    public void addPoints() {
        points += 10;
        System.out.println("10 Points added");
    }

    // Redeems 50 points

    public void redeemPoints() {
        if (points >= 50) {
            points -= 50;
            System.out.println("Reward redeemed! Free coffee.");
        } else {
            System.out.println("Insufficient Points");
        }
    }

    // user info

    public void displayStatus() {
        System.out.println("Member information:");
        System.out.println("Name: " + name);
        System.out.println("Points: " + points);
    }

    // tests


    public int getPoints() {
        return points;
    }
}