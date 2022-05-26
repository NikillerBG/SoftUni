package FirstStepsInCoding;

import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nylon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int diluent = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());
        double expenses_for_materials = ((nylon+2)*1.50)+((paint*1.1)*14.50)+(diluent*5.00)+0.40;
        double amount_for_workers = hours*(expenses_for_materials*30/100);
        double total = amount_for_workers+expenses_for_materials;
        System.out.printf("%.2f", total);
}
}
