package src.odyssey.java.assignments.loops;
import java.util.Scanner;
public class For_Loop {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("Please enter your : ");
        int input;
        input = reader.nextInt();

        for(int i=1; i <= 10; i++){
            int result = (input*i);
            System.out.println(input + " x " + (i) + " = " + (result));
            System.out.println(" ");
            System.out.println("Thank You!!!");
        }

    }
}
