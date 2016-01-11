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
    Triangle testTriangle = new Triangle(1, 2, 3);
    assertEquals(false, testTriangle.isTriangle());
  }

  @Test
  public void isTriangle_whenATriangle_true() {
    Triangle testTriangle = new Triangle(2, 2, 2);
    assertEquals(true, testTriangle.isTriangle());
  }

  @Test
  public void isScalene_whenTriangleIsNotScalene_false() {
    Triangle testTriangle = new Triangle(2, 3, 2);
    assertEquals(false, testTriangle.isScalene());
  }

  @Test
  public void isScalene_whenTriangleIsScalene_true() {
    Triangle testTriangle = new Triangle(2, 3, 4);
    assertEquals(true, testTriangle.isScalene());
  }

  @Test
  public void isIsosceles_whenTriangleIsNotIsosceles_false() {
    Triangle testTriangle = new Triangle(3, 4, 5);
    assertEquals(false, testTriangle.isIsosceles());
  }

  @Test
  public void isIsosceles_whenTriangleIsIsosceles_true() {
    Triangle testTriangle = new Triangle(2, 2, 5);
    assertEquals(true, testTriangle.isIsosceles());
  }

  @Test
  public void isEquilateral_whenTriangleIsNotEquilateral_false() {
    Triangle testTriangle = new Triangle(2, 2, 5);
    assertEquals(false, testTriangle.isEquilateral());
  }

  @Test
  public void isEquilateral_whenTriangleIsEquilateral_true() {
    Triangle testTriangle = new Triangle(5, 5, 5);
    assertEquals(true, testTriangle.isEquilateral());
  }

}
