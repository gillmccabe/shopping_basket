import static org.junit.Assert.*;
import org.junit.*;
import shopping_basket.*;

public class ItemTest {

  Item item; 

  @Before 
  public void before() {
    item = new Item("bread", 1.5);
  }

  @Test
  public void itemHasName() {
    assertEquals("bread", item.getName());
  }

  @Test
  public void itemHasCost() {
    assertEquals(1.5, item.getCost(), 0.01);
  }
 
}