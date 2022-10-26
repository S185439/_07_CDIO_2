public class SpillePlade {
    //Alle Felt-objekter defineres
    public Felt tower, crater, palaceGates, coldDesert, walledCity, monastery, blackCave, hutsInTheMountain, theWerewall, thePit, goldMine, fejlFelt;
    private SpilTekst Tekst = new SpilTekst();
    //Constructor til SpillePlade (Alt tekst er samlet her)
    public SpillePlade() {
        tower = new Felt(Tekst.towerTekst[0],250,Tekst.towerTekst[1]);
        crater = new Felt(Tekst.craterTekst[0],-100,Tekst.craterTekst[1]);
        palaceGates = new Felt(Tekst.palaceGatesTekst[0],100,Tekst.palaceGatesTekst[1]);
        coldDesert = new Felt(Tekst.coldDesertTekst[0],-20,Tekst.coldDesertTekst[1]);
        walledCity = new Felt(Tekst.walledCityTekst[0],180,Tekst.walledCityTekst[1]);
        monastery = new Felt(Tekst.monasteryTekst[0],0,Tekst.monasteryTekst[1]);
        blackCave = new Felt(Tekst.blackCaveTekst[0],-70,Tekst.blackCaveTekst[1]);
        hutsInTheMountain = new Felt(Tekst.hutsInTheMountainTekst[0],60,Tekst.hutsInTheMountainTekst[1]);
        theWerewall = new Felt(Tekst.theWerewallTekst[0],-80,Tekst.theWerewallTekst[1]);
        thePit = new Felt(Tekst.thePitTekst[0],-50,Tekst.thePitTekst[1]);
        goldMine = new Felt(Tekst.goldMineTekst[0],650,Tekst.goldMineTekst[1]);
        fejlFelt = new Felt(Tekst.fejlFeltTekst[0], 0,Tekst.fejlFeltTekst[1]);
    }

    //Method der kalder et felt alt efter øjenværdien af terningen
    public Felt rykTilFelt(int oejenVaerdi) {
        return switch (oejenVaerdi) {
            case 2 -> tower;
            case 3 -> crater;
            case 4 -> palaceGates;
            case 5 -> coldDesert;
            case 6 -> walledCity;
            case 7 -> monastery;
            case 8 -> blackCave;
            case 9 -> hutsInTheMountain;
            case 10 -> theWerewall;
            case 11 -> thePit;
            case 12 -> goldMine;
            default -> fejlFelt;
        };
    }
}
