import java.util.Map;
import java.util.HashMap;
import javax.swing.JOptionPane;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      //model.put("username", request.session().attribute("username"));

      model.put("template", "templates/home.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/triangle", (request, response) -> {
      HashMap<String, Object> model = new HashMap<String, Object>();
      int sideA = Integer.parseInt(request.queryParams("sideA"));
      int sideB = Integer.parseInt(request.queryParams("sideB"));
      int sideC = Integer.parseInt(request.queryParams("sideC"));

      Triangle myTriangle = new Triangle(sideA, sideB, sideC);
      model.put("myTriangle", myTriangle);

      model.put("template", "templates/triangle.vtl" );
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    // get("/welcome", (request, response) -> {
    //   HashMap<String, Object> model = new HashMap<String, Object>();
    //
    //   String inputtedUsername = request.queryParams("username");
    //   request.session().attribute("username", inputtedUsername);
    //   model.put("username", inputtedUsername);
    //
    //   model.put("template", "templates/welcome.vtl");
    //   return new ModelAndView(model, layout);
    // }, new VelocityTemplateEngine());
    //
    // post("/username", (request, response) -> {
    //   HashMap<String, Object> model = new HashMap<String, Object>();
    //
    //   String inputtedUsername = request.queryParams("username");
    //   request.session().attribute("username", inputtedUsername);
    //   model.put("username", inputtedUsername);
    //   model.put("template", "templates/welcome.vtl");
    //   return new ModelAndView(model, layout);
    // }, new VelocityTemplateEngine());
  }
}
