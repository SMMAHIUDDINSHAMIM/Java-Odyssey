package src.odyssey.java.assignments.loops.W3_For_Loop;
import java.util.Scanner;

public class Exercise_12 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int i, j, k=1, row = 0;
        System.out.println("Please enter number of rows: ");
        row = reader.nextInt();
        for (i=1; i<=row; i++){
            for(j=1; j<=i; j++)
                System.out.print(k++ +" ");
            System.out.println(" ");
        }
    }}