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
            System.out.println(hry.get(cislo));
            hry.clear();

            System.out.println("\nDo you want to repeat the program? |y|n|");
            input = scanner.nextLine();
            while (!input.equals("y") && !input.equals("n")) {
                System.out.println("Input must be |y| or |n|");
                input = scanner.nextLine();
            }
            if (input.equals("n")) {
                System.out.println("Enjoy");
            }
        } while (!input.equals("n"));
    }

    public void IntGenerator() {
        int bottomN;
        int topN;
        input = "";
        System.out.println("Type the smallest number");
        bottomN = scanner.nextInt();
        System.out.println("Type the biggest number");
        topN = scanner.nextInt();
        scanner.nextLine();
        do {
            int cislo = rndm.nextInt(topN - bottomN + 1) + bottomN;
            System.out.println("Random number is : " + cislo);

            System.out.println("\nDo you want to roll again? |y|n|");
            input = scanner.nextLine();
            while (!input.equals("y") && !input.equals("n")) {
                System.out.println("Zadal si nespravnu hodnotu |y|n|");
                input = scanner.nextLine();
            }
            if (input.equals("n")) {
                System.out.println("Enjoy");
            }
        } while (!input.equals("n"));
    }
}
