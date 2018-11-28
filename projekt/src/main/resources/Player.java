package src.main.resources;

import src.main.resources.Card;

public class Player {

  public enum Position {
    SB,
    BB,
    UTG,
    UTG1,
    UTG2,
    MP,
    LJ,
    HJ,
    CO,
    BUT;
  }

  private final String name;
  private final int stack;
  private Position position;
  private final Card card1;
  private final Card card2;

  public Player(String name, int stack, Position position, Card card1, Card card2){
    this.name = name;
    this.stack = stack;
    this.position = position;
    this.card1 = card1;
    this.card2 = card2;
  }

  public String name() { return name; }
  public int stack() { return stack; }
  public Position position() { return position; }
  public Card card1() { return card1; }
  public Card card2() { return card2; }

  public Player(String name, int stack, Position position){
    this.name = name;
    this.stack = stack;
    this.position = position;
    card1=null;
    card2=null;
  }

  public boolean card1Folded(){
    return !(card1==null);
  }
  public boolean card2Folded(){
    return !(card2==null);
  }

  @Override
  public String toString(){
    return name + " " + stack + " " + position + " | " + card1 + " " + card2;
  }

}
