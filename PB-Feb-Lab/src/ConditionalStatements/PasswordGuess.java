package ConditionalStatements;

import java.util.Scanner;

public class PasswordGuess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = "s3cr3t!P@ssw0rd";
        String TypedPassword = scanner.nextLine();
        if (password.equals(TypedPassword)) {
            System.out.print("Welcome");
        } else {
            System.out.print("Wrong password!");
        }
    }
}
