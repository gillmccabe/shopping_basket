package shopping_basket;
import java.util.*;

public class Customer {

  String name;
  boolean loyaltyCard;
  double money;

  public Customer(String name, boolean loyaltyCard, double money){
    this.name = name;
    this.loyaltyCard = loyaltyCard;
    this.money = money;
  }

  public String getName(){
    return this.name;
  }

  public void setName(String newName){
    this.name = newName;
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