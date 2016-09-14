import static org.junit.Assert.*;
import org.junit.*;
import shopping_basket.*;

public class CashierTest {

  Basket basket1;
  Basket basket2;
  Item item1;
  Item item2;
  Item item3;
  Item item4;
  Customer customer1;
  Customer customer2;
  Cashier cashier;

  @Before public void before(){
    cashier = new Cashier(basket1)
    customer1 = new Customer(true, 25);
    customer2 = new Customer(false, 15);
    basket1 = new Basket(customer1);
    basket2 = new Basket(customer2);
    item1 = new Item("bread", 1.5, false);
    item2 = new Item("milk", 2, true);
    item3 = new Item("steak", 10, false);
    item4 = new Item("cheese", 8, true);
  }

  @Test
  public void canGetTotalCost(){
    basket1.addItem(item1);
    basket1.addItem(item2);
    assertEquals(3.5, cashier.getTotalCost(), 0.01);
  }

}