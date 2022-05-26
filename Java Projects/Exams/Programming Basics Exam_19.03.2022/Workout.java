package Exam;

import java.util.Scanner;

public class Workout {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        double km = Double.parseDouble(scanner.nextLine());
        double totalKm = km;
        for (int i = 1; i <= days; i++) {
            int percent = Integer.parseInt(scanner.nextLine());
            km = km + km * percent / 100.0;
            totalKm = totalKm + km;
        }
        if (totalKm >= 1000) {
            System.out.printf("You've done a great job running %.0f more kilometers!", Math.ceil(totalKm)-1000);
        } else {
            System.out.printf("Sorry Mrs. Ivanova, you need to run %.0f more kilometers", Math.ceil(1000 - totalKm));
        }
    }
}
