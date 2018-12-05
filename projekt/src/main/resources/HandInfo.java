package src.main.resources;

public class HandInfo {

  private final String location;
  private final String gametype;
  public static int smallBlind;
  public static int bigBlind;

  public HandInfo(String location, String gametype, int smallBlind, int bigBlind) {
    this.location = location;
    this.gametype = gametype;
    this.smallBlind = smallBlind;
    this.bigBlind = bigBlind;
  }

  public String location() { return location; }
  public String gametype() { return gametype; }
  public int smallBlind() { return smallBlind; }
  public int bigBlind() { return bigBlind; }

  @Override
  public String toString(){
    return location + " | " + gametype + ", " + smallBlind + "/" + bigBlind;
  }

}
