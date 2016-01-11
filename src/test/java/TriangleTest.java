import org.junit.*;
import static org.junit.Assert.*;

public class TriangleTest {
  @Test
  public void newTriangle_instantiatesCorrectly() {
    Triangle testTriangle = new Triangle(2, 2, 2);
    assertEquals(true, testTriangle instanceof Triangle);
  }

  @Test
  public void newTriangle_setsSideA() {
    Triangle testTriangle = new Triangle(3, 3, 3);
    assertEquals(3, testTriangle.getSideA());
  }

  @Test
  public void newTriangle_setsSideB() {
    Triangle testTriangle = new Triangle(1, 2, 3);
    assertEquals(2, testTriangle.getSideB());
  }

  @Test
  public void newTriangle_setsSideC() {
    Triangle testTriangle = new Triangle(3, 2, 1);
    assertEquals(1, testTriangle.getSideC());
  }

  @Test
  public void isTriangle_whenNotATriangle_false() {
    Triangle testTriangle = new Triangle(2, 2, 8);
    assertEquals(false, testTriangle.isTriangle());
  }

}
