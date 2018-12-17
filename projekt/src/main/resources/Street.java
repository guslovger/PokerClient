package src.main.resources;

import src.main.resources.Player;
import src.main.resources.Card;
import java.util.*;

public class Street {

  private static double pot;
  public static ArrayList<Player> players = new ArrayList<>();
  protected double bet;
  protected double currentRaise;
  protected double stack;
  private StreetName streetName;

  public enum StreetName {
    PREFLOP,
    FLOP,
    TURN,
    RIVER;
  }

  public Street(StreetName streetName, double pot, ArrayList<Player> players){
    this.streetName = streetName;
    this.pot = pot;
    this.players = players;
    resetPrevBet();
  }

  public static double pot(){ return pot; }

  void run() {
    for (StreetAction a : actions) {
      switch (action.type) {
        case FOLD:
          fold(action.player());
          break;
          case BET:
          bet(action.player(), action.amount());
          break;
          case CALL:
          call(action.player());
          break;
          case RAISE:
          raise(action.player(), action.amount());
          break;
          case CHECK:
          check(action.player());
          break;
          case ALLIN:
          allin(action.player());
          break;
          case POSTSMALL:
          postSmall(action.player(), action.amount());
          break;
          case POSTBIG:
          postBig(action.player(), action.amount());
          break;
      }
    }
  }

  public void addPot(double amount){
    this.pot += amount;
  }

  public void fold(Player player){
    System.out.println("(" + player.position() + ")" + player.name() + " folds");
    players.remove(player);
  }

  public double check(Player player){
    System.out.println("(" + player.position() + ")" + player.name() + " checks");
    return 0.0;
  }

  public double postSmall(Player player, double amount){
    player.pay(amount);
    this.bet = amount;
    player.prevBet = amount;
    addPot(amount);
    System.out.println("(" + player.position() + ")" + player.name() +
    " posts small blind of " + amount);
    return amount;
  }

  public double postBig(Player player, double amount){
    player.pay(amount);
    this.bet = amount;
    player.prevBet = amount;
    addPot(amount);
    System.out.println("(" + player.position() + ")" + player.name() +
    " posts big blind of " + amount);
    return amount;
  }

  public double bet(Player player,double amount) {
    this.bet = amount /*- bet*/;
    player.pay(amount);
    player.prevBet = amount;
    addPot(amount);
    System.out.println("(" + player.position() + ")" + player.name() +
    " bets " + amount + " prevBet: " + player.prevBet());

    return amount;
  }

  public void resetPrevBet(){
    for (Player p : players) {
      p.resetPrevBet();
  //    System.out.println("resetting prev for "+ p.name());
    }
  }

  public double call(Player player){
    double amount = 0.0;
  //  System.out.println("in call(), player prevBet: " +
  //    player.name() + " " + player.prevBet());
    if (player.stack() >= bet) { // player has more than last bet
      //System.out.println(player.prevBet());
      amount = bet - player.prevBet();
      player.prevBet = bet;
      player.pay(amount);
    } else if (player.stack() < bet) { // player has less than bet
      amount = player.stack();
      player.pay(player.stack());
    }
    addPot(amount);
    System.out.println("(" + player.position() + ")" + player.name() +
    " calls " + amount);
    return amount;
  }

  public double raise(Player player, double amount){
    if( (amount - bet) >= bet ){
      System.out.println("(" + player.position() + ")" + player.name() +
      " raises");
      currentRaise = amount - bet;
      bet(player, amount);
      System.out.println(currentRaise);
      return currentRaise;
    } else {
      System.err.println("Illegal raise size: " + amount + " bet was: " + bet);
      return 0.0;
    }
  }

  public void allin(Player player){
    double amount = 0.0;
    System.out.println("(" + player.position() + ")" + player.name() +
    " is all in!");
    amount = player.stack();
    bet(player, amount);
    player.pay(player.stack());
  }


}
