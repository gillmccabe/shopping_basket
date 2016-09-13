import static org.junit.Assert.*;
import org.junit.*;
import shopping_basket.*;

public class ItemTest {

  Item item; 

  @Before 
  public void before() {
    item = new Item("bread", 2);
  }

  @Test
  public void itemHasName() {
    assertEquals("bread", item.getName());
  }

  @Test
  public void itemHasCost() {
    assertEquals(2, item.getCost());
  }
 
}