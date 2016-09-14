import static org.junit.Assert.*;
import org.junit.*;
import shopping_basket.*;

public class BasketTest {

  Basket basket1;
  Basket basket2;
  Item item1;
  Item item2;
  Item item3;
  Item item4;
  Customer customer1;
  Customer customer2;

  @Before public void before(){
    customer1 = new Customer("Brian", true, 25);
    customer2 = new Customer("Harriet", false, 15);
    basket1 = new Basket(customer1);
    basket2 = new Basket(customer2);
    item1 = new Item("bread", 1.5, false);
    item2 = new Item("milk", 2, true);
    item3 = new Item("steak", 10, false);
    item4 = new Item("cheese", 8, true);
  }

  @Test
  public void basketStartsEmpty(){
    assertEquals(0, basket1.getCount());
  } 

  @Test
  public void canAddItemToBasket(){
    assertEquals(0, basket1.getCount());
    basket1.addItem(item1);
    assertEquals(1, basket1.getCount());
  }

  @Test
  public void canRemoveItemFromBasket(){
    basket1.addItem(item1);
    assertEquals(1, basket1.getCount());
    basket1.removeItem(item1);
    assertEquals(0, basket1.getCount());
  }

  @Test
  public void canEmptyBasket(){
    basket1.addItem(item1);
    basket1.addItem(item2);
    assertEquals(2, basket1.getCount());
    basket1.empty();
    assertEquals(0, basket1.getCount());
  }

  @Test
  public void canGetTotalCost(){
    basket1.addItem(item1);
    basket1.addItem(item2);
    assertEquals(3.5, basket1.getTotalCost(), 0.01);
  }

  @Test 
  public void canGetBogofItems(){
    basket1.addItem(item1);
    basket1.addItem(item2);
    assertEquals(2, basket1.getCount());
    assertEquals(1, basket1.getBogofItems().size());
  }


  @Test
  public void canGetTotalCostWithDiscount(){
    basket1.addItem(item3);
    basket1.addItem(item3);
    basket1.addItem(item4);
    basket1.addItem(item4);
    assertEquals(32.4, basket1.getTotalWithDiscountOver20(), 0.01);
  }

  @Test
  public void canGetTotalWithLoyaltyCard(){
    basket1.addItem(item3);
    basket1.addItem(item3);
    assertEquals(19.6, basket1.getTotalWithLoyaltyCard(), 0.01);
  }

  @Test
  public void canCheckCustomerCanAffordBasket(){
    basket1.addItem(item3);
    basket1.addItem(item3);
    assertEquals(true, basket1.customerCanAffordBasket());
  }

  @Test
  public void canCheckCustomerCannotAffordBasket(){
    basket2.addItem(item3);
    basket2.addItem(item3);
    assertEquals(false, basket2.customerCanAffordBasket());
  }

}