package moveController;

import computerController.ComputerMovement;
import players.PlayerComputer;

public class ComputerMoveRight extends ComputerMovement {
    @Override
    public PlayerComputer move(PlayerComputer player) {

        player.setX(player.getX() + 1);

        return player;
    }
}

