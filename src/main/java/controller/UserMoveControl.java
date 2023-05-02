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

    public String moveControl(PlayerUser player, int boardMaxX, int boardMaxY, char playersChoice) {

        String notification = null;

        switch (Character.toUpperCase(playersChoice)) {
            case 'W':
                if ((player.getY()) == boardMaxY) {
                    notification = "Nie mozesz isc do gory bo wyjdzisz poza plansze! Tracisz ruch. ";
                } else {
                    notification = "Wykonaleś ruch do góry.";
                            player.setY(moveUp.move(player.getY()));}
                break;
            case 'S':
                if ((player.getY()) == 0) {
                    notification = "Nie mozesz isc w dół bo wyjdzisz poza plansze! Tracisz ruch.";
                } else {
                    notification = "Wykonałeś ruch w dół";
                    player.setY(moveDown.move(player.getY()));}
                break;
            case 'A':
                if ((player.getX()) == 0) {
                    notification = "Nie mozesz isc w lewo bo wyjdzisz poza plansze! Tracisz ruch.";
                } else{
                    notification = "Wykonałeś ruch w lewo.";
                    player.setX(moveLeft.move(player.getX()));
                }
                break;
            case 'D':
                if ((player.getX()) == boardMaxX) {
                    notification = "Nie mozesz isc w prawo bo wyjdzisz poza plansze! Tracisz ruch.";
                } else {
                    notification = "Wykonałeś ruch w prawo.";
                    player.setX(moveRight.move(player.getX()));
                }
                break;

            default:
               notification= "Nie ma tekigo wyboru. Tracisz kolejke.";

        }
       return notification;
    }
}
