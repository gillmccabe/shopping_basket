package shopping_basket;

public class Item {
  private String name;
  private double cost;

  public Item(String name, double cost){
    this.name = name;
    this.cost = cost;
  }

  public String getName(){
    return this.name;
  }

  public void setName(String newName){
    this.name = newName;
  }

  public double getCost(){
    return this.cost;
  }

  public void setCost(double newCost){
    this.cost = newCost;
  }

}