package src.main.resources;

import src.main.resources.Player;
import src.main.resources.Card;
import java.util.*;

public class Street {

  private static double pot;
  public static ArrayList<Player> players = new ArrayList<>();
  protected double bet;
  protected double stack;

  public enum Streets {
    PREFLOP,
    FLOP,
    TURN,
    RIVER
  }

  public static double printPot(){ return pot; }

  public void addPot(double amount){
    this.pot += amount;
  }

  public void getCurrentBets()  {
    Iterator<Player> playerList = this.players.iterator();
    while (playerList.hasNext())
    {
      Player temp = playerList.next();
      System.out.println( temp.name() + " Bet " + temp.bet() );
    }
  }

  public double postSmall(Player player, double amount){
    this.stack -= amount;
    this.bet += amount;
    addPot(amount);
    System.out.println(Player.name() + " posts small blind of " + amount);
    return amount;
  }

  public double postBig(Player player, double amount){
    this.stack -= amount;
    this.bet += amount;
    addPot(amount);
    System.out.println(Player.name() + " posts big blind of " + amount);
    return amount;
  }

  public double getHighestBet()  {
    double highestAmnt = 0;
    Iterator<Player> playerList = this.players.iterator();
    while (playerList.hasNext())
    {
      Player temp = playerList.next();
      if(temp.bet() > highestAmnt)
      highestAmnt = temp.bet();
    }
    return highestAmnt;
  }

  public double bet(Player player,double amount) {
    this.bet = 0;
    player.pay(amount);
    addPot(amount);
    System.out.println(Player.name() + " bets " + amount);
    return amount;
  }

  public double check(){
    System.out.println(Player.name() + " checks");
    return 0.0;
  }

  public double call(){
    double amount = getHighestBet() - this.bet;
    this.stack -= amount;
    this.bet += amount;
    addPot(this.bet);
    System.out.println(Player.name() + " calls " + this.bet);
    return amount;
  }

  public double fold(){
    System.out.println(Player.name() + " folds");
    players.remove(this);
    this.bet = 0.0;
    return 0.0;
  }

  public boolean raise(Player player, double amount){
    if( (amount + this.bet) > getHighestBet() ){
      System.out.println(Player.name() + " raises to " + amount);
      bet(player, amount);
      return true;
    } else return false;
  }

  public void allin(Player player){
    System.out.println(Player.name() + " is all in!");
    bet(player, this.stack);
  }


}
