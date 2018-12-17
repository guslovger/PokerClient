package src.main.java;

import src.main.resources.Player;
import java.util.*;
import src.main.resources.HandInfo;
import src.main.resources.Street;
import src.main.resources.Card;

public class PokerHand {

  private List<Player> players;
  private List<Street> streets;
  private HandInfo handinfo;

  void run() {
    for (Street st : streets) {
      st.run();
    }
  }

}
