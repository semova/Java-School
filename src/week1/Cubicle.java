package week1;

import java.util.Scanner;

public class Cubicle {
    public static void main(String[] args) {
        Scanner cubic = new Scanner(System.in);

        System.out.println("Enter your number: ");
        double mynumber = cubic.nextDouble();
        
        // till that moment everything is fine
        // below you need check whether entered number is a cube of natural number, like for ex. 3 * 3 * 3 = 27, 27 is a Cubic number
        
        double result = Math.sqrt(mynumber);

        System.out.println("The square root of " +mynumber + " is: " + result);

    }
}
