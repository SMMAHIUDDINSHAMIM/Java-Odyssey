package src.odyssey.java.assignments.loops;

public class Fizz_buzz_While_loop {
    public static void main(String[] args) {
        int i=1;
        while(i<=20){
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
    }

}
