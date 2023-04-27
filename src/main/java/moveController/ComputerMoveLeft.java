package moveController;

import computerController.ComputerMovement;
import controller.PlayerComputer;

public class ComputerMoveLeft extends ComputerMovement {
    @Override
    public PlayerComputer move(PlayerComputer player) {

        player.setX(player.getX() - 1);

        return player;
    }
}
