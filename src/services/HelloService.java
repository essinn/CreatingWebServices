package services;

import static spark.Spark.*;

public class HelloService {
    public static void setup() {
        get("/hello", (req, res) -> "<h1>Hello World</h1>");
    }
}
