package src.test.resources;

//import klasser.PokerHand;
import java.util.*;
import src.main.resources.HandInfo;
import src.main.resources.Player;

public class Test {

  public static void main(String[] args) {

/*    ArrayList<PokerHand> hands = new ArrayList<>();
      hands.add("TexasNL","Cashgame","CC GBG","Friday",4);
      hands.add("TexasNL","Cashgame","CC GBG","Thursday",3);
      hands.add("TexasNL","Cashgame","CC GBG","Tuesday",2);

      System.out.println(hands); */

      Player p = new Player("Maxi", 220, "UTG");

      System.out.println(p.toString());


  }

}
