package shopping_basket;

public class Item {
  private String name;
  private double cost;
  private boolean bogof;

  public Item(String name, double cost, boolean bogof){
    this.name = name;
    this.cost = cost;
    this.bogof = bogof;
  }

  public String getName(){
    return this.name;
  }

  public void setName(String newName){
    this.name = newName;
  }

  public boolean getBogof(){
    return this.bogof;
  }

  public void setBogof(boolean newBogof){
    this.bogof = newBogof;
  }

  public double getCost(){
    return this.cost;
  }

  public void setCost(double newCost){
    this.cost = newCost;
  }

}