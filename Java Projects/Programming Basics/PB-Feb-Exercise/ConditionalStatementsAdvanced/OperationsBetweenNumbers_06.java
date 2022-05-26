package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class OperationsBetweenNumbers_06 {
    public static void EvenOrOdd(double result) {
        if (result % 2 == 0) {
            System.out.println(" - even");
        } else {
            System.out.println(" - odd");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        double result = 0;
        switch (operator) {
            case "+":
                result = n1 + n2;
                System.out.printf("%d + %d = %.0f", n1, n2, result);
                EvenOrOdd(result);
                break;
            case "-":
                result = n1 - n2;
                System.out.printf("%d - %d = %.0f", n1, n2, result);
                EvenOrOdd(result);
                break;
            case "*":
                result = n1 * n2;
                System.out.printf("%d * %d = %.0f", n1, n2, result);
                EvenOrOdd(result);
                break;
            case "/":
                if (n2 == 0) {
                    System.out.printf("Cannot divide %d by zero", n1);
                } else {
                    result = n1 / (1.0 * n2);
                    System.out.printf("%d / %d = %.2f", n1, n2, result);
                }
                break;
            case "%":
                if (n2 == 0) {
                    System.out.printf("Cannot divide %d by zero", n1);
                } else {
                    result = n1 % n2;
                    System.out.printf("%d %% %d = %.0f", n1, n2, result);
                }
                break;
        }

    }
}
