package src.odyssey.java.assignments.loops;

public class FIzz_Buzz_Do_WhileLoop {
    public static void main(String[] args) {
        int i=1;

        do
            {
            if((i%3==0) && (i%5==0)){
                System.out.println("Fizz-Buzz");
            }
            else if(i%3==0){
                System.out.println("Fizz");
            }else if(i%5==0){
                System.out.println("Buzz");}
            else{
                System.out.println(i);
            }
            i++;
        }
        while(i<=20);

    }
}
