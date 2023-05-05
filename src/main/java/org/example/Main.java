package org.example;

import service.Service;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Service service = new Service();
        boolean trueCondition = true;

        do {

            System.out.println("MENU" +
                    "\n 1) ZASADY GRY." +
                    "\n 2) ZAGRAJ." +
                    "\n 3) WYJŚCIE." +
                            "\n");
            System.out.print("\n Wybór: ");
            Scanner scanner = new Scanner(System.in);
            int userChoice = scanner.nextInt();

            switch (userChoice) {
                case 1:
                    System.out.println("MENU");
                    break;
                case 2:
                    service.startGame();
                    break;
                case 3:
                    System.out.println("KONIEC GRY");
                    trueCondition=false;
                    break;

                default:
                    System.out.println("ZŁY WYBÓR");

            }
        } while (trueCondition);
    }
}
