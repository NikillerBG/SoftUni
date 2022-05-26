package FirstStepsInCoding;

import java.util.Scanner;

public class VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("pages = ");
        int pages = Integer.parseInt(scanner.nextLine());
        System.out.print("pages per hour = ");
        int pages_per_hour = Integer.parseInt(scanner.nextLine());
        System.out.print("days = ");
        int days = Integer.parseInt(scanner.nextLine());
        int hours_per_day = pages/(pages_per_hour*days);
        System.out.print(hours_per_day);
    }
}
