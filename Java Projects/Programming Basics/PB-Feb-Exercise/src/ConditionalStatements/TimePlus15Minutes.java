package ConditionalStatements;

import java.util.Scanner;

public class TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        int total = hours * 60 + minutes + 15;
        hours = total / 60;
        minutes = total % 60;
        if (hours > 23) {
            hours = hours - 24;
        }
        if (minutes < 10) {
            System.out.printf("%d:0%d", hours, minutes);
        } else {
            System.out.printf("%d:%d", hours, minutes);
        }

    }
}
