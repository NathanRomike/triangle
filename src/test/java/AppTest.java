import org.junit.*;
import static org.junit.Assert.*;

public class AppTest {

  @Test
  public void coinCombo_shouldGiveCoinCombo75Cents_3Quarters() {
    App app = new App();
    String coinResult = "Here's what'cha got: 3 quarters, no dimes, no nickels, and no pennies.";
    assertEquals(coinResult, app.coinCombo(75));
  }
