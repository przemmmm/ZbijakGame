package moveController;

import computerController.ComputerMovement;
import players.PlayerComputer;

public class ComputerMoveDown extends ComputerMovement {
    @Override
    public PlayerComputer move(PlayerComputer player) {

        player.setY(player.getY() - 1);

        return player;
    }
}