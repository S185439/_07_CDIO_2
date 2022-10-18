public class Felt {
    String outputTekst;
    String navn;
    int transaktionsVaerdi;

    public Felt(String _navn, int _tVaerdi, String _outTekst) {
        navn = _navn;
        transaktionsVaerdi = _tVaerdi;
        outputTekst = _outTekst;
    }

    public void setOutputTekst(String nyTekst) {
        this.outputTekst = nyTekst;
    }

    public String getOutputTekst() {
        return outputTekst;
    }

    public void setTransaktionsVaerdi(int nyVaerdi) {
        this.transaktionsVaerdi = nyVaerdi;
    }

    public int getTransaktionsVaerdi() {
        return transaktionsVaerdi;
    }
}
