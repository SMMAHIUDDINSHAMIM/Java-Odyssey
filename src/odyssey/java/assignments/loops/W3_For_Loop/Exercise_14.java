package src.odyssey.java.assignments.loops.W3_For_Loop;
import java.util.Scanner;
public class Exercise_14 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int i,j,k, spc , rows=0;
        System.out.println("Please enter number of rows: ");
        rows = reader.nextInt();
        System.out.println("Input number of rows: ");
        spc = rows+4-1;
        for (i=1; i<=rows; i++){
            for(k= spc; k>=1; k--) {
                System.out.print(" ");
            }
            for(j=1; j<=i; j++)
                System.out.print("* ");
            System.out.println("");
            spc--;
        }

    }
}
