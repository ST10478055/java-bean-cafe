package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Customer customer = new Customer("Tayler");

        int choice;

        do {
            System.out.println("\n- Java Bean Cafe -");
            System.out.println("1. Buy Coffee (+10 pts)");
            System.out.println("2. Redeem Reward (50 pts)");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            choice = input.nextInt();

            switch (choice) {
                case 1:
                    customer.addPoints();
                    break;
                case 2:
                    customer.redeemPoints();
                    break;
                case 3:
                    customer.displayStatus();
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 4);

        input.close();
    }
}