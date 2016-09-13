import static org.junit.Assert.*;
import org.junit.*;
import shopping_basket.*;

public class BasketTest {

  Basket basket;

  @Before public void before(){
    basket = new Basket();
  }

  @Test
  public void basketStartsEmpty(){
    assertEquals(0, basket.getCount());
  } 


}