package controller;

import moveController.MoveDown;
import moveController.MoveLeft;
import moveController.MoveRight;
import moveController.MoveUp;

public class UserMove {

    MoveUp moveUp = new MoveUp();
    MoveDown moveDown = new MoveDown();
    MoveLeft moveLeft = new MoveLeft();
    MoveRight moveRight = new MoveRight();

    public PlayerUser playerMove(PlayerUser player, char direction) {

        switch (Character.toUpperCase(direction)) {
            case 'W':
                player.setY(moveUp.move(player.getY()));
                break;
            case 'S':
                player.setY(moveDown.move(player.getY()));
                break;
            case 'A':
                player.setX(moveLeft.move(player.getX()));
                break;
            case 'D':
                player.setX(moveRight.move(player.getX()));
                break;
            default:
                System.out.println("Nie ma takiego kierunku");
                break;

        }  return player;
    }


}
