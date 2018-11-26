package src.main.resources;

public class Card {

  private String suit;
  private int value;

  public Card (String suit, int value){
    this.suit = suit;
    this.value = value;
  }

  public String suit() { return suit; }
  public int value() { return value; }

  @Override
  public String toString(){
    return suit + " " + value;
  }

}
