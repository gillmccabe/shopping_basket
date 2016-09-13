package shopping_basket;
import java.util.*;

public class Basket {

  private ArrayList<Item> basket;

  public Basket(){
    this.basket = new ArrayList<Item>();
  }

  public int getCount(){
    return basket.size();
  }


}