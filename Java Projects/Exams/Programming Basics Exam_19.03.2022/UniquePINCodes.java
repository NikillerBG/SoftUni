package Exam;

import java.util.Scanner;

public class UniquePINCodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstMax = Integer.parseInt(scanner.nextLine());
        int secondMax = Integer.parseInt(scanner.nextLine());
        int thirdMax = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i<= firstMax; i++){
            for (int j = 1; j<= secondMax; j++){
                for (int l = 1; l<= thirdMax; l++){
                    if (i%2==0&&(j==2||j==3||j==5||j==7)&&l%2==0){
                        System.out.printf("%d %d %d%n", i ,j, l);
                    }
                }
            }
        }
    }
}
