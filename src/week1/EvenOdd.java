package week1;
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {

        System.out.println("Enter your number: ");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        if(i%2==0)
            System.out.println("You number is even");
        else
            System.out.println("Your number is odd");
    }
}
