package Exam;

import java.util.Scanner;

public class CatDiet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fat = Integer.parseInt(scanner.nextLine());
        int protein = Integer.parseInt(scanner.nextLine());
        int carbohydrates = Integer.parseInt(scanner.nextLine());
        int cals = Integer.parseInt(scanner.nextLine());
        int water = Integer.parseInt(scanner.nextLine());
        double foodMass = (fat/100.0*cals)/9+(protein/100.0*cals)/4+(carbohydrates/100.0*cals)/4;
        double calsPerGram = cals/foodMass;
        double calsPerGramWithWater = (100-water)/100.0*calsPerGram;
        System.out.printf("%.4f", calsPerGramWithWater);
    }
}
