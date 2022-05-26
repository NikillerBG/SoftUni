package NestedLoops;

import java.util.Scanner;

public class Building {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int floors = Integer.parseInt(scanner.nextLine());
        int rooms = Integer.parseInt(scanner.nextLine());
        for (int floor = floors; floor >= 1; floor--) {
            for (int room = 0; room < rooms; room++) {
                String type = "";
                if (floor == floors) {
                    type = "L";
                } else if (floor % 2 == 0) {
                    type = "O";
                } else if (floor % 2 == 1) {
                    type = "A";
                }
                System.out.printf("%s%d%d ", type, floor, room);
            }
            System.out.println();
        }
    }
}
