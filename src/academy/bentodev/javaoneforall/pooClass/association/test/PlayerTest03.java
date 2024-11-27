package academy.bentodev.javaoneforall.pooClass.association.test;

import academy.bentodev.javaoneforall.pooClass.association.domain.Player;
import academy.bentodev.javaoneforall.pooClass.association.domain.Team;

public class PlayerTest03 {
    public static void main(String[] args) {
        Player player1 = new Player("Messi");
        Team team = new Team("Barcelona");
        Player[] players = new Player[]{player1};

        player1.setTeam(team);
        team.setPlayers(players);

        System.out.println("----- jogador -----");
        player1.print();

        System.out.println("----- Time -----");
        team.print();
    }
}
