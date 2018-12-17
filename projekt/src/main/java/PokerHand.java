package src.main.java;

import src.main.resources.Player;
import java.util.*;
import src.main.resources.HandInfo;
import src.main.resources.Street;
import src.main.resources.Card;

public class PokerHand {

  List<Player> players;
  List<Street> streets;
  void run() {
    for (Street st : streets) {
      st.run();
    }
  }

}
