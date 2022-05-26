package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class OnTime_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int examHour = Integer.parseInt(scanner.nextLine());
        int examMin = Integer.parseInt(scanner.nextLine());
        int hour0fArrival = Integer.parseInt(scanner.nextLine());
        int min0fArrival = Integer.parseInt(scanner.nextLine());
        int examAllMin = examHour * 60 + examMin;
        int arrivalAllMin = hour0fArrival * 60 + min0fArrival;
        int diff = Math.abs(examAllMin - arrivalAllMin);
        var hour = diff / 60;
        var min = diff % 60;
        if (arrivalAllMin > examAllMin) {
            System.out.println("Late");
            if (diff > 0 && diff < 60) {
                System.out.printf("%d minutes after the start", diff);
            } else if (diff >= 60) {
                System.out.printf("%d:%02d minutes after the start", hour, min);
            }
        } else if (examAllMin >= arrivalAllMin && diff <= 30) {
            System.out.println("On time");
            if (diff > 0 && diff < 60) {
                System.out.printf("%d minutes before the start", diff);
            } else if (diff >= 60) {
                System.out.printf("%d:%02d minutes before the start", hour, min);
            }
        } else if (examAllMin >= arrivalAllMin && diff > 30) {
            System.out.println("Early");
            if (diff > 0 && diff < 60) {
                System.out.printf("%d minutes before the start", diff);
            } else if (diff >= 60) {
                System.out.printf("%d:%02d minutes before the start", hour, min);
            }
        }
    }
}
