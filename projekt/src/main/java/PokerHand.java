package src.main.java;

import src.main.resources.Player;
import java.util.*;
import src.main.resources.HandInfo;
import src.main.resources.Street;
import src.main.resources.Card;

public class PokerHand {

  //Måste fixa den här klassen så att man kan skapa PokerHand-objekt.
  //Alltså göra en kontruktor med handinfo, playerlista och lista med streets
  //som har listor med actions. Får kolla mer på det senare.

  public String hand;
  public ArrayList<Player> players;
  public int potSize;

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

}
