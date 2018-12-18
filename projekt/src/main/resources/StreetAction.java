package src.main.resources;

public class StreetAction {

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

  private Player p;
  protected double amount;
  private Type type;
  private Street street;

  public StreetAction (Player player, Type type, double amount, Street street){
    this.player = player;
    this.type = type;
    this.amount = amount;
    this.street = street;
  }

  Player player() { return player; }
  double amount() { return amount; }
  Type type() { return type; }
  Street street() { return street; }

/*
  void do() {
    for(Action action : actions)
  } */

}
