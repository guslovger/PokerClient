package src.test.java;

import java.util.*;
import src.main.resources.Player;

public class TestPlayerList {

  public static void main(String[] args) {

    ArrayList<Player> players = new ArrayList<>();

    Player p1 = new Player("Max",220,"SB");
    Player p2 = new Player("Frans",160,"BB");
    Player p3 = new Player("Dejan",195,"HJ");
    Player p4 = new Player("HERO",150,"CO");
    Player p5 = new Player("Unknown",100,"BUT");

    players.add(p1);
    players.add(p2);
    players.add(p3);
    players.add(p4);
    players.add(p5);

    for (Player p : players) {
      System.out.println(p);
    }
  }

}
