public class Felt {
    String outputTekst;
    String navn;
    int transaktionsVaerdi;

    //Constructor for Felt
    public Felt(String _navn, int _tVaerdi, String _outTekst) {
        navn = _navn;
        transaktionsVaerdi = _tVaerdi;
        outputTekst = _outTekst;
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
