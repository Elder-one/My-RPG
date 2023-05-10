
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Mage nicci = new Mage("Darkness", "Nicci", 500, 1000);
        Mage zed = new Mage("Wisdom", "Zed", 500, 1000);

        nicci.SetLevel(90);
        nicci.FireBlast(nicci);

        System.out.println(nicci);
        System.out.println(zed);
    }
}
