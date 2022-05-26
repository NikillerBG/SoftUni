package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class SkiHoliday_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int nights = days - 1;
        String type = scanner.nextLine();
        String review = scanner.nextLine();
        double price = 0;
        switch (type) {
            case "room for one person":
                price = nights * 18.00;
                break;
            case "apartment":
                price = nights * 25.00;
                if (days < 10) {
                    price = price * 0.7;
                } else if (days >= 10 && days <= 15) {
                    price = price * 0.65;
                } else if (days > 15) {
                    price = price * 0.5;
                }
                break;
            case "president apartment":
                price = nights * 35.00;
                if (days < 10) {
                    price = price * 0.9;
                } else if (days >= 10 && days <= 15) {
                    price = price * 0.85;
                } else if (days > 15) {
                    price = price * 0.8;
                }
                break;
        }
        if (review.equals("negative")) {
            price *= 0.9;
        } else if (review.equals("positive")) {
            price *= 1.25;
        }
        System.out.printf("%.2f", price);
    }
}
