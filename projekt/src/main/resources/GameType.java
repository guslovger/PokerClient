package src.main.resources;

public abstract class GameType {

  double ante;

  public abstract void setAnte(double ante);

  public double Ante(){
    return this.ante;
  }

  public abstract String toString();

  public abstract boolean repOK();
  
}
