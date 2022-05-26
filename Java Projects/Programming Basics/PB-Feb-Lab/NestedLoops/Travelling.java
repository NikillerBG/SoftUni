package NestedLoops;

import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!input.equals("End")) {
            double neededAmount = Double.parseDouble(scanner.nextLine());
            double totalAmount = 0;
            while (totalAmount < neededAmount) {
                totalAmount += Double.parseDouble(scanner.nextLine());
            }
            System.out.printf("Going to %s!%n", input);
            input = scanner.nextLine();
        }
    }
}
