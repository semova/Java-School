package week1;

import java.util.Scanner;

public class SumCalculator {
        public static void main(String args[]){
            Scanner summa = new Scanner(System.in);
            double firstnumber, secondnumber, answer;
            System.out.println("Enter the first number: ");
            firstnumber = summa.nextDouble();
            System.out.println("Enter the second number: ");
            secondnumber = summa.nextDouble();
            answer = firstnumber + secondnumber;
            System.out.println("Your answer: " + answer);

            System.out.println(summa.nextLine());
        }
    }
