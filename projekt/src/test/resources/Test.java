package src.test.resources;

import java.util.*;
import src.main.java.PokerHand;
import src.main.resources.Player;
import src.main.resources.Card;
import src.main.resources.HandInfo;
import src.main.resources.Street;

public class Test {

  public static void main(String[] args) {

    HandInfo hi = new HandInfo("CC GBG", "Cashgame", 10,10 );
    System.out.println(); //empty line for clarity in terminal during tests
    System.out.println(hi.toString());

    ArrayList<Player> players = new ArrayList<>();

    Player p1 = new Player("Max",2000,Player.Position.SB,
    new Card(Card.Suit.HEARTS,Card.Rank.SIX), new Card(Card.Suit.SPADES,Card.Rank.SIX));
    Player p2 = new Player("Frans",2000,Player.Position.BB,
    new Card(Card.Suit.DIAMONDS,Card.Rank.FIVE), new Card(Card.Suit.CLUBS,Card.Rank.FIVE));
    Player p3 = new Player("Player 3",2000,Player.Position.HJ);
    Player p4 = new Player("HERO",2000,Player.Position.CO,
    new Card(Card.Suit.HEARTS,Card.Rank.JACK), new Card(Card.Suit.HEARTS,Card.Rank.TEN));
    Player p5 = new Player("Player 5",2000,Player.Position.BUT);

    players.add(p1);
    players.add(p2);
    players.add(p3);
    players.add(p4);
    players.add(p5);

    for (Player p : players) {
      System.out.println(p);
    }

    Street pf = new Street(Street.Streets.PREFLOP,Street.pot(),players);


    System.out.println("================================");
    System.out.println("Hand begins!");
    System.out.println("================================");


    pf.postSmall(p1,10);
    pf.postBig(p2,10);
    pf.fold(p3);
    pf.raise(p4,50);
    pf.fold(p5);
    pf.call(p1);
    pf.call(p2);

    ArrayList<Card> communityCards = new ArrayList<>();
    Card c1 = new Card(Card.Suit.HEARTS,Card.Rank.ACE);
    Card c2 = new Card(Card.Suit.SPADES,Card.Rank.DEUCE);
    Card c3 = new Card(Card.Suit.HEARTS,Card.Rank.FIVE);

    communityCards.add(c1);
    communityCards.add(c2);
    communityCards.add(c3);

    System.out.println("--------------------------------");
    System.out.println("Current pot: " + Street.printPot());
    for (Player p : players) {
      System.out.println(p);
    }
    System.out.println("--------------------------------");
    System.out.println("Flop is dealt");
    for (Card c : communityCards){
    System.out.println(c);
    }
    System.out.println("================================");

    Street f = new Street(Street.Streets.FLOP,Street.pot(),players);

    f.check(p1);
    f.check(p2);
    f.bet(p4,100);
    f.fold(p1);
    f.raise(p2,350);
    f.call(p4);

    Card c4 = new Card(Card.Suit.SPADES,Card.Rank.KING);
    communityCards.add(c4);

    System.out.println("--------------------------------");
    System.out.println("Current pot: " + Street.printPot());
    for (Player p : players) {
      System.out.println(p);
    }
    System.out.println("--------------------------------");
      System.out.println("Turn is dealt");
      for (Card c : communityCards){
      System.out.println(c);
    }
    System.out.println("================================");

    Street t = new Street(Street.Streets.TURN,850,players);

    t.bet(p2,500);
    t.call(p4);

    Card c5 = new Card(Card.Suit.HEARTS,Card.Rank.EIGHT);
    communityCards.add(c5);

    System.out.println("--------------------------------");
    System.out.println("Current pot: " + Street.printPot());
    for (Player p : players) {
      System.out.println(p);
    }
    System.out.println("--------------------------------");
    System.out.println("River is dealt");
    for (Card c : communityCards){
    System.out.println(c);
    }
    System.out.println("================================");

    Street r = new Street(Street.Streets.RIVER,Street.pot(),players);

    r.check(p2);
    r.allin(p4);
    r.call(p2);
    System.out.println("================================");
    System.out.println("Current pot: " + Street.printPot());
    for (Player p : players) {
      System.out.println(p);
    }
}

}
