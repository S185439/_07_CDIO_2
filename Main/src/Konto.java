public class Konto {

    private int penge;

    Konto() {
        int startVaerdi = 1000;
        penge = startVaerdi;
    }

    public void plusPenge(int vaerdi) {
        penge = penge+vaerdi;
    }
    public void minusPenge(int vaerdi) {
        penge = penge-vaerdi;
    }

    public int getPenge() {
        return penge;
    }

    public String toString() {
        return Integer.toString(penge);
    }

}
