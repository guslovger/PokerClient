package src.main.resources;

import src.main.resources.Player;

public class Street {

  public enum Streets {
    PREFLOP,
    FLOP,
    TURN,
    RIVER
  }

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
  /*    if (Player.Position==SB) {
        System.out.println("Player posts HandInfo.smallBlind.");
      } else if (Player.Position==BB) {
        System.out.println("Player posts BB.");
      } else {
        System.out.println("Player can't post blinds");
      } */
      break;
      case CHECK:
      System.out.println("Player checks.");
      break;
      case FOLD:
      System.out.println("Player folds");
      break;
      case BET:
      System.out.println("Player bets x");
      break;
      case CALL:
      System.out.println("Player calls x");
      break;
      case RAISE:
      System.out.println("Player raises to x");
      break;
      default:
      ;
    }

  }



}
