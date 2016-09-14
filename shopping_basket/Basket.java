package shopping_basket;
import java.util.*;

public class Basket {

  protected ArrayList<Item> basket;
  private ArrayList<Item> bogof_items;
  private Customer customer;

  public Basket(Customer customer){
    this.basket = new ArrayList<Item>();
    this.bogof_items = new ArrayList<Item>();
    this.customer = customer;
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
    for (Item item : basket){
      if (item.getBogof() == true){
        bogof_items.add(item);
      }
    }
    return bogof_items;
  }

  public double getTotalWithBogofItems(){
    double total_cost = getTotalCost();
    ArrayList<Item> bogof_items = getBogofItems();
    for (Item item : bogof_items){
      total_cost -= ((item.getCost()) / 2);
    }
    return total_cost;
  }

  public double getTotalWithDiscountOver20(){
    double total_cost = getTotalWithBogofItems();
    if(total_cost > 20){
      total_cost -= (total_cost/100 * 10);
    }
    return total_cost;
  }

  public double getTotalWithLoyaltyCard(){
    double total_cost = getTotalWithDiscountOver20();
    if (customer.getLoyaltyCard() == true){
      total_cost -= (total_cost/100 * 2);
    }
    return total_cost;
  }

  public boolean customerCanAffordBasket(){
    double total_cost = getTotalWithLoyaltyCard();
    if (customer.getMoney() >= total_cost){
      return true;
    }
    return false;
  }



}