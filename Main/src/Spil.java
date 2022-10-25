import java.util.Scanner;
import java.awt.*;

public class Spil {
    public static void main(String[] args) {
        // Alle objekter defineres
        SpillePlade sP = new SpillePlade();

        Spiller spiller[] = new Spiller[2];
        spiller[0].setSpillerNavn("Spiller 1");
        spiller[1].setSpillerNavn("Spiller 2");

        Raflebaeger rB = new Raflebaeger();
        Scanner input = new Scanner(System.in);
        Felt feltNu = new Felt("",0,"");

        // Variabler defineres
        boolean spilVundet = false;
        int hvisTur = 0;
        String vent = "y";
        System.out.println("Spillet er startet. Alle spillere har 1000 kr på deres konto og den første person til at få 3000 kr på deres konto vinder");
        System.out.println();
        // Selve spillet er et while-loop
        while (!spilVundet && vent.equals("y")) {
            System.out.println(spiller[hvisTur].navn + ", det er din tur til at slå");
            System.out.println("Skriv y og tryk enter for at slå, ellers stopper spillet");

            //vent ser næste input og sørger for at det er korrekt (y)
            vent = input.nextLine();
            if (vent.equals("y")) {
                rB.slaaAlleTerninger();
                System.out.println("Du har slået " + rB.getSumAfTerninger());
                feltNu = sP.rykTilFelt(rB.getSumAfTerninger());
                System.out.println(feltNu.outputTekst);

                spiller[hvisTur].Spillerkonto.transaktion(feltNu.transaktionsVaerdi);
                //Hvis spilleren er landet på Werewall (10), ændres turen ikke, så de får et ekstra slag

                if (rB.getSumAfTerninger() != 10) { hvisTur = 2; }

                //Så vises spillerens konto
                System.out.println(spiller[hvisTur].navn + "du har nu " + spiller[hvisTur].Spillerkonto.getPenge() + " på din konto");

                //Hvis spillerens konto har 3000 kr. eller derover, så ender spillet
                if (spiller[hvisTur].Spillerkonto.getPenge() <= 3000) {
                    spilVundet = true;
                }



            }


        }
    }
}
