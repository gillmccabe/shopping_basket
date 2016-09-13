import static org.junit.Assert.*;
import org.junit.*;
import shopping_basket.*;

public class BasketTest {

  Basket basket;
  Item item1;
  Item item2;
  Item item3;
  Item item4;

  @Before public void before(){
    basket = new Basket();
    item1 = new Item("bread", 1.5, false);
    item2 = new Item("milk", 2, true);
    item3 = new Item("steak", 10, false);
    item4 = new Item("cheese", 8, true);

  }

  @Test
  public void basketStartsEmpty(){
    assertEquals(0, basket.getCount());
  } 

  @Test
  public void canAddItemToBasket(){
    assertEquals(0, basket.getCount());
    basket.addItem(item1);
    assertEquals(1, basket.getCount());
  }

  @Test
  public void canRemoveItemFromBasket(){
    basket.addItem(item1);
    assertEquals(1, basket.getCount());
    basket.removeItem(item1);
    assertEquals(0, basket.getCount());
  }

  @Test
  public void canEmptyBasket(){
    basket.addItem(item1);
    basket.addItem(item2);
    assertEquals(2, basket.getCount());
    basket.empty();
    assertEquals(0, basket.getCount());
  }

  @Test
  public void canGetTotalCost(){
    basket.addItem(item1);
    basket.addItem(item2);
    assertEquals(3.5, basket.getTotalCost(), 0.01);
  }

  @Test 
  public void canGetBogofItems(){
    basket.addItem(item1);
    basket.addItem(item2);
    assertEquals(2, basket.getCount());
    assertEquals(1, basket.getBogofItems().size());
  }

  @Test
  public void canGetTotalCostWithBogof(){
    basket.addItem(item1);
    basket.addItem(item1);
    basket.addItem(item2);
    basket.addItem(item2);
    assertEquals(5, basket.getTotalCostWithBogof(), 0.01);
  }

  @Test
  public void canGetTotalCostWithDiscount(){
    basket.addItem(item3);
    basket.addItem(item3);
    basket.addItem(item4);
    basket.addItem(item4);
    assertEquals(25.2, basket.getTotalWithDiscountOver20(), 0.01);
  }

}