package services;

import java.io.File;

import static spark.Spark.*;

public class DirService {
    public static void setup() {
        get("/dir", (req, res) -> {
            File currentDir = new File(".");

            StringBuilder response = new StringBuilder("<h1>Directory Listing</h1><ul>");

            for (File file : currentDir.listFiles()) {
                response.append("<li>").append(file.getName()).append("</li>");
            }

            response.append("</ul>");

            return response.toString();
        });
    }
}
