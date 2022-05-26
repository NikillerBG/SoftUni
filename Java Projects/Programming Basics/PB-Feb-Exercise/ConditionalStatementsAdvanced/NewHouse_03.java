package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class NewHouse_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double priceRoses = 5;
        double priceDahlias = 3.80;
        double priceTulips = 2.80;
        double priceNarcissus = 3;
        double priceGladiolus = 2.50;
        double price = 0;
        switch (type) {
            case "Roses":
                price = count * priceRoses;
                if (count > 80) {
                    price = price * 0.9;
                }
                break;
            case "Dahlias":
                price = count * priceDahlias;
                if (count > 90) {
                    price = price * 0.85;
                }
                break;
            case "Tulips":
                price = count * priceTulips;
                if (count > 80) {
                    price = price * 0.85;
                }
                break;
            case "Narcissus":
                price = count * priceNarcissus;
                if (count < 120) {
                    price = price * 1.15;
                }
                break;
            case "Gladiolus":
                price = count * priceGladiolus;
                if (count < 80) {
                    price = price * 1.2;
                }
                break;
        }
        double diff = Math.abs(budget - price);
        if (price <= budget) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", count, type, diff);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", diff);
        }
    }
}

