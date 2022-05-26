package ConditionalStatements;

import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameOfSeries = scanner.nextLine();
        int episodeDuration = Integer.parseInt(scanner.nextLine());
        int breakDuration = Integer.parseInt(scanner.nextLine());
        var timeForSeries = breakDuration - 0.125 * breakDuration - 0.25 * breakDuration;
        var diff = Math.abs(episodeDuration - timeForSeries);
        if (timeForSeries < episodeDuration) {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", nameOfSeries, Math.ceil(diff));
        } else {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", nameOfSeries, Math.ceil(diff));
        }
    }
}
