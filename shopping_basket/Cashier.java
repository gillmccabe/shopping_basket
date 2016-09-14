package shopping_basket;
import java.util.*;

public class Cashier {

  private Basket basket;

  public Cashier(Basket basket){
    this.basket = basket;
  }

  public Basket getBasket(){
    return basket;
  }

  // public double getTotalCost(){
  //   double total_cost = 0;
  //   for(Item item : Basket.basket) {
  //     total_cost += item.getCost();
  //   }
  //   return total_cost;
  // }

}