package homework.java.shamim.Loop.W3_While_Loop;

import java.util.Scanner;

public class Exercise_16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i, n, sum=0;
        System.out.println("Please input number of terms: ");
        n = scan.nextInt();
        System.out.println("Input number of terms is: " + n);
        System.out.println("The even numbers are: ");
        for (i=1; i<=n; i++){
            System.out.print(i*2 + " ");
            sum +=2*i;
        }
        System.out.println("\nThe sum of even numbers is: "+ sum);
    }
}
