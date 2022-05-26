package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class HotelRoom_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());
        double apartmentPrice = 0;
        double studioPrice = 0;
        switch (month) {
            case "May":
            case "October":
                studioPrice = 50 * nights;
                apartmentPrice = 65 * nights;
                if (nights > 7 && nights <= 14) {
                    studioPrice = studioPrice * 0.95;
                } else if (nights > 14) {
                    studioPrice = studioPrice * 0.70;
                }
                break;
            case "June":
            case "September":
                studioPrice = 75.20 * nights;
                apartmentPrice = 68.70 * nights;
                if (nights > 14) {
                    studioPrice = studioPrice * 0.80;
                }
                break;
            case "July":
            case "August":
                studioPrice = 76 * nights;
                apartmentPrice = 77 * nights;
                break;
        }
        if (nights > 14) {
            apartmentPrice = apartmentPrice * 0.9;
        }
        System.out.printf("Apartment: %.2f lv.", apartmentPrice);
        System.out.println();
        System.out.printf("Studio: %.2f lv.", studioPrice);
    }
}
