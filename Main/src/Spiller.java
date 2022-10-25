public class Spiller {
    private String navn;
    public Konto Spillerkonto;


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

