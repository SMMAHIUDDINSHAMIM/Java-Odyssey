package src.odyssey.java.assignments.loops.W3_For_Loop;

import java.util.Scanner;

public class Exercise_15 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Please enter your number: ");
        int i,f=1, num;
        num = reader.nextInt();
        System.out.println("Your entered number is: " + num);
        for (i=1; i<=num; i++) {
            f = f*i;
        }
        System.out.println("The factorial value of entered number is: " +(num + f));
    }
}
