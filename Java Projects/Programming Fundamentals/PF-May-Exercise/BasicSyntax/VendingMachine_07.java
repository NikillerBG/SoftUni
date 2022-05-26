package BasicSyntax;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class VendingMachine_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nutsPrice = 2.00;
        double waterPrice = 0.70;
        double crispsPrice = 1.50;
        double sodaPrice = 0.80;
        double cokePrice = 1.00;
        List<Double> coins = Arrays.asList(0.10, 0.20, 0.50, 1.00, 2.00);
        String input = scanner.nextLine();
        double balance = 0.00;
        while(!input.equals("Start")){
            double coin = Double.parseDouble(input);
            if (coins.contains(coin)){
                balance+=coin;
            }else{
                System.out.printf("Cannot accept %.2f %n", coin);
            }
            input = scanner.nextLine();
        }
        String food = scanner.nextLine();
        while(!food.equals("End")){
            double price = 0.0;
            Boolean valid = true;
            switch (food){
                case "Coke":
                    price=cokePrice;
                    break;
                case "Soda":
                    price = sodaPrice;
                    break;
                case "Crisps":
                    price = crispsPrice;
                    break;
                case "Water":
                    price = waterPrice;
                    break;
                case "Nuts":
                    price = nutsPrice;
                    break;
                default:
                    System.out.println("Invalid product");
                    valid = false;
                    break;
            }
            if (balance>=price && valid == true){
                balance-=price;
                System.out.printf("Purchased %s %n", food);
            }else if (balance<price && valid == true){
                System.out.println("Sorry, not enough money");
            }
            food = scanner.nextLine();
        }
        System.out.printf("Change: %.2f", balance);
    }
}
