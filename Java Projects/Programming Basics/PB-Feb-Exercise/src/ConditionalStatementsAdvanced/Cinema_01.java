package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class Cinema_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());
        var all = rows * cols;
        var income = 0.0;
        switch (type) {
            case "Premiere":
                income = all * 12;
                break;
            case "Normal":
                income = all * 7.50;
                break;
            case "Discount":
                income = all * 5;
                break;
        }
        System.out.printf("%.2f leva", income);
    }
}
