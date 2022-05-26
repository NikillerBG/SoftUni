package NestedLoops;

import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int juryCount = Integer.parseInt(scanner.nextLine());
        String projectName = scanner.nextLine();
        double totalSum = 0;
        int totalGrades = 0;
        while(!projectName.equals("Finish")){
            double sum = 0;
            for (int i = 0; i<juryCount; i++){
                double grade = Double.parseDouble(scanner.nextLine());
                totalGrades++;
                sum+=grade;
            }
            totalSum += sum;
            double average = sum/juryCount;
            System.out.printf("%s - %.2f.%n",projectName, average);
            projectName = scanner.nextLine();
        }
        double totalAverage = totalSum/totalGrades;
        System.out.printf("Student's final assessment is %.2f.",totalAverage);
    }
}
