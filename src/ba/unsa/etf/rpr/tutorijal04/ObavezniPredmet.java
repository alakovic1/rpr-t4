package ba.unsa.etf.rpr.tutorijal04;

public class ObavezniPredmet extends Predmet{
    private String nazivPredmeta;
    private int ECTSbod;

    public ObavezniPredmet() {}

    public ObavezniPredmet(String nazivPredmeta, int ECTSbod){
        setNazivPredmeta(nazivPredmeta);
        setECTSbod(ECTSbod);
    }

    public String getNazivPredmeta() {
        return nazivPredmeta;
    }

    public void setNazivPredmeta(String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }

    public int getECTSbod() {
        return ECTSbod;
    }

    public void setECTSbod(int ECTSbod) {
        this.ECTSbod = ECTSbod;
    }

    @Override
    public String ispisi(){
        return "";
    }

}