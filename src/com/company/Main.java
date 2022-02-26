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
        Login login = new Login();
        //Telo kódu
        this.menu();
    }

    private void menu() {
        String input;
        Scanner scanner = new Scanner(System.in);
        System.out.println("|String| randomizer, |Char| randomizer or |Int| randomizer?");
        input = scanner.nextLine();
        while (!input.equals("String") && !input.equals("Int") && !input.equals("Char")) {
            System.out.println("Wrong input.. type |String|, |Int| or |Char|");
            input = scanner.nextLine();
        }
        if (input.equals("Int")) {
            this.generator.IntGenerator();
        } else if (input.equals("String")) {
            this.generator.StringGenerator();
        } else {
            this.generator.CharGenerator();
        }
    }

}


