package ba.unsa.etf.rpr.tutorijal04;

import java.util.*;

public class Predmet {
    private String naziv;
    private ArrayList<Student> studenti;

    public Predmet(){}

    public Predmet(String naziv){
        setNaziv(naziv);
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void ispisiStudenta(Student student){

    }

    public String ispisi(){
        return "";
    }
}
