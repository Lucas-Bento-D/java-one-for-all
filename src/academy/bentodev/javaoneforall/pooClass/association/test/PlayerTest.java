package academy.bentodev.javaoneforall.pooClass.association.test;

import academy.bentodev.javaoneforall.pooClass.association.domain.Player;

public class PlayerTest {
    public static void main(String[] args) {
        Player player1 = new Player("Messi");
        Player player2 = new Player("Cristiano Ronaldo");
        Player player3 = new Player("Modric");

        Player[] players = new Player[]{player1, player2, player3};
        for(Player player: players){
            player.print();
        }
    }
}
