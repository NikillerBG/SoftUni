package NestedLoops;

import java.util.Scanner;

public class EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        for (int i = firstNum; i<= secondNum; i++){
            int currentNum = i;
            int oddSum = 0;
            int evenSum = 0;
            for (int j = 6; j>=0; j--){
                int digit = currentNum%10;
                if (j%2==0){
                    evenSum+=digit;
                }else if (j%2==1){
                    oddSum+=digit;
                }
                currentNum/=10;
            }
            if (oddSum==evenSum){
                System.out.print(i + " ");
            }
        }
    }
}
