package src.odyssey.java.assignments.loops.W3_For_Loop;

import java.util.Scanner;

public class Exercise_18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x,t,d,sum;
        int i,n;
        System.out.println("Please input the value of x: ");
        x = scan.nextDouble();
        System.out.println("Please input number of terms: ");
        n = scan.nextInt();
        sum=1; t=1;
        for (i=1; i<n; i++){
            d= (2*i)*(2*i-1);
            t= -t*x*x/d;
            sum= sum+t;
        }
        System.out.println("The sum = "+sum);
        System.out.println("The number of term is: "+n);
        System.out.println("The value of x is: "+x);
    }
}
