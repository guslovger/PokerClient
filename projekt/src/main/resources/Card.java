package src.main.resources;

public class Card {

  public String suit;
  public String value;

  public Card (String suit, String value){
    this.suit = suit;
    this.value = value;
  }

  public String suit() { return suit; }
  public String value() { return value; }

}
