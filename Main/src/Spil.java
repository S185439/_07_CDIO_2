import java.util.Scanner;
import java.awt.*;

public class Spil {
    public static void main(String[] args) {
        // Alle objekter defineres
        SpillePlade sP = new SpillePlade();
        Spiller s1 = new Spiller("Spiller 1");
        Spiller s2 = new Spiller("Spiller 2");
        Raflebaeger rB = new Raflebaeger();
        Scanner input = new Scanner(System.in);
        Felt feltNu = new Felt("",0,"");

        // Variabler defineres
        boolean spilVundet = false;
        int hvisTur = 1;
        String vent = "y";
        System.out.println("Spillet er startet. Alle spillere har 1000 kr på deres konto og den første person til at få 3000 kr på deres konto vinder");
        System.out.println();
        // Selve spillet er et while-loop
        while (spilVundet == false && vent.equals("y")) {
            if (hvisTur == 1) {
                System.out.println(s1.navn + ", det er din tur til at slå");
                System.out.println("Skriv y og tryk enter for at slå, ellers stopper spillet");

                //vent er ser næste input og sørger for at det er korrekt (y)
                vent = input.nextLine();
                if (vent.equals("y")) {
                    rB.slaaAlleTerninger();
                    System.out.println("Du har slået " + rB.getSumAfTerninger());
                    feltNu = sP.rykTilFelt(rB.getSumAfTerninger());
                    System.out.println(feltNu.outputTekst);
                    s1.Spillerkonto.transaktion(feltNu.transaktionsVaerdi);
                }
            }
        }
    }
}
