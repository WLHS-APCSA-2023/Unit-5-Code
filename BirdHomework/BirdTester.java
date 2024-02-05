import java.util.Arrays;

public class BirdTester {
    public static void main(String[] args) {
        Bird westernBlueBird = new Bird("Western Blue Bird",1);
        String[] wbbColors = new String[]{"Blue","White","Brown"};
        westernBlueBird.setPrimaryColors(wbbColors);
        System.out.println(westernBlueBird.getName());
    }
}
