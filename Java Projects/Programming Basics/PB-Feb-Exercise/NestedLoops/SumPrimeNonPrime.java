package NestedLoops;

import java.util.Scanner;

public class SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int primeSum = 0;
        int nonPrimeSum = 0;
        String input = scanner.nextLine();
        while (!input.equals("stop")) {
            int number = Integer.parseInt(input);
            boolean isPrime = true;
            if (number<0){
                System.out.println("Number is negative.");
                input = scanner.nextLine();
                continue;
            }
            for (var i = 2; i < number; i++) {
                if (number % i == 0) {
                    nonPrimeSum += number;
                    isPrime = false;
                    break;
                }
            }
            if (isPrime == true){
                primeSum+=number;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Sum of all prime numbers is: %d %nSum of all non prime numbers is: %d", primeSum, nonPrimeSum);
    }
}

