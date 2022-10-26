import java.util.Scanner;
import java.awt.*;

public class Spil {
    public static void main(String[] args) {
        // Alle objekter defineres
        SpillePlade sP = new SpillePlade();
        SpilTekst Tekst = new SpilTekst();
        Spiller s1 = new Spiller(Tekst.spillerNavn[0]);
        Spiller s2 = new Spiller(Tekst.spillerNavn[1]);
        Spiller[] spiller = {s1, s2};

        Raflebaeger rB = new Raflebaeger();
        Scanner input = new Scanner(System.in);
        Felt feltNu = new Felt("",0,"");

        // Variabler defineres
        boolean spilVundet = false;
        int hvisTur = 0;
        String vent = "y";
        System.out.println(Tekst.startSpilTekst);
        System.out.println();
        // Selve spillet er et while-loop
        while (!spilVundet && vent.equals("y")) {
            System.out.println(spiller[hvisTur].navn + ", " + Tekst.mixTekst[0]);
            System.out.println(Tekst.mixTekst[1]);

            //vent ser næste input og sørger for at det er korrekt (y)
            vent = input.nextLine();
            if (vent.equals("y")) {
                rB.slaaAlleTerninger();
                System.out.println(Tekst.mixTekst[2] + " " + rB.getSumAfTerninger());
                feltNu = sP.rykTilFelt(rB.getSumAfTerninger());
                System.out.println(feltNu.outputTekst);

                spiller[hvisTur].Spillerkonto.transaktion(feltNu.transaktionsVaerdi);

                //Så vises spillerens konto
                System.out.println(spiller[hvisTur].navn + " " + Tekst.mixTekst[3] + " " + spiller[hvisTur].Spillerkonto.getPenge() + " " + Tekst.mixTekst[4]);

                //Hvis spillerens konto har 3000 kr. eller derover, så ender spillet
                if (spiller[hvisTur].Spillerkonto.getPenge() >= 3000) {
                    spilVundet = true;
                    System.out.println(Tekst.vinderTekst[1] + " " + spiller[hvisTur].navn + " " + Tekst.vinderTekst[1]);
                } else {
                    //Turen skiftes, medmindre spilleren er landet på Werewall (10) hvor turen ikke ændres, så de får et ekstra slag
                    if (rB.getSumAfTerninger() != 10) {
                        if (hvisTur == 0) { hvisTur = 1; } else { hvisTur = 0; }
                    }
                }
                System.out.println();
            }
        }


    }
}
