package services;

import static spark.Spark.*;

public class ColourService {
    public static void setup() {
        get("/colour", (req, res) -> {
            String name = req.queryParams("name");
            String colour = req.queryParams("colour");

            if (name == null || colour == null) {
                return "Please provide a name and a colour";
            }

            return "<h1 style='colour:" + colour + "'>Hello " + name + "</h1>";
        });

        post("/colour", (req, res) -> {
            String name = req.queryParams("name");
            String colour = req.queryParams("colour");

            if (name == null || colour == null) {
                return "Please provide a name and a colour";
            }

            return "<h1 style='colour:" + colour + "'>Hello " + name + "</h1>";
        });
    }
}
