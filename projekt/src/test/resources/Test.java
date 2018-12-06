package src.test.resources;

import java.util.*;
import src.main.java.PokerHand;
import src.main.resources.Player;
import src.main.resources.Card;
import src.main.resources.HandInfo;

public class Test {

  public static void main(String[] args) {
/* Hur man kör street enums typ? Rikard skrev det.
    Street st = new Street();
    st.action(CHECK);
    ph.testHand(); */

    HandInfo hi = new HandInfo("CC GBG", "Cashgame", 10,10 );
    System.out.println(hi.toString());

    ArrayList<Player> players = new ArrayList<>();

    Player p1 = new Player("Max",2000,Player.Position.SB,
    new Card(Card.Suit.HEARTS,Card.Rank.SIX), new Card(Card.Suit.SPADES,Card.Rank.SIX));
    Player p2 = new Player("Frans",1600,Player.Position.BB,
    new Card(Card.Suit.DIAMONDS,Card.Rank.FIVE), new Card(Card.Suit.CLUBS,Card.Rank.FIVE));
    Player p3 = new Player("Player 3",1860,Player.Position.HJ, new Card(Card.Suit.CLUBS,Card.Rank.KING),
     new Card(Card.Suit.CLUBS,Card.Rank.QUEEN));
    Player p4 = new Player("HERO",1500,Player.Position.CO,
    new Card(Card.Suit.HEARTS,Card.Rank.JACK), new Card(Card.Suit.HEARTS,Card.Rank.TEN));
    Player p5 = new Player("Player 5",1000,Player.Position.BUT);

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
