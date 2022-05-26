package FirstStepsInCoding;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double area = Double.parseDouble(scanner.nextLine());
        double priceWithoutDiscount = area * 7.61;
        double discount = priceWithoutDiscount * 0.18;
        double finalPrice = priceWithoutDiscount - discount;
        System.out.printf("The final price is: " + finalPrice + " lv.");
        System.out.println();
        System.out.printf("The discount is: " + discount + " lv.");
    }
}
