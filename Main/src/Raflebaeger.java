public class Raflebaeger {

    Terning terning1;
    Terning terning2;
    int sumAfTerninger;
    public Raflebaeger() {
        this.terning1 = new Terning();
        this.terning2 = new Terning();
        this.sumAfTerninger = 0;
    }

    public int slaaAlleTerninger() {
        terning1.slaaTerning();
        terning2.slaaTerning();
        this.sumAfTerninger = terning1.getOejenVaerdi() + terning2.getOejenVaerdi();
        return sumAfTerninger;
    }

    public int getSumAfTerninger() {
        if (sumAfTerninger == 0) {
            System.out.println("Terninger er ikke blevet slået, der er ikke nogen sum vaerdi");
            return sumAfTerninger;
        } else {
            return sumAfTerninger;
        }
    }
}
