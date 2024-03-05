import java.util.Arrays;

public class BirdTester {
    public static void main(String[] args) {
        Bird westernBlueBird = new Bird("Western Blue Bird","Sialia mexicana");
        westernBlueBird.setID(1);
        westernBlueBird.setLength(17.5);
        westernBlueBird.setWingspan(31.5);
        westernBlueBird.setWeight(27.5);
        String[] wbbColors = new String[]{"Blue","White","Brown"};
        westernBlueBird.setPrimaryColors(wbbColors);
        System.out.println(westernBlueBird);
        westernBlueBird.printDimensions();
    }
}
