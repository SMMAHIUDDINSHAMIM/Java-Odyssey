package src.odyssey.java.assignments.loops.W3_For_Loop;

import java.util.Scanner;

public class Exercise_11 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int i,j,row=0;
        System.out.println("Please enter number of rows: ");
        row = reader.nextInt();
        System.out.println("Number of rows: "+row);
        for (i=1; i<=row; i++) {
            for (j = 1; j <= i; j++)
                System.out.print(i);
            System.out.println(" ");
        }
    }
}
