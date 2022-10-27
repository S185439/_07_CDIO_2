public class Felt {
    String outputTekst;
    String navn;
    int transaktionsVaerdi;

    //Constructor for Felt
    public Felt(String _navn, int _transaktionsVaerdi, String _outputTekst) {
        navn = _navn;
        transaktionsVaerdi = _transaktionsVaerdi;
        outputTekst = _outputTekst;
    }

    // Getter og Setter for navn
    public void setNavn(String nyTekst) {
        this.navn = nyTekst;
    }
    public String getNavn() {
        return navn;
    }

    // Getter og Setter for output-teksten
    public void setOutputTekst(String nyTekst) {
        this.outputTekst = nyTekst;
    }
    public String getOutputTekst() {
        return outputTekst;
    }

    //Getter og Setter for transaktionsværdi
    public void setTransaktionsVaerdi(int nyVaerdi) {
        this.transaktionsVaerdi = nyVaerdi;
    }
    public int getTransaktionsVaerdi() {
        return transaktionsVaerdi;
    }
}
