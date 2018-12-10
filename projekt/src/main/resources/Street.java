package src.main.resources;

import src.main.resources.Player;
import src.main.resources.Card;
import java.util.*;

public class Street {

  private static double pot;
  public static ArrayList<Player> players = new ArrayList<>();
  protected double bet;
  protected double stack;
  private Streets streets;

  public enum Streets {
    PREFLOP,
    FLOP,
    TURN,
    RIVER;
  }

  public Street(Streets streets, double pot, ArrayList<Player> players){
    this.streets = streets;
    this.pot = pot;
    this.players = players;
  }

  public static double printPot(){ return pot; }

  public void addPot(double amount){
    this.pot += amount;
  }

  public void getCurrentBets()  {
    Iterator<Player> playerList = this.players.iterator();
    while (playerList.hasNext())
    {
      Player p = playerList.next();
      System.out.println( p.name() + " Bet " + p.bet() );
    }
  }

  public double postSmall(Player player, double amount){
    player.pay(amount);
    this.bet = amount;
    addPot(amount);
    System.out.println("(" + player.position() + ")" + player.name() + " posts small blind of " + amount);
    return amount;
  }

  public double postBig(Player player, double amount){
    player.pay(amount);
    this.bet = amount;
    addPot(amount);
    System.out.println("(" + player.position() + ")" + player.name() + " posts big blind of " + amount);
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
    this.bet = amount - bet;
    player.pay(amount);
    addPot(amount);
    System.out.println("(" + player.position() + ")" + player.name() + " bets " + amount);

    return amount;
  }

  public double check(Player player){
    System.out.println("(" + player.position() + ")" + player.name() + " checks");
    return 0.0;
  }

  public double call(Player player){
    double amount = 0.0;
    if (player.stack() >= bet) { // player has more than last bet
      player.pay(bet);
      amount = bet;
    } else if (player.stack() < bet) { // player has less than bet
      amount = player.stack();
      player.pay(player.stack());
    }
    addPot(amount);
    System.out.println("(" + player.position() + ")" + player.name() + " calls " + amount);
    return amount;
  }

  public void fold(Player player){
    System.out.println("(" + player.position() + ")" + player.name() + " folds");
    players.remove(player);
  }

  public boolean raise(Player player, double amount){
    if( (amount - bet) >= bet ){
      System.out.println("(" + player.position() + ")" + player.name() + " raises");
      bet(player, amount);
      return true;
    } else {
      System.err.println("Illegal raise size: " + amount + " bet was: " + bet);
      return false;
    }
  }

  public void allin(Player player){
    double amount = 0.0;
    System.out.println("(" + player.position() + ")" + player.name() + " is all in!");
    amount = player.stack();
    bet(player, amount);
    player.pay(player.stack());
  }


}
