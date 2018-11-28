package src.main.java;

import src.main.resources.Player;
import java.util.*;
import src.main.resources.HandInfo;
import src.main.resources.Street;
import src.main.resources.Card;

public class PokerHand {

  public String hand;
  public ArrayList<Player> players;


  /* info om var/när/vad som spelas. Spelare. Gator(pre,flop,turn,river)
                                            med tillhörande action */

  public PokerHand(String hand){
    this.hand = hand;
    this.players = new ArrayList<>();
  }
  public PokerHand(String hand, ArrayList<Player> players){
    this.hand = hand;
    this.players = players;
  }
  public String hand(){
   return hand;
  }
  public ArrayList<Player> players(){
    return players;
  }
  public void addPlayer(Player p){
    players.add(p);
  }

}
