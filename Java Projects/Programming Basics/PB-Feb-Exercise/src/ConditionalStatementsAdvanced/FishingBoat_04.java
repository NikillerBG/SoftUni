package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class FishingBoat_04 {
    public static double PriceForBoat(int fishermans, double priceForBoat) {
        if (fishermans <= 6) {
            priceForBoat *= 0.9;
        } else if (fishermans >= 7 && fishermans <= 11) {
            priceForBoat *= 0.85;
        } else if (fishermans >= 12) {
            priceForBoat *= 0.75;
        }
        return priceForBoat;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishermans = Integer.parseInt(scanner.nextLine());
        double priceForBoat = 0;
        switch (season) {
            case "Spring":
                priceForBoat = 3000;
                priceForBoat = PriceForBoat(fishermans, priceForBoat);
                if (fishermans % 2 == 0) {
                    priceForBoat *= 0.95;
                }
                break;
            case "Summer":
                priceForBoat = 4200;
                priceForBoat = PriceForBoat(fishermans, priceForBoat);
                if (fishermans % 2 == 0) {
                    priceForBoat *= 0.95;
                }
                break;
            case "Autumn":
                priceForBoat = 4200;
                priceForBoat = PriceForBoat(fishermans, priceForBoat);
                break;
            case "Winter":
                priceForBoat = 2600;
                priceForBoat = PriceForBoat(fishermans, priceForBoat);
                if (fishermans % 2 == 0) {
                    priceForBoat *= 0.95;
                }
                break;
        }
        var diff = Math.abs(budget - priceForBoat);
        if (budget >= priceForBoat) {
            System.out.printf("Yes! You have %.2f leva left.", diff);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", diff);
        }
    }
}
