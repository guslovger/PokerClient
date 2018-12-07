package src.main.resources;

import src.main.resources.Card;
import java.util.*;
import src.main.resources.HandInfo;
import src.main.resources.Street;

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

  private static String name;
  private double stack;
  protected double bet;
  private Position position;
  private final Card card1;
  private final Card card2;

  public Player(String name, double stack, Position position, Card card1, Card card2){
    this.name = name;
    this.stack = stack;
    this.position = position;
    this.bet = 0;
    this.card1 = card1;
    this.card2 = card2;
  }

  public Player(String name, double stack, Position position){
    this.name = name;
    this.stack = stack;
    this.bet = 0;
    this.position = position;
    card1=null;
    card2=null;
  }

  public static String name() { return name; }
  public double stack() { return stack; }
  public double bet() { return bet; }
  public Position position() { return position; }
  public Card card1() { return card1; }
  public Card card2() { return card2; }

public boolean card1Folded(){
  return !(card1==null);
}
public boolean card2Folded(){
  return !(card2==null);
}

@Override
public String toString(){
  return name + " " + stack + " " + bet + " " + position + " | " + card1 + " " + card2;
}

public double pay(double amount) {
  this.stack -= amount;
  return amount;
}

/*
public double postSmall(double amount){
  this.chips -= amount;
  this.bet += amount;
  addPot(amount);
  System.out.println(name + " posts small blind of " + amount);
  return amount;
}

public double postBig(double amount){
  this.chips -= amount;
  this.bet += amount;
  addPot(amount);
  System.out.println(name + " posts big blind of " + amount);
  return amount;
}


public double check(){
  System.out.println(name + " checks");
  return 0.0;
}

public double call(){
  double amount = getHighestBet() - this.bet;
  this.chips -= amount;
  this.bet += amount;
  addPot(this.bet);
  System.out.println(name + " calls " + this.bet);
  return amount;
}

public double fold(){
  System.out.println(name + " folds");
  players.remove(this);
  this.bet = 0.0;
  return 0.0;
}

public boolean raise(double amount){
  if( (amount + this.bet) > getHighestBet() ){
    System.out.println(name + " raises to " + amount);
    bet(amount);
    return true;
  } else return false;
}

public void allin(){
  System.out.println(name + " is all in!");
  bet(this.chips);
}

public void addPot(double amount){
  this.pot += amount;
}
 */
}
// No constructor is needed (no-instantiate)
/*public Player(Card card1, Card card2){
  this.name = "";
  this.chips = 0;
  this.bet = 0;
  this.card1 = card1;
  this.card2 = card2;
} */
