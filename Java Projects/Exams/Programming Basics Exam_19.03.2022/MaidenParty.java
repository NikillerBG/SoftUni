package Exam;

import java.util.Scanner;

public class MaidenParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double price = Double.parseDouble(scanner.nextLine());
        int loveMessages = Integer.parseInt(scanner.nextLine());
        int waxRoses = Integer.parseInt(scanner.nextLine());
        int keyChain = Integer.parseInt(scanner.nextLine());
        int cartoons = Integer.parseInt(scanner.nextLine());
        int surpriseNotes = Integer.parseInt(scanner.nextLine());
        double totalPrice = loveMessages*0.60+waxRoses*7.20+keyChain*3.60+cartoons*18.20+surpriseNotes*22.00;
        int totalItems = loveMessages+waxRoses+keyChain+cartoons+surpriseNotes;
        if (totalItems>=25){
            totalPrice*=65/100.0;
        }
        double hosting = 10/100.0*totalPrice;
        totalPrice-=hosting;
        if (totalPrice>=price){
            System.out.printf("Yes! %.2f lv left.", totalPrice-price);
        }else{
            // Not enough money! 184.82 lv needed.
            System.out.printf("Not enough money! %.2f lv needed.", price-totalPrice);
        }
    }
}
