package com.company;

import java.util.Scanner;

public class Game {
    private final Generator generator;

    public static void main(String[] args) {
        new Game();
    }

    public Game() {
        //Inic.
        this.generator = new Generator();
        //Login method
        new Login();
        //Body
        this.menu();
    }

    private void menu() {
        String input;
        Scanner scanner = new Scanner(System.in);
        loop:
        while (true) {
            System.out.println("|String| randomizer, |Char| randomizer, |Int| randomizer, |Test| randomizer or |Date| randomizer? ..|end| to stop the program");
            input = scanner.nextLine();
            while (!input.equals("String") && !input.equals("string")
                   && !input.equals("Int") && !input.equals("int")
                   && !input.equals("Char") && !input.equals("char")
                   && !input.equals("test") && !input.equals("Test")
                   && !input.equals("date") && !input.equals("Date")
                   && !input.equals("end")) {
                System.out.println("Wrong input.. type |String|, |Int|, |Char|, |Date| or |Test| ..|end| to stop the program)");
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
                case "Char":
                case "char":
                    this.generator.CharGenerator();
                    break;
                case "Test":
                case "test":
                    this.generator.TestGenerator();
                default:
                    this.generator.DateGenerator();
                    break;
            }
        }
    }

}


