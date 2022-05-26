package BasicSyntax;

import java.util.Scanner;

public class StrongNumber_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        int number = input;
        int sum = 0;
        while(number>0){
            int digit = number%10;
            int fact = 1;
            while(digit>0){
                fact*=digit;
                digit--;
            }
            sum+=fact;
            number/=10;
        }
        if(sum==input){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}
