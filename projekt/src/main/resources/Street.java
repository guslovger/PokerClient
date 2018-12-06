package src.main.resources;

import src.main.resources.Player;

public class Street {

  public enum Streets {
    PREFLOP,
    FLOP,
    TURN,
    RIVER
  }
/*
  public enum Action {
    POST,
    CHECK,
    FOLD,
    BET,
    CALL,
    RAISE
  }

  public void action(Action act){
    switch(act) {
      case POST:
      if (Player.Position==Player.Position.SB) {
        System.out.println("Player posts HandInfo.smallBlind.");
      } else if (Player.Position==Player.Position.BB) {
        System.out.println("Player posts BB.");
      } else {
        System.out.println("Player doesn't need to post blinds");
      }
      break;
      case CHECK:
      System.out.println(name + " checks");
      return 0.0;
      break;
      case FOLD:
      System.out.println(name + " folds");
      players.remove(this);
      this.bet = 0.0;
      return 0.0;
      break;
      case BET:
      System.out.println("Player bets x");
      break;
      case CALL:
      double amount = getHighestBet();
      this.chips -= amount;
      this.bet += amount;
      addPot(amount);
      System.out.println(name + " calls " + this.bet);
      return amount;
      break;
      case RAISE:
      System.out.println("Player raises to x");
      break;
      default:
      ;
    }

  } */

  /* Hur man kör street enums typ? Rikard skrev det.
    public static void main(String[] args) {
      Street st = new Street();
      st.action(CHECK);
      ph.testHand();
    }
*/


}
