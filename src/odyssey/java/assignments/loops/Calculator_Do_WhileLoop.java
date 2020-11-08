package src.odyssey.java.assignments.loops;

import java.util.Scanner;

public class Calculator_Do_WhileLoop {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int choice;
        do {
            System.out.println("Welcome to our Calculator: ");
            System.out.println("Press 1 for Addition. \nPress 2 for Deletion. \nPress 3 for multiplication. \nPress 4 for Divisopn. \nPress 5 for Exit. ");

            System.out.println("Please enter your choice:");
            choice = reader.nextInt();

            switch (choice) {
                case 1: {
                    System.out.println("Welcome to the addition world!!!!");
                    System.out.println("Please enter your 1st number: ");
                    int num1 = reader.nextInt();
                    System.out.println("Please enter your 2nd number: ");
                    int num2 = reader.nextInt();
                    int result = num1 + num2;
                    System.out.println("The addition result is: " + result);
                }
                break;

                case 2: {
                    System.out.println("Welcome to the deletion world!!!");
                    System.out.println("Please enter your 1st number: ");
                    int num1 = reader.nextInt();
                    System.out.println("Please enter your 2nd number: ");
                    int num2 = reader.nextInt();
                    int result = num1 - num2;
                    System.out.println("The deletion result is: " + result);
                }
                break;

                case 3: {
                    System.out.println("Welcome to the multiplication world!!!");
                    System.out.println("Please enter your 1st number: ");
                    int num1 = reader.nextInt();
                    System.out.println("Please enter your 2nd number: ");
                    int num2 = reader.nextInt();
                    int result = num1 * num2;
                    System.out.println("The multiplication result is: " + result);
                }
                break;

                case 4: {
                    System.out.println("Welcome to the division world!!!");
                    System.out.println("please enter your 1st number: ");
                    double num1 = reader.nextInt();
                    System.out.println("Please enter your 2nd number: ");
                    double num2 = reader.nextInt();
                    double result = num1 / num2;
                    System.out.println("The division result is: " + result);
                }
                break;

                case 5: {
                    System.out.println("Thanks for using the app !!!! ");
                    System.exit(0);
                }
                break;

                default:
                    System.out.println("Wrong choice. Try again...");

            }
        }
        while (choice != 5);
    }
}