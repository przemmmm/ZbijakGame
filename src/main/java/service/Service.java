package service;

import controller.MattingVerification;
import controller.UserMoveControl;
import moveController.ComputerMove;
import players.PlayerComputer;
import players.PlayerUser;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Service {

    int boardSize;
    Scanner scanner = new Scanner(System.in);
    PlayerUser user = new PlayerUser(0, 0);
    PlayerComputer computer1 = new PlayerComputer("Computer1");
    PlayerComputer computer2 = new PlayerComputer("Computer2");
    PlayerComputer computer3 = new PlayerComputer("Computer3");
    HashSet<PlayerComputer> enemyList = new LinkedHashSet<>();
    ComputerMove computerMove = new ComputerMove();


    UserMoveControl userMoveControl = new UserMoveControl();
    MattingVerification mattingVerification = new MattingVerification();

    public int createPlayingBoard() {
        System.out.println("Podaj wymiar tablicy. Tablica jest kwadratowa, więc potrzebujemy tylko jednej wartosci: ");
        System.out.print("Wymiar: ");
        boardSize = scanner.nextInt();

        return boardSize;
    }

    public void startGame() {

        createPlayingBoard();

        computer1.setX(boardSize);
        computer1.setY(boardSize);
        computer2.setX(0);
        computer2.setY(boardSize);
        computer3.setX(boardSize);
        computer3.setY(0);
        enemyList.add(computer1);
        enemyList.add(computer2);
        enemyList.add(computer3);
        int counter = 1;


        do {
            System.out.println("**************************************" + " \n\t\t\tRUNDA NUMER: " + counter);

            System.out.print("Wykonaj swój ruch: ");
            char userMove = scanner.next().charAt(0);
            System.out.println(userMoveControl.moveControl(user, boardSize, boardSize, userMove));
            System.out.println("Twoja pozycja: " + user);


            enemyList.removeAll(mattingVerification.isEnemyMatted(user, enemyList));
            //tu mam metode, ktora przy pomocy dodatkowej listy zmienia mi istniejąca tabele. Gdy tego nie mialem to waywalo mi CurrentModificationException
            if (enemyList.isEmpty() == true) {
                break;
            }

            for (PlayerComputer playerComputer : enemyList) {
                computerMove.computerMove(playerComputer, boardSize, boardSize);
                System.out.println(playerComputer);
                mattingVerification.isUserMatted(user, playerComputer);
                if (user.getStatus() == false) {
                    break;
                }
            }

            counter++;


        } while (user.getStatus() == true && enemyList.size() != 0);
        if (enemyList.size() == 0) {
            System.out.println("WYGRAŁEŚ!" + "\n Zbiłeś wszystkich przeciwników w " + (counter - 1) + " ruchach!");

        }
        if (user.getStatus() == false) {
            System.out.println("PRZEGRAŁEŚ!" +
                    "Zostałeś zbity w " + (counter - 1) + " ruchach!");
        }
    }
}
