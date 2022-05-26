package MoreExercises;

import java.util.Scanner;

public class StreamOfLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        boolean isFoundC = false;
        boolean isFoundO = false;
        boolean isFoundN = false;
        String word = "";
        while (!input.equals("End")) {
            char letter = input.charAt(0);
            if (letter < 'A' || (letter > 'Z' && letter < 'a') || letter > 'z') {
                input = scanner.nextLine();
                continue;
            }
            if (letter == 'c' && !isFoundC) {
                isFoundC = true;
            } else if (letter == 'o' && !isFoundO) {
                isFoundO = true;
            } else if (letter == 'n' && !isFoundN) {
                isFoundN = true;
            } else {
                word += input;
            }
            if (isFoundC && isFoundO && isFoundN) {
                isFoundC = false;
                isFoundN = false;
                isFoundO = false;
                System.out.print(word + " ");
                word = "";
            }
            input = scanner.nextLine();
        }
    }
}
