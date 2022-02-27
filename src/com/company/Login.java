package com.company;
import java.util.Scanner;

public class Login {

    private final Scanner scanner;
    private String input;

    public Login() {
        scanner = new Scanner(System.in);
        this.input = "";
        this.login();
    }

    private void login() {
        int counter = 0;
        System.out.println("Zadaj meno:");
        String meno = scanner.nextLine();

        System.out.println("Zadaj heslo:");
        input = scanner.nextLine();

        while (!input.equals("haha")) {
            System.out.println("Nespravne heslo!!");
            counter++;
            if (counter > 2) {
                System.out.println("Hint: Sound you make when you laugh..");
            }
            input = scanner.nextLine();
        }
        System.out.println("Vitaj " + meno +  "!!");
        System.out.println("_________________________________________");
    }
}
