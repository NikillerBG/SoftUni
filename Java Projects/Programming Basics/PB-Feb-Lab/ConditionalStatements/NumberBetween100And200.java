package ConditionalStatements;

import java.util.Scanner;

public class NumberBetween100And200 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        if (num1 < 100) {
            System.out.print("Less than 100");
        } else if (100 <= num1 && num1 <= 200) {
            System.out.print("Between 100 and 200");
        } else {
            System.out.print("Greater than 200");
        }
    }
}
