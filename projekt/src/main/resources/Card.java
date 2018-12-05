package src.main.resources;

import java.util.*;

public class Card {

  public enum Suit {
    HEARTS,
    SPADES,
    DIAMONDS,
    CLUBS
  }
  public enum Rank {
    DEUCE(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    JACK(11),
    QUEEN(12),
    KING(13),
    ACE(14);
    private int val;
    private Rank(int val) {
      this.val = val;
    }
    public int val() {
      return val;
    }
  }

  private Suit suit;
  private Rank rank;

  public Card (Suit suit, Rank rank){
    this.suit = suit;
    this.rank = rank;
  }

  public Suit suit() { return suit; }
  public Rank rank() { return rank; }
  //public String suit() { return suit.toString(); }
  //public int value() { return rank.value(); }

  @Override
  public String toString(){
    return rank + " of " + suit + " |";
  }

  
  /*
  private static final List<Card> prototypeDeck =
  new ArrayList<Card>(52);

  static {
  for (Suit suit : Suit.values())
  for (Rank rank : Rank.values())
  prototypeDeck.add(new Card(suit, rank));
}
*/
}
