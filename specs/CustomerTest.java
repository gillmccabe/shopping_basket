import static org.junit.Assert.*;
import org.junit.*;
import shopping_basket.*;

public class CustomerTest {

  Customer customer; 

  @Before 
  public void before() {
    customer = new Customer("Brian", true, 32.5);
  }

  @Test
  public void customerHasName() {
    assertEquals("Brian", customer.getName());
  }

  @Test
  public void customerHasLoyaltyCard() {
    assertEquals(true, customer.getLoyaltyCard());
  }

  @Test
  public void customerHasMoney() {
    assertEquals(32.5, customer.getMoney(), 0.01);
  }
 
}