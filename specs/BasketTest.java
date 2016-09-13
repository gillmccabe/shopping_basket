import static org.junit.Assert.*;
import org.junit.*;
import shopping_basket.*;

public class BasketTest {

  Basket basket;
  Item item1;
  Item item2;

  @Before public void before(){
    basket = new Basket();
    item1 = new Item("bread", 1.5);
    item2 = new Item("milk", 2);

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

}