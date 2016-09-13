package shopping_basket;
import java.util.*;

public class Basket {

  private ArrayList<Item> basket;
  private Item item;

  public Basket(){
    this.basket = new ArrayList<Item>();
  }

  public int getCount(){
    return basket.size();
  }

  public void addItem(Item item){
    basket.add(item);
  }

  public Item removeItem(Item item){
    basket.remove(item);
    return item;
  }

  public void empty(){
    basket.clear();
  }

  public double getTotalCost(){
    double total_cost = 0;
    for(Item item : basket){
      total_cost += item.getCost();
    }
    return total_cost;
  }

  public ArrayList<Item> getBogofItems(){
    ArrayList<Item> bogof_items = new ArrayList<Item>();
    for (Item item : basket){
      if (item.getBogof() == true){
        bogof_items.add(item);
      }
    }
    return bogof_items;
  }


  


}