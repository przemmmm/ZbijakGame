package moveController;

import players.PlayerComputer;

import java.util.Random;

public class ComputerMove {

    ComputerMoveUp computerMoveUp = new ComputerMoveUp();
    ComputerMoveDown computerMoveDown = new ComputerMoveDown();
    ComputerMoveLeft computerMoveLeft = new ComputerMoveLeft();
    ComputerMoveRight computerMoveRight = new ComputerMoveRight();



    public PlayerComputer computerMove(PlayerComputer player, int boardMaxX, int boardMaxY) {

        Random rnd = new Random();
        int moveDirection = rnd.nextInt(4); //do sprawdzenia jaki zakres losuje

        switch (moveDirection) {
            case 0 -> {
                if (player.getY() == boardMaxY) {
                    computerMoveDown.move(player);
                } else computerMoveUp.move(player);
            }
            case 1 -> {
                if (player.getY() == 0) {
                    computerMoveUp.move(player);
                } else computerMoveDown.move(player);
            }
            case 2 -> {
                if (player.getX() == 0) {
                    computerMoveRight.move(player);
                } else computerMoveLeft.move(player);
            }
            case 3 -> {
                if (player.getX() == boardMaxX) {
                    computerMoveLeft.move(player);
                } else computerMoveRight.move(player);
            }
            default -> {
            }
        }
        return player;
    }


}