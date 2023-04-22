package org.example;

import computerController.*;
import controller.*;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int j = scanner.nextInt();



        PlayerUser user = new PlayerUser();
        user.setX(0);
        user.setY(0);

        PlayerComputer computer1 = new PlayerComputer("Computer1");
        computer1.setX(i);
        computer1.setY(j);

        PlayerComputer computer2 = new PlayerComputer("Computer2");
        computer2.setX(0);
        computer2.setY(j);

        PlayerComputer computer3 = new PlayerComputer("Computer3");
        computer3.setX(i);
        computer3.setY(0);
//
//        MoveUp moveUp = new MoveUp();
//        MoveDown moveDown = new MoveDown();
//        MoveLeft moveLeft = new MoveLeft();
//        MoveRight moveRight = new MoveRight();
        ComputerMove computerMove = new ComputerMove();

//
//
//
        System.out.println("******************************************");
        System.out.println("WERYFIKUJEMY DZIALANY KLASY ZMIANY POZYCJI");
        System.out.println("******************************************");

        System.out.println(computer2);
        System.out.println("WYWOLANIE METRODY");
        computerMove.computerMove(computer2, i,j);
        System.out.println(computer2);
        computerMove.computerMove(computer2, i,j);



























        //KONTROLA MOZLIWYCH RUCHOW. SPRAWDZAMY NA JAKIM POLU JEST KOMPUTER I W KTORYM KIEURNU MOZE ISC
        // najpierw randomym losujemy mu kierunek
        //potem sprawdzamy, czy moze pojsc w tym kierunku
        //jesli nie to odwracamy kierunek
        //do metody zaciagamy caly obiekt








        // TU BEDZIE METODA, KTORA BEDZIE POBIERAC ZNAK Z KLAWIATURY I NA JEJ PODSTAWIE BEDZIE ZMIENIAC POZYCJE GRACZA
//        System.out.println(user);
//        System.out.println("WYBIERZ KIERUNEK: \n" +
//                "W. DO GÓRY. \n" +
//                "S. NA DOŁ. \n" +
//                "A. W LEWO. \n" +
//                "D. W PRAWO. \n");

       // char moveDirection = scanner.next().charAt(0);

//        switch(Character.toUpperCase(moveDirection)){
//            case 'W' : user.setY(moveUp.move(user.getY()));
//            break;
//            case 'S' : user.setY(moveDown.move(user.getY()));
//            break;
//            case 'A' : user.setX(moveLeft.move(user.getX()));
//            break;
//            case 'D' : user.setX(moveRight.move(user.getX()));
//            break;
//            default:
//                System.out.println("Nie ma takiego kierunku");
//                break;
//        }


//
//        System.out.println(user);
//        user.setY(moveUp.move(user.getY()));
//        System.out.println(user);
//        user.setY(moveUp.move(user.getY()));
//        System.out.println(user);
//        user.setX(moveLeft.move(user.getX()));
//        System.out.println(user);










    }
}