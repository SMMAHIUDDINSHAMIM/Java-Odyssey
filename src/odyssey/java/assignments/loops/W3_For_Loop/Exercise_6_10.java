package src.odyssey.java.assignments.loops.W3_For_Loop;

import java.util.Scanner;

public class Exercise_6_10 {
    public static void main(String[] args) {
        Scanner reader =new Scanner(System.in);

        //Exercise 6:
//        System.out.println("Exercise 6: ");
//        System.out.println("Please enter your number: ");
//        int i,n;
//        n = reader.nextInt();
//        System.out.println("The multiplication table is: ");
//        for(i=1; i<=10; i++){
//            System.out.println(n + " x " + i + " = " + n*i);
//        }

        // Exercise 7:
//        System.out.println("Exercise 7: ");
//        System.out.println("Please enter your number: ");
//        int i,n;
//        n = reader.nextInt();
//        System.out.println("The multiplication table is: ");
//        for(i=1; i<=8; i++){
//            System.out.print(i + " x " + n + " = " + i*n + ", ");
//        }
        // Exercise 8:
//        System.out.println("Exercise 8: ");
//        System.out.println("The n term number is: ");
//        int i,n,sum=0;
//        n = reader.nextInt();
//        System.out.print("The odd numbers are: ");
//        for(i=1; i<=n; i++){
//            System.out.print((2*i-1)+", ");
//            sum = sum+=(2*i-1);
//        }
//        System.out.println("The sum of odd natural numbers upto n term is: "+sum);

        // Exercise 9:
//        System.out.println("Exercise 9: ");
//        System.out.println("Please input number of rows: ");
//        int i,j,row;
//        row = reader.nextInt();
//        System.out.println("Input number of rows: "+row);
//        for(i=1; i<=row; i++){
//            for(j=1;j<=i; j++)
//                System.out.print("*");
//                System.out.println(" ");
//        }
        // Exercise 10:
        System.out.println("Exercise 10: ");
        System.out.println("Please input number of rows: ");
        int i,j,row;
        row = reader.nextInt();
        System.out.println("Input number of rows: "+row);
        for(i=1; i<=row; i++){
            for(j=1; j<=i; j++)
                System.out.print(j);
            System.out.println(" ");
        }



    }
}
