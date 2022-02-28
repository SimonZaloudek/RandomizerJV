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
        loop:
        while (true) {
            System.out.println("|String| randomizer, |Char| randomizer or |Int| randomizer? ..|end| to stop the program");
            input = scanner.nextLine();
            while (!input.equals("String") && !input.equals("string") && !input.equals("Int") && !input.equals("int") && !input.equals("Char") && !input.equals("char") && !input.equals("end")) {
                System.out.println("Wrong input.. type |String|, |Int| or |Char| ..|end| to stop the program)");
                input = scanner.nextLine();
            }
            switch (input) {
                case "end":
                    break loop;
                case "Int":
                case "int":
                    this.generator.IntGenerator();
                    break;
                case "String":
                case "string":
                    this.generator.StringGenerator();
                    break;
                default:
                    this.generator.CharGenerator();
                    break;
            }
        }
    }

}


