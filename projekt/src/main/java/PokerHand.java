package src.main.java;

import src.main.resources.Player;
import java.util.*;
import src.main.resources.HandInfo;
import src.main.resources.Street;
import src.main.resources.Card;

public class PokerHand {

  private HandInfo handInfo; //Overview info of hand
  public static List<Player> playerList = new ArrayList<>(); //The players playing the hand
  public static List<Street> streetList = new ArrayList<>(); //What happened in the different streets of the hand
  public static List<Card> communityCards = new ArrayList<>(); //The community cards the dealer puts on the table

  public PokerHand(HandInfo handInfo, ArrayList<Player> playerList,
  ArrayList<Street> streetList, ArrayList<Card> communityCards){
    this.handInfo = handInfo;
    this.playerList = playerList;
    this.streetList = streetList;
    this.communityCards = communityCards;
  }

  public void printPokerHand(){
    System.out.println(" ");
    System.out.println(handInfo.toString());
    System.out.println(" ");
    for (Player p : playerList) {
      System.out.println(p);
    }
    System.out.println(" ");
    for (Street s : streetList) {
      System.out.println(s);
    }
    System.out.println(" ");
    System.out.println("Klart");
  }
}
