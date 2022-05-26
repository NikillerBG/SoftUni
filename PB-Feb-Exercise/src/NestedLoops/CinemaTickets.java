package NestedLoops;

import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double totalTickets = 0;
        int studentTickets = 0;
        int standardTickets = 0;
        int kidsTickets = 0;
        while (!input.equals("Finish")) {
            int seats = Integer.parseInt(scanner.nextLine());
            String type = scanner.nextLine();
            double movieTickets = 0;
            while (!type.equals("End")) {
                totalTickets++;
                movieTickets++;
                if (type.equals("student")) {
                    studentTickets++;
                } else if (type.equals("kid")) {
                    kidsTickets++;
                } else if (type.equals("standard")) {
                    standardTickets++;
                }
                if (movieTickets==seats){
                    break;
                }
                type = scanner.nextLine();
            }
            double percentFull = movieTickets/seats*100;
            System.out.printf("%s - %.2f%% full. %n", input, percentFull);
            input = scanner.nextLine();
        }
        System.out.printf("Total tickets: %.0f%n", totalTickets);
        System.out.printf("%.2f%% student tickets.%n", studentTickets/totalTickets*100);
        System.out.printf("%.2f%% standard tickets.%n", standardTickets/totalTickets*100);
        System.out.printf("%.2f%% kids tickets.%n", kidsTickets/totalTickets*100);
    }
}
