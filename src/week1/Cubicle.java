package week1;

import java.util.Scanner;

public class Cubicle {
    public static void main(String[] args) {
        Scanner cubic = new Scanner(System.in);

        System.out.println("Enter your number: ");
       double mynumber = cubic.nextDouble();
       double result = Math.sqrt(mynumber);

       System.out.println("The square root of " +mynumber + " is: " + result);

    }
}
