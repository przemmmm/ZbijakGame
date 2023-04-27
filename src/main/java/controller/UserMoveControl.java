package controller;

import moveController.MoveDown;
import moveController.MoveLeft;
import moveController.MoveRight;
import moveController.MoveUp;

public class UserMoveControl {

    PlayerUser player = new PlayerUser();
    UserMove userMove = new UserMove();

    MoveUp moveUp = new MoveUp();
    MoveDown moveDown = new MoveDown();
    MoveLeft moveLeft = new MoveLeft();
    MoveRight moveRight = new MoveRight();

    public String moveControl(PlayerUser player, int boardMaxX, int boardMaxY, char playersChoice) {

        String notification = null;

        switch (Character.toUpperCase(playersChoice)) {
            case 'W':
                if ((player.getY()) == boardMaxY) {
                    notification = "Nie mozesz isc do gory bo wyjdzisz poza plansze!";
                } else {
                    notification = "PRAWIDŁOWY RUCH! POZYCJA ZOSTAŁA ZAKTUALIZOWANA";
                            player.setY(moveUp.move(player.getY()));}
                break;
            case 'S':
                if ((player.getY()) == 0) {
                    notification = "Nie mozesz isc w dol bo wyjdzisz poza plansze!";
                } else {
                    notification = "PRAWIDŁOWY RUCH! POZYCJA ZOSTAŁA ZAKTUALIZOWANA";
                    player.setY(moveDown.move(player.getY()));}
                break;
            case 'A':
                if ((player.getX()) == 0) {
                    notification = "Nie mozesz isc w lewo bo wyjdzisz poza plansze!";
                } else{
                    notification = "PRAWIDŁOWY RUCH! POZYCJA ZOSTAŁA ZAKTUALIZOWANA";
                    player.setX(moveLeft.move(player.getX()));
                }
                break;
            case 'D':
                if ((player.getX()) == boardMaxX) {
                    notification = "Nie mozesz isc w prawo bo wyjdzisz poza plansze!";
                } else {
                    notification = "PRAWIDŁOWY RUCH! POZYCJA ZOSTAŁA ZAKTUALIZOWANA";
                    player.setX(moveRight.move(player.getX()));
                }
                break;
            default:
                System.out.println("Nie ma takiego kierunku");
                break;
        }
       return notification;

    }
}
