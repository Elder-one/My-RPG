public class Main {
    public static void main(String[] args) {
        Mage nicci = new Mage("Darkness", "Nicci", 100, 800);
        Mage zed = new Mage("Castle", "Zed", 80, 500);


        nicci.FireBlast(zed);
        nicci.FireBlast(zed);
        System.out.println(zed);
        System.out.println(nicci);
        nicci.FireBlast(zed);
        System.out.println(entity.count);
    }
}
