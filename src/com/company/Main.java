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
        System.out.println("|String| randomizer or |Int| randomizer?");
        input = scanner.nextLine();
        while (!input.equals("String") && !input.equals("Int")) {
            System.out.println("Wrong input.. type |String| or |Int|");
            input = scanner.nextLine();
        }
        if (input.equals("Int")) {
            this.generator.IntGenerator();
        } else {
            this.generator.StringGenerator();
        }
    }

}


