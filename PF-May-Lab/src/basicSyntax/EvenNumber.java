package basicSyntax;

import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        while (true){
            if (Math.abs(num)%2==1){
                System.out.println("Please write an even number.");
                num = Integer.parseInt(scanner.nextLine());
                continue;
            }
            System.out.printf("The number is: %d", Math.abs(num));
            break;
        }
    }
}
