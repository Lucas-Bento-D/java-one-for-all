package academy.bentodev.javaoneforall.pooClass.association.test;

import academy.bentodev.javaoneforall.pooClass.association.domain.Player;
import academy.bentodev.javaoneforall.pooClass.association.domain.Team;

public class PlayerTest02 {
    public static void main(String[] args) {
        Player player1 = new Player("Messi");
        Team team = new Team("Barcelona");

        player1.setTeam(team);
    }
}
