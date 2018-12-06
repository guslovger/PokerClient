package src.main.resources;

public abstract class BettingStructure {

  double bigBlind;
  double smallBlind;

  public void setSmallBlind(Double smallBlind){
    this.smallBlind = smallBlind;
  }

  public double smallBlind(){
    return this.smallBlind;
  }

  public void setBigBlind(Double bigBlind){
    this.bigBlind = bigBlind;
  }

  public double bigBlind(){
    return this.bigBlind;
  }

  public abstract String toString();

  public abstract boolean repOK();

}
