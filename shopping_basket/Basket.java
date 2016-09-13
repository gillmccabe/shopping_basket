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



}