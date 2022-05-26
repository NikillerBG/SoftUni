package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class InvalidNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = Double.parseDouble(scanner.nextLine());
        boolean isValid = (number <= 200 && number >= 100) || number == 0;
        if (isValid == false) {
            System.out.print("invalid");
        }
    }
}
