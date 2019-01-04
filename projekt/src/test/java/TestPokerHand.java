package src.test.java;

import src.main.java.PokerHand;
import src.main.resources.Player;
import src.main.resources.HandInfo;
import src.main.resources.Card;
import src.main.resources.Street;
import java.util.*;

public class TestPokerHand {

  public static void main(String[] args) {


    HandInfo hi = new HandInfo("CC GBG", "Cashgame", 10,10 );
    ArrayList<Player> players = new ArrayList<>();
    ArrayList<Street> streets = new ArrayList<>();
    ArrayList<Card> cards = new ArrayList<>();

    PokerHand ph = new PokerHand(hi,players,streets,cards);

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

    ph.printPokerHand();

    Street pf = new Street(Street.Streets.PREFLOP,Street.pot(),players);
    streets.add(pf);

    pf.postSmall(p1,10);
    pf.postBig(p2,10);
    pf.fold(p3);
    pf.raise(p4,50);
    pf.fold(p5);
    pf.call(p1);
    pf.call(p2);

    Card c1 = new Card(Card.Suit.HEARTS,Card.Rank.ACE);
    Card c2 = new Card(Card.Suit.SPADES,Card.Rank.DEUCE);
    Card c3 = new Card(Card.Suit.HEARTS,Card.Rank.FIVE);

    cards.add(c1);
    cards.add(c2);
    cards.add(c3);

    ph.printPokerHand();

  }

}
