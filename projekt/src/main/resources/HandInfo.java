package src.main.resources;

public class HandInfo {

  public String location;
  public String gametype;
  public String blinds;

  public HandInfo(String location, String gametype, String blinds) {
    this.location = location;
    this.gametype = gametype;
    this.blinds = blinds;
  }

  public String location() { return location; }
  public String gametype() { return gametype; }
  public String blinds() { return blinds; }

  @Override
  public String toString(){
    return location + " " + gametype + " " + blinds;
  }

}
