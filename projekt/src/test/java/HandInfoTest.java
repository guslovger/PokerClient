package src.test.java;

import src.main.resources.HandInfo;

public class HandInfoTest {

  public static void main(String[] args) {

    HandInfo hi = new HandInfo("CC GBG", "Cashgame", "10/10");
    HandInfo hi2 = new HandInfo("CC Malmo", "Tournament", "500/1000/1000");
    System.out.println(hi.toString());
    System.out.println(hi2.toString());

  }

}
