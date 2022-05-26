package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class Journey_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        String destination = "";
        double price = 0;
        String type = "";
        if (budget <= 100) {
            destination = "Bulgaria";
            switch (season) {
                case "winter":
                    price = 0.7 * budget;
                    type = "Hotel";
                    break;
                case "summer":
                    price = 0.3 * budget;
                    type = "Camp";
                    break;
            }
        } else if (budget <= 1000) {
            destination = "Balkans";
            switch (season) {
                case "winter":
                    price = 0.8 * budget;
                    type = "Hotel";
                    break;
                case "summer":
                    price = 0.4 * budget;
                    type = "Camp";
                    break;
            }
        } else if (budget > 1000) {
            destination = "Europe";
            switch (season) {
                case "winter":
                case "summer":
                    price = 0.9 * budget;
                    type = "Hotel";
                    break;
            }
        }
        System.out.printf("Somewhere in %s", destination);
        System.out.println();
        System.out.printf("%s - %.2f", type, price);
    }
}
