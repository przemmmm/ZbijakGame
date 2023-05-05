package controller;

import moveController.MoveDown;
import moveController.MoveLeft;
import moveController.MoveRight;
import moveController.MoveUp;
import players.PlayerUser;

import java.util.Scanner;

public class UserMoveControl {

     PlayerUser player = new PlayerUser();

    MoveUp moveUp = new MoveUp();
    MoveDown moveDown = new MoveDown();
    MoveLeft moveLeft = new MoveLeft();
    MoveRight moveRight = new MoveRight();

    public boolean moveControl(PlayerUser player, int boardMaxX, int boardMaxY, char playersChoice) {

        boolean isChoiceCorrect = true;


        switch (Character.toUpperCase(playersChoice)) {
            case 'W':
                if ((player.getY()) == boardMaxY) {
                    System.out.print("Nie mozesz isc do gory bo wyjdzisz poza plansze! ");
                    isChoiceCorrect = false;
                } else {
                    player.setY(moveUp.move(player.getY()));
                    System.out.println("Wykonaleś ruch do góry.");
                    System.out.println("Twoja pozycja: " + player);
                    //isChoiceCorrect = true;

                }
                break;
            case 'S':
                if ((player.getY()) == 0) {
                    System.out.print("Nie mozesz isc w dół bo wyjdzisz poza plansze! ");
                    isChoiceCorrect = false;
                } else {
                    player.setY(moveDown.move(player.getY()));
                    System.out.println("Wykonałeś ruch w dół.");
                    System.out.println("Twoja pozycja: " + player);
                    //isChoiceCorrect = true;
                   }

                break;
            case 'A':
                if ((player.getX()) == 0) {
                    System.out.print("Nie mozesz isc w lewo bo wyjdzisz poza plansze! ");
                    isChoiceCorrect = false;
                } else{
                    player.setX(moveLeft.move(player.getX()));
                    System.out.println("Wykonałeś ruch w lewo.");
                    System.out.println("Twoja pozycja: " + player);
                   // isChoiceCorrect = true;
                }
                break;
            case 'D':
                if ((player.getX()) == boardMaxX) {
                    System.out.print("Nie mozesz isc w prawo bo wyjdzisz poza plansze! ");
                    isChoiceCorrect = false;
                } else {
                    player.setX(moveRight.move(player.getX()));
                    System.out.println("Wykonałeś ruch w prawo.");
                    System.out.println("Twoja pozycja: " + player);
                    //isChoiceCorrect = true;
                }
                break;

            default:
                System.out.print("Nie ma tekigo wyboru. ");
                isChoiceCorrect = false;

        }
        return isChoiceCorrect;
    }
}