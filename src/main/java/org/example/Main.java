package org.example;

import controller.MoveUp;
import controller.Player1;
import controller.PlayerUser;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int j = scanner.nextInt();

        //int[][] board = new int[i][j];

        PlayerUser user = new PlayerUser();
        user.setX(0);
        user.setY(0);

        Player1 computer1 = new Player1();
        computer1.setX(i);
        computer1.setY(j);

        System.out.println(user);

        MoveUp moveUp = new MoveUp();
        user.setY(moveUp.move(user.getY()));

        System.out.println(user);



        System.out.println(user);




    }
}