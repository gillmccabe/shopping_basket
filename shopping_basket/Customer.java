package shopping_basket;
import java.util.*;

public class Customer {

  int id;
  boolean loyaltyCard;

  public Customer(int id, boolean loyaltyCard){
    this.id = id;
    this.loyaltyCard = loyaltyCard;
  }

  public int getId(){
    return this.id;
  }

  public void setId(int newId){
    this.id = newId;
  }

  public boolean getLoyaltyCard(){
    return this.loyaltyCard;
  }

  public void setLoyaltyCard(boolean newLoyaltyCard){
    this.loyaltyCard = newLoyaltyCard;
  }

}