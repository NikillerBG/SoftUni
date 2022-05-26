package ConditionalStatements;

import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String object = scanner.nextLine();
        if (object.equals("square")) {
            double a = Double.parseDouble(scanner.nextLine());
            System.out.print(a * a);
        } else if (object.equals("rectangle")) {
            double a = Double.parseDouble(scanner.nextLine());
            double b = Double.parseDouble(scanner.nextLine());
            System.out.print(a * b);
        } else if (object.equals("circle")) {
            double r = Double.parseDouble(scanner.nextLine());
            System.out.print(r * r * Math.PI);
        } else if (object.equals("triangle")) {
            double a = Double.parseDouble(scanner.nextLine());
            double h = Double.parseDouble(scanner.nextLine());
            System.out.print(a * h / 2);
        }
    }
}
