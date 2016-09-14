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
  Cashier cashier1;

  @Before public void before(){
    customer1 = new Customer("Brian", true, 25);
    customer2 = new Customer("Harriet", false, 15);
    basket1 = new Basket(customer1);
    basket2 = new Basket(customer2);
    item1 = new Item("bread", 1.5, false);
    item2 = new Item("milk", 2, true);
    item3 = new Item("steak", 10, false);
    item4 = new Item("cheese", 8, true);
    cashier1 = new Cashier(basket1);
  }

  @Test
  public void checkGetBasket() {
    assertNotNull(cashier1.getBasket());
  }

  // @Test
  // public void canGetTotalCost(){
  //   basket1.addItem(item1);
  //   basket1.addItem(item2);
  //   assertEquals(3.5, cashier1.getTotalCost(), 0.01);
  // }

}