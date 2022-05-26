package MoreExercises;

import java.util.Scanner;

public class TrainingLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double w = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());
        w = w * 100;
        h = h * 100 - 100;
        var workPlaces = (Math.floor(h / 70)) * (Math.floor(w / 120)) - 3;
        System.out.printf("%.0f", workPlaces);
    }
}
