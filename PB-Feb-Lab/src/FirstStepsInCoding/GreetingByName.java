package FirstStepsInCoding;

import java.util.Scanner;

public class GreetingByName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String result = "Hello, " + name + "!";
        System.out.print(result);
    }
}
