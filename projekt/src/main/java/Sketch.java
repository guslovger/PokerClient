class PokerHand_ {
  List<Player> players;
  List<Street> streets;
  void run() {
    for (Street st : streets) {
      st.run();
    }
  }
}

class Street {
  double pot;
  List<Player> players;
  List<StreetAction> actions;
  void run() {
    for (StreetAction a : actions) {
      switch (action.type) {
        case FOLD:
          fold(action.player(), action.amount());
          break;
          case BET:
          bet(action.player, action.amount());
          break;
      }
    }
  }
  void bet(StreetAction action) {
    double amount = action.amount;
    Player player = action.player();

  }
}

class StreetAction { // en rad i filen, t ex player1, c, 1000, S1

  Street street;
  enum Type {
    FOLD,
    CALL,
    RAISE; // osv
  }
  Player p;
  double amout;
  Action.Type type;

  Player player() {return player;}
  double amount() {return amount;}
  Action.Type type() {return type;}

  void do() {
    for(Action action : actions)
  }
}

class Action {
}
