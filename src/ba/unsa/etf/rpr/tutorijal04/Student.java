package ba.unsa.etf.rpr.tutorijal04;

public class Student {
    private String ime;
    private String prezime;
    private int brojIndexa;
    private int godinaFaxa;

    public Student(){}

    public Student(String ime,String prezime,int brojIndexa,int godinaFaxa){
        setIme(ime);
        setPrezime(prezime);
        setBrojIndexa(brojIndexa);
        setGodinaFaxa(godinaFaxa);
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public int getBrojIndexa() {
        return brojIndexa;
    }

    public void setBrojIndexa(int brojIndexa) {
        this.brojIndexa = brojIndexa;
    }

    public int getGodinaFaxa() {
        return godinaFaxa;
    }

    public void setGodinaFaxa(int godinaFaxa) {
        this.godinaFaxa = godinaFaxa;
    }
}
