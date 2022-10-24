public class Terning {
    private int antalSider;
    public static int DEFAUlT_SIDER = 6;
    private int oejenVaerdi = 1;

    //////////////////////////////////////////////////////////////////////////////////
    //Constructor til terning
    public Terning() {
        this.antalSider = DEFAUlT_SIDER;
    }
    public Terning(int antalSider) {
        this.antalSider = antalSider;
    }
    //////////////////////////////////////////////////////////////////////////////////
    //method til at slå terning som ændre terningens værdi til et tilfældigt tal mellem 1 og 6
    public int slaaTerning() {
        this.oejenVaerdi = (int) ((Math.random() * antalSider)+1);
        return oejenVaerdi;
    }
    public int getOejenVaerdi() {
        return oejenVaerdi;
    }
    public int setOejenVaerdi(int oejenVaerdiInt) {
        if (oejenVaerdiInt <= antalSider && oejenVaerdiInt >= 1) {
            this.oejenVaerdi = oejenVaerdiInt;
            return oejenVaerdi;
        } else {
            System.out.println("Input er over eller under antalsider, skal være imellem 1 og antalsider");
            return oejenVaerdi;
        }
    }
    @Override
    public String toString() {
        return Integer.toString(oejenVaerdi);
    }
}
