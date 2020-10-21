package src.odyssey.java.assignments.loops.W3_For_Loop;

import java.util.Scanner;

public class Exercise_13 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int i, j,spc, k, t=1, rows = 0;
        System.out.println("Please enter number of rows: ");
        rows = reader.nextInt();
        System.out.println("Input number of rows: ");
        spc=rows;
        for(i=1;i<=rows;i++)
        {
            for(k=spc;k>=1;k--)
            {
                System.out.print(" ");
            }
            for(j=1;j<=i;j++)
                System.out.print(" " + t++);
            System.out.println(" ");
            spc--;
    }

    }}
