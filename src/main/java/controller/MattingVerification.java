package controller;

import players.PlayerComputer;
import players.PlayerUser;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class MattingVerification {

    public HashSet<PlayerComputer> isEnemyMatted(PlayerUser playerUser,  HashSet<PlayerComputer> enemyList) {

        HashSet<PlayerComputer> temporaryEnemyList = new LinkedHashSet<>();

        for (PlayerComputer computer : enemyList) {
            computer.getX();
            computer.getY();
            if (playerUser.getX() == computer.getX() && playerUser.getY() == computer.getY()) {
                System.out.println("BRAWO! WŁAŚNIE ZBIŁEŚ GRACZA  " + computer.getName());
                temporaryEnemyList.add(computer);
            }
        } return temporaryEnemyList;
    }

    public PlayerUser isUserMatted(PlayerUser user, PlayerComputer currentComputer) {

        if(currentComputer.getX()==user.getX() && currentComputer.getY()==user.getY()){
            System.out.println("ZOSTALES ZBITY PRZEZ GRACZA " + currentComputer.getName());
                user.setStatus(false);

        } return user;

    }
}
