package Exam;

import java.util.Scanner;

public class BestPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String player = scanner.nextLine();
        int max = 0;
        String bestPlayer = "";
        boolean hatTrick = false;
        while (!player.equals("END")){
            int goals = Integer.parseInt(scanner.nextLine());
            if (goals>max){
                max = goals;
                bestPlayer = player;
            }
            if (goals>=3){
                hatTrick = true;
            }
            if (goals>=10){
                break;
            }
            player = scanner.nextLine();
        }
        System.out.printf("%s is the best player!%n", bestPlayer);
        if (hatTrick){
            System.out.printf("He has scored %d goals and made a hat-trick !!!", max);
        }else{
            System.out.printf("He has scored %d goals.", max);
        }
    }
}
