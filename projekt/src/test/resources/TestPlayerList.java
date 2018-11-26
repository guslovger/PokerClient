package src.test.resources;

import java.util.*;
import src.main.resources.Player;
import src.main.resources.Card;

public class TestPlayerList {

  public static void main(String[] args) {

    ArrayList<Player> players = new ArrayList<>();

    Player p1 = new Player("Max",220,"SB", new Card("Hearts",6), new Card("Spades",6));
    Player p2 = new Player("Frans",160,"BB", new Card("Diamonds",5), new Card("Clubs",5));
    Player p3 = new Player("Dejan",195,"HJ");
    Player p4 = new Player("HERO",150,"CO", new Card("Hearts",11), new Card("Hearts",10));
    Player p5 = new Player("Unknown",100,"BUT");

    players.add(p1);
    players.add(p2);
    players.add(p3);
    players.add(p4);
    players.add(p5);

    for (Player p : players) {
      System.out.println(p);
    }
  }

}
