package src/main/resources;

public class NoLimit extends BettingStructure {

  public NoLimit(){

  }

  public NoLimit(double smallBlind, double bigBlind){
    this.smallBlind = smallBlind;
    this.bigBlind = bigBlind;
  }

  public String toString(){
    //AF implementation for the "Limit" class. - Vad fan betyder det?
    return ("\"No-Limit\" Table with Big Blind: " + this.bigBlind + " - Small Blind: "
                                          + this.smallBlind + "\n");
  }

  public boolean repOK(){
    //RI implementation for the "Limit" class. - Vad fan betyder det då?
    return this.bigBlind >=0 && this.smallBlind >=0;
  }

}
