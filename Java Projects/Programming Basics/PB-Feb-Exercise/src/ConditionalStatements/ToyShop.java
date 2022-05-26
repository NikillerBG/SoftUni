package ConditionalStatements;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double tourPrice = Double.parseDouble(scanner.nextLine());
        int puzzles = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int bears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());
        double total = puzzles * 2.60 + dolls * 3.00 + bears * 4.10 + minions * 8.20 + trucks * 2.00;
        int countToys = puzzles + dolls + bears + minions + trucks;
        if (countToys >= 50) {
            total = total - total * 25 / 100;
        }
        total = total - total * 10 / 100;
        if (total >= tourPrice) {
            System.out.printf("Yes! %.2f lv left.", total - tourPrice);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", tourPrice - total);
        }
    }
}
