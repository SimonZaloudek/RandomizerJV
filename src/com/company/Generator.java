package com.company;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class Generator {

    private final Random rndm;
    private final Scanner scanner;
    private final ArrayList<String> hry;
    private String input;

    public Generator() {
        this.scanner = new Scanner(System.in);
        this.hry = new ArrayList<>();
        this.rndm = new Random();

        this.input = "";
    }

    public void StringGenerator() {
        do {
            System.out.println("Type anything u cant decide about, then type |decide|");
            input = scanner.nextLine();
            while (!input.equals("decide")) {
                hry.add(input);
                input = scanner.nextLine();
            }
            System.out.println("Go on:");
            int cislo = rndm.nextInt(hry.size());
            System.out.println(hry.get(cislo) + "\n");
            hry.clear();
            this.rollDetection();
        } while (!input.equals("n"));
    }

    public void IntGenerator() {
        int bottomN;
        int topN;
        System.out.println("Type the smallest number");
        bottomN = scanner.nextInt();
        System.out.println("Type the biggest number");
        topN = scanner.nextInt();
        scanner.nextLine();
        do {
            int cislo = rndm.nextInt(topN - bottomN + 1) + bottomN;
            System.out.println("Random number is : " + cislo + "\n");
            this.rollDetection();
        } while (!input.equals("n"));
    }

    public void CharGenerator() {
        String abeceda = "ABCDEFGH1IJKLMNOPQRSTUVWXYZ";
        System.out.println("Printing random letter between |A| - |Z|");
        System.out.println("________________________________________");
        do {
            char pismeno = (abeceda.charAt(rndm.nextInt(26)));
            if (pismeno == '1') {
                System.out.println("CH\n");
            } else {
                System.out.println(pismeno + "\n");
            }
            this.rollDetection();
        } while (!input.equals("n"));
    }

    public void TestGenerator() {
        String abeceda = "ABCDEFGH1IJKLMNOPQRSTUVWXYZ";
        int pocet = 0;
        System.out.println("Type the number of test options |2| - |99|");
        System.out.println("________________________________________");
        pocet = scanner.nextInt();
        scanner.nextLine();
        while (pocet < 2 || pocet > 99) {
            System.out.println("Wrong input.. |2| - |99|");
            pocet = scanner.nextInt();
            scanner.nextLine();
        }
        do {
            char pismeno = (abeceda.charAt(rndm.nextInt(pocet)));
            System.out.println(pismeno + "\n");
            this.rollDetection();
        } while (!input.equals("n"));
    }

    public void rollDetection() {
        System.out.println("\nDo you want to roll again? |y|n|");
        input = scanner.nextLine();
        while (!input.equals("y") && !input.equals("n")) {
            System.out.println("Wrong input |y|n|");
            input = scanner.nextLine();
        }
        if (input.equals("n")) {
            System.out.println("Enjoy\n___________________");
        }
    }
}


