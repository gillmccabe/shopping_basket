package shopping_basket;
import java.util.*;

public class Customer {

  boolean loyaltyCard;
  double money;

  public Customer(boolean loyaltyCard, double money){
    this.loyaltyCard = loyaltyCard;
    this.money = money;
  }

  public boolean getLoyaltyCard(){
    return this.loyaltyCard;
  }

  public void setLoyaltyCard(boolean newLoyaltyCard){
    this.loyaltyCard = newLoyaltyCard;
  }

  public double getMoney(){
    return this.money;
  }

  public void setMoney(double newMoney){
    this.money = newMoney;
  }


}