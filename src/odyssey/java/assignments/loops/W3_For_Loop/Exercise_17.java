package homework.java.shamim.Loop.W3_While_Loop;

import java.util.Scanner;

public class Exercise_17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i,j,n=0,spc,k=1;
        spc= n+4;
        System.out.println("Please enter your number: ");
        n= scan.nextInt();
        System.out.println("Entered number is: "+ n);
        for (i=1; i<=n; i++){
            for(k=spc; k>=1; k--)
            {
            System.out.print(" ");
            }
            for(j=1; j<=i; j++)
                System.out.print(i+ " ");
                System.out.println("");
                spc--;
        }
    }
}
