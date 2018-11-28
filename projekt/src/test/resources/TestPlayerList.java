package src.test.resources;

import java.util.*;
import src.main.resources.Player;
import src.main.resources.Card;

public class TestPlayerList {

  public static void main(String[] args) {

    ArrayList<Player> players = new ArrayList<>();

    Player p1 = new Player("Max",220,"SB",
    new Card(Card.Suit.HEARTS,Card.Rank.SIX), new Card(Card.Suit.SPADES,Card.Rank.SIX));
    Player p2 = new Player("Frans",160,"BB",
    new Card(Card.Suit.DIAMONDS,Card.Rank.FIVE), new Card(Card.Suit.CLUBS,Card.Rank.FIVE));
    Player p3 = new Player("Dejan",195,"HJ");
    Player p4 = new Player("HERO",150,"CO",
    new Card(Card.Suit.HEARTS,Card.Rank.JACK), new Card(Card.Suit.HEARTS,Card.Rank.TEN));
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
