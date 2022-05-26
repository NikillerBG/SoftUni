package Exam;

import java.util.Scanner;

public class CourierExpress {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double kg = Double.parseDouble(scanner.nextLine());
        String type = scanner.nextLine();
        int km = Integer.parseInt(scanner.nextLine());
        double price = 0;
        switch (type){
            case "standard":
                if (kg<1) price = km*0.03;
                else if (kg>=1&&kg<10) price=km*0.05;
                else if (kg>=10&&kg<40) price=km*0.10;
                else if (kg>=40&&kg<90) price=km*0.15;
                else if (kg>=90&&kg<150) price=km*0.20;
                break;
            case "express":
                if (kg<1) price = km*0.03+80/100.0*0.03*kg*km;
                else if (kg>=1&&kg<10) price = km*0.05+40/100.0*0.05*km*kg;
                else if (kg>=10&&kg<40) price = km*0.10+5/100.0*0.10*km*kg;
                else if (kg>=40&&kg<90) price = km*0.15+2/100.0*0.15*km*kg;
                else if (kg>=90&&kg<150) price = km*0.20+1/100.0*0.20*km*kg;
                break;
        }
        System.out.printf("The delivery of your shipment with weight of %.3f kg. would cost %.2f lv.", kg, price);
    }
}
