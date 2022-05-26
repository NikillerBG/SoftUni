package ConditionalStatements;

import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int points = Integer.parseInt(scanner.nextLine());
        double bonus = 0;
        if (points <= 100) {
            bonus = 5;
        } else if (points > 100 && points <= 1000) {
            bonus = 0.2 * points;
        } else if (points > 1000) {
            bonus = 0.1 * points;
        }

        if (points % 2 == 0) {
            bonus++;
        }
        if (points % 10 == 5) {
            bonus += 2;
        }
        var total = points + bonus;
        System.out.println(bonus);
        System.out.print(total);
    }
}
