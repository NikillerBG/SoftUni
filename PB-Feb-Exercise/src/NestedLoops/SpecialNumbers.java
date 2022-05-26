package NestedLoops;

import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (var i = 1; i <= 9; i++) {
            for (var j = 1; j <= 9; j++) {
                for (var l = 1; l <= 9; l++) {
                    for (var m = 1; m <= 9; m++) {
                        boolean isSpecial = n % i == 0 && n % j == 0 && n % l == 0 && n % m == 0;
                        if (isSpecial) {
                            System.out.printf("%d%d%d%d ", i, j, l, m);
                        }
                    }
                }
            }
        }
    }
}

