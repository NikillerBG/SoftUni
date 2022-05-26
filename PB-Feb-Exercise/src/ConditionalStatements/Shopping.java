package ConditionalStatements;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int gpus = Integer.parseInt(scanner.nextLine());
        int cpus = Integer.parseInt(scanner.nextLine());
        int ramSticks = Integer.parseInt(scanner.nextLine());
        double gpuPrice = gpus * 250;
        double cpuPrice = cpus * (0.35 * gpuPrice);
        double ramSticksPrice = ramSticks * (0.10 * gpuPrice);
        var total = gpuPrice + cpuPrice + ramSticksPrice;
        if (gpus > cpus) {
            total = total * 0.85;
        }
        var diff = Math.abs(budget - total);
        if (total > budget) {
            System.out.printf("Not enough money! You need %.2f leva more!", diff);
        } else {
            System.out.printf("You have %.2f leva left!", diff);
        }

    }
}
