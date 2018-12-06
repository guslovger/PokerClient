package src.main.resources;

import src.main.resources.Card;
import java.util.*;

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
  private double chips;
  protected double bet;
  private Position position;
  private final Card card1;
  private final Card card2;
  private double pot;

  ArrayList<Player> players = new ArrayList<>();

  // No constructor is needed (no-instantiate)
  public Player(Card card1, Card card2){
    this.name = "";
    this.chips = 0;
    this.bet = 0;
    this.card1 = card1;
    this.card2 = card2;
  }

  public Player(String name, double chips, Position position, Card card1, Card card2){
    this.name = name;
    this.chips = chips;
    this.position = position;
    this.bet = 0;
    this.card1 = card1;
    this.card2 = card2;
  }

  public Player(String name, double chips, Position position){
  this.name = name;
  this.chips = chips;
  this.position = position;
  card1=null;
  card2=null;
  }

  public String name() { return name; }
  public double chips() { return chips; }
  public void setChips(double chips) { this.chips = chips; }
  public double bet() { return bet; }
  public void setBet(double amount) { this.bet = amount; }
  public Position position() { return position; }
  public Card card1() { return card1; }
  public Card card2() { return card2; }

  public double getPot(){
    return this.pot;
  }

  public void addPot(double amount){
    this.pot += amount;
  }

  public void clearPot(){
    this.pot = 0.0;
  }

  public double getHighestBet()
  {
    double highestAmnt = 0;
    Iterator<Player> playerList = this.players.iterator();
    while (playerList.hasNext())
    {
      Player temp = playerList.next();
      if( temp.bet() > highestAmnt )
      highestAmnt = temp.bet();
    }
    return highestAmnt;
  }

  public void getCurrentBets()
  {
    Iterator<Player> playerList = this.players.iterator();
    while (playerList.hasNext())
    {
      Player temp = playerList.next();
      System.out.println( temp.name() + " Bet " + temp.bet() );
    }
  }

  public double bet(double amount) {
    this.chips -= amount;
    this.bet += amount;
    addPot(amount);
    System.out.println(name + " bets " + amount);
    return amount;
  }

  public double check(){
    return 0.0;
  }

  public double call(){
    double amount = getHighestBet() - this.bet;
    this.chips -= amount;
    this.bet += amount;
    addPot(amount);
    return amount;
  }

  public double fold(){
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
    bet(this.chips);
  }

  public void winPot(double amount){
    this.chips += amount;
  }


  /*
  public Player(String name, double chips, Position position, Card card1, Card card2){
  this.name = name;
  this.chips = chips;
  this.position = position;
  this.card1 = card1;
  this.card2 = card2;
} */

public boolean card1Folded(){
  return !(card1==null);
}
public boolean card2Folded(){
  return !(card2==null);
}

@Override
public String toString(){
  return name + " " + chips + " " + position + " | " + card1 + " " + card2;
}

}
