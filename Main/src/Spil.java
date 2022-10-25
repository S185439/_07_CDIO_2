public class Spil {
    public static void main(String[] args) {
        SpillePlade sP = new SpillePlade();
        Felt f1 = sP.rykTilFelt(2);
        System.out.println(f1.navn);
    }
}
