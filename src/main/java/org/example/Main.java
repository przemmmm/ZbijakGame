package org.example;

import controller.*;
import moveController.ComputerMove;

import java.util.*;

public class Main {
    public static <Set> void main(String[] args) {

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

       HashSet<PlayerComputer> enemyList = new LinkedHashSet<>();
       enemyList.add(computer1);
       enemyList.add(computer2);
       enemyList.add(computer3);

        System.out.println("WERYFIKACJA WYSWIETLANIA LISTY");
       enemyList.forEach(System.out::println);


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


        System.out.println("*******WERYFIKACJA USUNIECIA Z SETU****************");
        enemyList.forEach(System.out::println);

//        MattingVerification mattedVerification = new MattingVerification();
//        mattedVerification.removeFromSet(enemyList, computer2);
//        System.out.println("PO USUNIECIU");
//        enemyList.forEach(System.out::println);


        System.out.println("*******WERYFIKACJA czy  komputer zostal zbity****************");

        MattingVerification mattingVerification = new MattingVerification();
        mattingVerification.isEnemyMatted(user, computer1, computer2, computer3, enemyList );


    }
}