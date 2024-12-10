package services;

import static spark.Spark.*;

public class StatsService {
    public static void setup() {
        get("/stats", (req, res) -> {
            Runtime runtime = Runtime.getRuntime();

            return "<h1>JVM Stats</h1>" +
                    "<p>Free Memory: " + runtime.freeMemory() + "</p>" +
                    "<p>Total Memory: " + runtime.totalMemory() + "</p>" +
                    "<p>Available Processors: " + runtime.availableProcessors() + "</p>";
        });
    }
}
