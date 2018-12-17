package src.test.resources;

import java.util.*;
import src.main.java.PokerHand;
import src.main.resources.Player;
import src.main.resources.Card;
import src.main.resources.HandInfo;
import src.main.resources.Street;

public class Test2 {

  public static void main(String[] args) {

    HandInfo hi = new HandInfo("CC GBG", "Cashgame", 10,10 );
    System.out.println(); //empty line for clarity in terminal during tests
    System.out.println(hi.toString());

    ArrayList<Player> players = new ArrayList<>();

    Player p1 = new Player("Player 1",378,Player.Position.SB);
    Player p2 = new Player("Player 2",170,Player.Position.BB);
    Player p3 = new Player("Player 3",754.06,Player.Position.LJ);
    Player p4 = new Player("Player 4",349.16,Player.Position.HJ);
    Player p5 = new Player("Player 5",1126.13,Player.Position.CO);
    Player p6 = new Player("HERO",572.7,Player.Position.BUT,
    new Card(Card.Suit.HEARTS,Card.Rank.ACE), new Card(Card.Suit.HEARTS,Card.Rank.QUEEN));

    players.add(p1);
    players.add(p2);
    players.add(p3);
    players.add(p4);
    players.add(p5);
    players.add(p6);


    for (Player p : players) {
      System.out.println(p);
    }

    Street pf = new Street(Street.Streets.PREFLOP,Street.pot(),players);

    System.out.println("================================");
    System.out.println("Hand begins!");
    System.out.println("================================");


    pf.postSmall(p1,2);
    pf.postBig(p2,4);
    pf.raise(p3,12);
    pf.call(p4);
    pf.call(p5);
    pf.raise(p6,56);
    pf.call(p1);
    pf.call(p2);
    pf.call(p3);
    pf.fold(p4);
    pf.call(p5);

    ArrayList<Card> communityCards = new ArrayList<>();
    Card c1 = new Card(Card.Suit.HEARTS,Card.Rank.TEN);
    Card c2 = new Card(Card.Suit.SPADES,Card.Rank.DEUCE);
    Card c3 = new Card(Card.Suit.HEARTS,Card.Rank.EIGHT);

    communityCards.add(c1);
    communityCards.add(c2);
    communityCards.add(c3);

    System.out.println("--------------------------------");
    System.out.println("Current pot: " + Street.pot());
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
    f.allin(p2);
    f.call(p3);
    f.fold(p5);
    f.allin(p6);
    f.fold(p1);
    f.fold(p3);

    Card c4 = new Card(Card.Suit.CLUBS,Card.Rank.JACK);
    communityCards.add(c4);

    System.out.println("--------------------------------");
    System.out.println("Current pot: " + Street.pot());
    for (Player p : players) {
      System.out.println(p);
    }
    System.out.println("--------------------------------");
      System.out.println("Turn is dealt");
      for (Card c : communityCards){
      System.out.println(c);
    }
    System.out.println("================================");

    Street t = new Street(Street.Streets.TURN,Street.pot(),players);

    Card c5 = new Card(Card.Suit.DIAMONDS,Card.Rank.KING);
    communityCards.add(c5);

    System.out.println("--------------------------------");
    System.out.println("Current pot: " + Street.pot());
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

    System.out.println("================================");
    System.out.println("Current pot: " + Street.pot());
    for (Player p : players) {
      System.out.println(p);
    }
}

}
