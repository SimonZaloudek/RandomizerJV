package com.company;
import java.util.Random;
import java.util.Scanner;

public class DateGenerator {

    private Generator generator;
    private Scanner scanner;
    private Random rndm;
    private String input;
    private int number;
    private int year;

    public DateGenerator() {
        this.rndm = new Random();
        this.generator = new Generator();
        this.scanner = new Scanner(System.in);
        this.input = "";
        this.number = 0;

        this.core();
    }

    public void core() {
        System.out.println("What do you want to randomize?: |year|year,month|year,month,day|month|month,day|day|");
        input = scanner.nextLine();
        while (!input.equals("year")
            && !input.equals("year,month")
            && !input.equals("year,month,day")
            && !input.equals("month")
            && !input.equals("month,day")
            && !input.equals("day")) {
            System.out.println("Wrong input.. |year|year,month|year,month,day|month|month,day|day|");
            input = scanner.nextLine();
        }
        switch (input) {
            case "year":
                this.yearGen();
                break;
            case "year,month":

                break;
            case "year,month,day":

                break;
            case "month,day":

                break;
            case "month":

                break;
            default:

                break;
        }
    }

    private void yearGen() {
        do {
            System.out.println("Enter the desired margin |0| - |3000| 'input one, then another'");
            int botN = scanner.nextInt();
            int topN = scanner.nextInt();
            scanner.nextLine();
            while (botN < 0 && topN > 3000) {
                System.out.println("Wrong input..");
                botN = scanner.nextInt();
                topN = scanner.nextInt();
                scanner.nextLine();
            }
            this.year = generator.randomInt(topN, botN);
            System.out.println("\n" + year);
            generator.rollDetection();
        } while (!input.equals("n"));
    }
}
