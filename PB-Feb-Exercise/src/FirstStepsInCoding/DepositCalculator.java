package FirstStepsInCoding;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("sum = ");
        double deposited_amount = Double.parseDouble(scanner.nextLine());
        System.out.print("months = ");
        int months = Integer.parseInt(scanner.nextLine());
        System.out.print("percent = ");
        double percent = (Double.parseDouble(scanner.nextLine()))/100;
        double amount = deposited_amount+months*((deposited_amount*percent)/12);
        System.out.println(amount);
    }
}
