package basicSyntax;

import java.util.Scanner;

public class MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int count = Integer.parseInt(scanner.nextLine());
        for (int i = count; i <= 10; i++) {
            System.out.printf("%d X %d = %d%n", number, i, number * i);
        }
        if(count>10){
            System.out.printf("%d X %d = %d%n", number, count, number*count);
        }
    }
}
