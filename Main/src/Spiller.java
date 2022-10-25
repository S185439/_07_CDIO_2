public class Spiller {
    private String navn;
    private Konto Spillerkonto;


//Constructor til Spiller
public Spiller (String navn) {
    this.navn = navn;
    Spillerkonto = new Konto();
}

// Getter og Setter for spillerens navn
public void setSpillerNavn(String navn){
    this.navn = navn;
}
public String getSpillerNavn(){
    return navn;
}
}

