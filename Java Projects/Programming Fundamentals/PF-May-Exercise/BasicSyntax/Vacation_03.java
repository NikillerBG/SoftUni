package BasicSyntax;

import java.util.Scanner;

public class Vacation_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int peopleCount = Integer.parseInt(scanner.nextLine());
        String ticketType = scanner.nextLine();
        String weekDay = scanner.nextLine();
        double priceForTicket = 0.0;
        switch(weekDay){
            case "Sunday":
                if (ticketType.equals("Students")){
                    priceForTicket = 10.46;
                }else if (ticketType.equals("Business")){
                    priceForTicket = 16.00;
                }else if (ticketType.equals("Regular")){
                    priceForTicket = 22.50;
                }
                break;
            case "Saturday":
                if (ticketType.equals("Students")){
                    priceForTicket = 9.80;
                }else if (ticketType.equals("Business")){
                    priceForTicket = 15.60;
                }else if (ticketType.equals("Regular")){
                    priceForTicket = 20.00;
                }
                break;
            case "Friday":
                if (ticketType.equals("Students")){
                    priceForTicket = 8.45;
                }else if (ticketType.equals("Business")){
                    priceForTicket = 10.90;
                }else if (ticketType.equals("Regular")){
                    priceForTicket = 15.00;
                }
                break;
        }
        double total = peopleCount * priceForTicket;
        if (ticketType.equals("Students")&&peopleCount>=30){
            total*=0.85;
        }else if (ticketType.equals("Business")&&peopleCount>=100){
            total = (peopleCount-10)*priceForTicket;
        }else if (ticketType.equals("Regular")&&peopleCount>=10&&peopleCount<=20) {
            total *= 0.95;
        }
        System.out.printf("Total price: %.2f", total);
    }
}
