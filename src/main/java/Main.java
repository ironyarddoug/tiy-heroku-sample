
import spark.Spark;
import spark.ModelAndView;

import spark.template.mustache.MustacheTemplateEngine;

public class Main {

  public static void main(String[] args) {

    int port = System.getenv("PORT") != null ? Integer.valueOf(System.getenv("PORT")) : 4567;
    Spark.port(port);
    Spark.staticFileLocation("/public");

    Spark.get(
            "/",
            (req, res) -> {

              return new ModelAndView(null, "home.mustache");
            },
            new MustacheTemplateEngine()
    );


  }

}
