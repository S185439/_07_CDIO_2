public class Raflebaeger {

    Terning terning1;
    Terning terning2;
    int sumAfTerninger;

    /**
     * Constructor til et RafleBaeger, opretter 2 terninge object, og saetter sumAfTerninger til 0
     */
    public Raflebaeger() {
        this.terning1 = new Terning();
        this.terning2 = new Terning();
        this.sumAfTerninger = 0;
    }

    /**
     * Bruger slaaTerning på begge terninger, og saetter sumAfTerninger til summen af de 2 terningers oejenVaerdi
     * @return Den nye sumAfTerninger efter terninger er slaaet
     */
    public int slaaAlleTerninger() {
        terning1.slaaTerning();
        terning2.slaaTerning();
        this.sumAfTerninger = terning1.getOejenVaerdi() + terning2.getOejenVaerdi();
        return sumAfTerninger;
    }

    /**
     * Tjekker om sumAfTerninger er lig 0, giver fejlbesked, da man ikke kan have en sum af 0
     * @return Hvis ikke sumAfTerninger lig 0, returnere SumAfTerninger
     */
    public int getSumAfTerninger() {
        if (sumAfTerninger == 0) {
            System.out.println("Terninger er ikke blevet slået, der er ikke nogen sum vaerdi");
            return sumAfTerninger;
        } else {
            return sumAfTerninger;
        }
    }
}
