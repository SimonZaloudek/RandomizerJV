package com.company;

import java.util.Scanner;

public class Main {
    private final Generator generator;

    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        //Inic.
        this.generator = new Generator();
        //Login method
        new Login();
        //Telo kódu
        this.menu();
    }

    private void menu() {
        String input;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("|String| randomizer, |Char| randomizer or |Int| randomizer? ..|end| to stop the program");
            input = scanner.nextLine();
            while (!input.equals("String") && !input.equals("Int") && !input.equals("Char") && !input.equals("end")) {
                System.out.println("Wrong input.. type |String|, |Int| or |Char| ..|end| to stop the program)");
                input = scanner.nextLine();
            }
            if (input.equals("end")) {
                break;
            } else if (input.equals("Int")) {
                this.generator.IntGenerator();
            } else if (input.equals("String")) {
                this.generator.StringGenerator();
            } else {
                this.generator.CharGenerator();
            }
        }
    }

}


