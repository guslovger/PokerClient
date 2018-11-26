package src.main.resources;

public class Player {

  public String name;
  public int stack;
  public String position;


  public Player(String name, int stack, String position){
    this.name = name;
    this.stack = stack;
    this.position = position;
  }

  public String name() { return name; }
  public int stack() { return stack; }
  public String position() { return position; }

  @Override
  public String toString(){
    return name + " " + stack + " " + position;
  }
/*
  public Player createPlayer() {
    return Player(name + stack + position);
  }*/
/*
  public void addPlayer(Player p){
    return p.toString();
  }*/
}
