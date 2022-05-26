package FirstStepsInCoding;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fee = Integer.parseInt(scanner.nextLine());
        double sneakersPrice = fee-(fee*40/100.00);
        double outfitPrice = sneakersPrice - (sneakersPrice*20/100);
        double ballPrice = outfitPrice/4;
        double accessoriesPrice = ballPrice/5;
        double total = fee + sneakersPrice + outfitPrice + ballPrice + accessoriesPrice;
        System.out.print(total);
    }
}
