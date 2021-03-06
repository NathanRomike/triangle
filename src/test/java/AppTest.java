import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.assertj.core.api.Assertions.assertThat;
import static org.fluentlenium.assertj.FluentLeniumAssertions.assertThat;

import org.junit.*;
import static org.junit.Assert.*;

public class AppTest extends FluentTest {
  public WebDriver webDriver = new HtmlUnitDriver();

  @Override
  public WebDriver getDefaultDriver() {
    return webDriver;
  }

  @ClassRule
  public static ServerRule server = new ServerRule();

  @Test
    public void rootTest() {
      goTo("http://localhost:4567/");
      assertThat(pageSource()).contains("Triangle Tracker");
    }

    @Test
    public void isNotATriangle() {
      goTo("http://localhost:4567/");
      fill("#sideA").with("1");
      fill("#sideB").with("2");
      fill("#sideC").with("3");
      submit(".btn");
      assertThat(pageSource()).contains("You did not enter a valid triangle.");
    }

}
