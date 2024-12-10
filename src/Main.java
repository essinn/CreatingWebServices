import services.ColourService;
import services.DirService;
import services.HelloService;
import services.StatsService;

public class Main {
    public static void main(String[] args) {
        HelloService.setup();
        StatsService.setup();
        DirService.setup();
        ColourService.setup();

        System.out.println("Server is running on port 4567");
    }
}