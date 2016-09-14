package shopping_basket;
import java.util.*;

public class Customer {

  boolean loyaltyCard;
  int money;

  public Customer(boolean loyaltyCard, double money){
    this.loyaltyCard = loyaltyCard;
    this.money = money;
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

  public int getMoney(){
    return this.money;
  }

  public void setMoney(int newMoney){
    this.money = newMoney;
  }


}