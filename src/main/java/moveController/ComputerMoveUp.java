package moveController;

import computerController.ComputerMovement;
import controller.PlayerComputer;

public class ComputerMoveUp extends ComputerMovement {
    @Override
    public PlayerComputer move(PlayerComputer player) {

        player.setY(player.getY() + 1);

        return player;
    }
}
