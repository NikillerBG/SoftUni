package FirstStepsInCoding;

import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chicken = Integer.parseInt(scanner.nextLine());
        int fish = Integer.parseInt(scanner.nextLine());
        int vegetarian = Integer.parseInt(scanner.nextLine());
        double amount_for_food = chicken*10.35+fish*12.40+vegetarian*8.15;
        double dessert = 0.2*amount_for_food;
        double total = dessert + amount_for_food + 2.50;
        System.out.print(total);
    }
}
