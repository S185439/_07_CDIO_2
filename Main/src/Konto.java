public class Konto {

    private int penge;

    Konto() {
        int startVaerdi = 1000;
        penge = startVaerdi;
    }

    public void transaktion(int vaerdi) {
        penge = penge+vaerdi;
    }

    public int getPenge() {
        return penge;
    }
    public int setPenge(int vaerdi) {
        penge = vaerdi;
        return penge;
    }
    public String toString() {
        return Integer.toString(penge);
    }

}
