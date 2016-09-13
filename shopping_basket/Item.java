package shopping_basket;

public class Item {
  private String name;
  private int cost;

  public Item(String name, int cost){
    this.name = name;
    this.cost = cost;
  }

  public String getName(){
    return this.name;
  }

  public void setName(String newName){
    this.name = newName;
  }

  public int getCost(){
    return this.cost;
  }

  public void setCost(int newCost){
    this.cost = newCost;
  }

}