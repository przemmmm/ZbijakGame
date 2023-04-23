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

        ComputerMove computerMove = new ComputerMove();
        UserMove userMove = new UserMove();

        System.out.println("******************************************");
        System.out.println("WERYFIKUJEMY DZIALANIE LOSOWEJ ZIANY POZYCJI DLA KOMPUTERA");
        System.out.println("******************************************");

        System.out.println(computer2);
        System.out.println("WYWOLANIE METRODY");
        computerMove.computerMove(computer2, i,j);
        System.out.println(computer2);
        computerMove.computerMove(computer2, i,j);

        System.out.println("******************************************");
        System.out.println("WERYFIKUJEMY DZIALANY ZMIANY POZYCJI DLA GRACZA");
        System.out.println("******************************************");

        System.out.println(user);
        userMove.playerMove(user, 'W');
        System.out.println(user);
        userMove.playerMove(user, 'W');
        System.out.println(user);
        userMove.playerMove(user, 'W');
        System.out.println(user);
        userMove.playerMove(user, 's');
        System.out.println(user);
        userMove.playerMove(user, 'a');
        System.out.println(user);
        userMove.playerMove(user, 'D');
        System.out.println(user);




        System.out.println("******************************************");
        System.out.println("WERYFIKUJEMY DZIALANY MOVECONTROL DLA GRACZA");
        System.out.println("******************************************");

        System.out.println(user);

        UserMoveControl userMoveControl = new UserMoveControl();
        System.out.println(userMoveControl.moveControl(user, i, j, 'W'));
        System.out.println(user);
        System.out.println(userMoveControl.moveControl(user, i, j, 's'));
        System.out.println(user);
        System.out.println(userMoveControl.moveControl(user, i, j, 'a'));
        System.out.println(user);

        System.out.println(userMoveControl.moveControl(user, i, j, 'd'));
        System.out.println(user);

        System.out.println(userMoveControl.moveControl(user, i, j, 'w'));
        System.out.println(user);

        System.out.println(userMoveControl.moveControl(user, i, j, 's'));
        System.out.println(user);



    }
}