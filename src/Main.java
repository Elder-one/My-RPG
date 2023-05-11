
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Team darkness = new Team("Darkness");
        Mage nicci = new Mage("Nicci", 500, 1000, darkness);

        Mage zed = new Mage("Zed", 500, 1000);

        System.out.println(nicci);
        System.out.println(zed);

        darkness.add(zed);
        System.out.println("---------------------------");

        System.out.println(nicci);
        System.out.println(zed);

        System.out.println("---------------------------");

        for(BaseHero hero : darkness.heroes) {
            System.out.println(hero);
        }



    }
}
