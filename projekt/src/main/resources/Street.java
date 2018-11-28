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
      System.out.println("popsti...");
      break;
      case CHECK:
      System.out.println();
      break;
      default:
      ;
    }

  }



}
