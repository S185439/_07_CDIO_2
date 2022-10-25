public class SpillePlade {
    //Alle Felt-objekter defineres
    public Felt tower, crater, palaceGates, coldDesert, walledCity, monastery, blackCave, hutsInTheMountain, theWerewall, thePit, goldMine, fejlFelt;

    //Constructor til SpillePlade (Alt tekst er samlet her)
    public SpillePlade() {
        tower = new Felt("Tower",250,"Du er landet på Tower og 250 kr. er tilføjet til din konto");
        crater = new Felt("Crater",-100,"Du er landet på Crater og 100 kr. er trukket fra din konto");
        palaceGates = new Felt("Palace Gates",100,"Du er landet på Palace Gates og 100 kr. er tilføjet til din konto");
        coldDesert = new Felt("Cold Desert",-20,"Du er landet på Cold desert og 20 kr. er trukket fra din konto");
        walledCity = new Felt("Walled City",180,"Du er landet på Walled City og 180 kr. er tilføjet til din konto");
        monastery = new Felt("Monastery",0,"Du er landet på monastery og ingen penge er tilføjet til din konto");
        blackCave = new Felt("Black Cave",-70,"Du er landet på Black Cave og 70 kr. er trukket fra din konto");
        hutsInTheMountain = new Felt("Huts In The Mountain",60,"Du er landet på Huts In The Mountain og 60 kr. er tilføjet til din konto");
        theWerewall = new Felt("The Werewall",-80,"Du er landet på The Werewall og 80 kr. er tilføjet til din konto, men du får en ekstra tur!");
        thePit = new Felt("The Pit",-50,"Du er landet på The Pit og 50 kr. er trukket fra din konto");
        goldMine = new Felt("Goldmine",650,"Du er landet på Goldmine og 650 kr. er tilføjet til din konto");
        fejlFelt = new Felt("Fejl", 0,"øjenværdien svarer ikke til et felt");
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
