package ConditionalStatements;

import java.util.Scanner;

public class GodzillaVSKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int statists = Integer.parseInt(scanner.nextLine());
        double priceForOutfit = Double.parseDouble(scanner.nextLine());
        double decorPrice = 0.10 * budget;
        double statistsClothesPrice = statists * priceForOutfit;
        if (statists > 150) {
            statistsClothesPrice = statistsClothesPrice - (statistsClothesPrice * 0.10);
        }
        double totalPrice = decorPrice + statistsClothesPrice;
        if (budget >= totalPrice) {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", Math.abs(budget - totalPrice));
        } else {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", Math.abs(budget - totalPrice));
        }
    }
}
