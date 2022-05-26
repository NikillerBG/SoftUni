package BasicSyntax;

import java.util.Scanner;

public class Ages_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        String person = "";
        if (age>=0&&age<3){
            person = "baby";
        }else if(age<14){
            person = "child";
        }else if(age<20){
            person = "teenager";
        }else if(age<66){
            person = "adult";
        }else{
            person = "elder";
        }
        System.out.println(person);
    }
}
