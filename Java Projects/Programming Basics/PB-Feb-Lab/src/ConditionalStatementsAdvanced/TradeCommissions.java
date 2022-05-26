package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String town = scanner.nextLine();
        double amount = Double.parseDouble(scanner.nextLine());
        double commission = 0.0;
        switch (town) {
            case "Sofia":
                if (0 <= amount && amount <= 500) {
                    commission = 5;
                } else if (amount <= 1000) {
                    commission = 7;
                } else if (amount <= 10000) {
                    commission = 8;
                } else if (amount > 10000) {
                    commission = 12;
                }
                break;
            case "Varna":
                if (0 <= amount && amount <= 500) {
                    commission = 4.5;
                } else if (amount <= 1000) {
                    commission = 7.5;
                } else if (amount <= 10000) {
                    commission = 10;
                } else if (amount > 10000) {
                    commission = 13;
                }
                break;
            case "Plovdiv":
                if (0 <= amount && amount <= 500) {
                    commission = 5.5;
                } else if (amount <= 1000) {
                    commission = 8;
                } else if (amount <= 10000) {
                    commission = 12;
                } else if (amount > 10000) {
                    commission = 14.5;
                }
                break;
        }
        double tradeCommission = amount * commission / 100;
        if (tradeCommission != 0) {
            System.out.printf("%.2f", tradeCommission);
        } else {
            System.out.println("error");
        }
    }
}
