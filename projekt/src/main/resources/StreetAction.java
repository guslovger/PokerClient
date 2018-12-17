package src.main.resources;

public class StreetAction {

  Street street;

  enum Type {
    BET,
    FOLD,
    CALL,
    RAISE,
    CHECK,
    ALLIN,
    POSTSMALL,
    POSTBIG;
  }

  Player p;
  double amount;
  Action.Type type;

  Player player() { return player; }
  double amount() { return amount; }
  Action.Type type() { return type; }

  void do() {
    for(Action action : actions)
  }
}


}
