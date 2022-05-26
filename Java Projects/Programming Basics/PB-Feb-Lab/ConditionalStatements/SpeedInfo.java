package ConditionalStatements;

import java.util.Scanner;

public class SpeedInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double speed = Double.parseDouble(scanner.nextLine());
        if (speed <= 10) {
            System.out.print("slow");
        } else if (10 < speed && speed <= 50) {
            System.out.print("average");
        } else if (50 < speed && speed <= 150) {
            System.out.print("fast");
        } else if (150 < speed && speed <= 1000) {
            System.out.print("ultra fast");
        } else {
            System.out.print("extremely fast");
        }
    }
}
