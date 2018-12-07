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
    Street pf = new Street(PREFLOP); ????????????????????++

    Player p1 = new Player("Max",2000,Player.Position.SB,
    new Card(Card.Suit.HEARTS,Card.Rank.SIX), new Card(Card.Suit.SPADES,Card.Rank.SIX));
    Player p2 = new Player("Frans",1600,Player.Position.BB,
    new Card(Card.Suit.DIAMONDS,Card.Rank.FIVE), new Card(Card.Suit.CLUBS,Card.Rank.FIVE));
    Player p3 = new Player("Player 3",1860,Player.Position.HJ);
    Player p4 = new Player("HERO",1500,Player.Position.CO,
    new Card(Card.Suit.HEARTS,Card.Rank.JACK), new Card(Card.Suit.HEARTS,Card.Rank.TEN));
    Player p5 = new Player("Player 5",1000,Player.Position.BUT);

    players.add(p1);
    players.add(p2);
    players.add(p3);
    players.add(p4);
    players.add(p5);

    Street.players = players;

    for (Player p : players) {
      System.out.println(p);
    }

    System.out.println("================================");
    System.out.println("Hand begins!");
    System.out.println("================================");

    p1.postSmall(10);
    p2.postBig(10);
    p3.fold();
    p4.raise(50);
    p5.fold();
    p1.call();
    p2.call();

    ArrayList<Card> communityCards = new ArrayList<>();
    Card c1 = new Card(Card.Suit.HEARTS,Card.Rank.ACE);
    Card c2 = new Card(Card.Suit.SPADES,Card.Rank.DEUCE);
    Card c3 = new Card(Card.Suit.HEARTS,Card.Rank.FIVE);

    communityCards.add(c1);
    communityCards.add(c2);
    communityCards.add(c3);

    System.out.println("================================");
    System.out.println("Current pot: " + Street.printPot());
    System.out.println("Flop is dealt");
    for (Card c : communityCards){
      System.out.println(c);
    }
    System.out.println("================================");

    p1.check();
    st.bet(p2,300);
    p4.call();
    p1.fold();


    Card c4 = new Card(Card.Suit.SPADES,Card.Rank.KING);
    communityCards.add(c4);

    System.out.println("================================");
    System.out.println("Current pot: " + Street.printPot());
    System.out.println("Turn is dealt");
    for (Card c : communityCards){
      System.out.println(c);
    }
    System.out.println("================================");

    p2.bet(500);
    p4.call();

    Card c5 = new Card(Card.Suit.HEARTS,Card.Rank.FOUR);
    communityCards.add(c5);

    System.out.println("================================");
    System.out.println("Current pot: " + Street.printPot());
    System.out.println("River is dealt");
    for (Card c : communityCards){
      System.out.println(c);
    }
    System.out.println("================================");

    p2.check();
    p4.allin();
    p2.call();

  }

}
