package BasicSyntax;

import java.util.Scanner;

public class Login_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        String password = "";
        for (int i=0; i<userName.length(); i++){
            password = userName.charAt(i)+password;
        }
        int failCount = 0;
        String input = scanner.nextLine();
        Boolean loggedIn = true;
        while (!input.equals(password)){
            failCount++;
            if (failCount>3){
                System.out.printf("User %s blocked!", userName);
                loggedIn = false;
                break;
            }
            System.out.println("Incorrect password. Try again.");
            input = scanner.nextLine();
        }
        if (loggedIn == true){
            System.out.printf("User %s logged in.", userName);
        }
    }
}
