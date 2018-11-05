package ba.unsa.etf.rpr.tutorijal04;

import java.util.*;

public class Semestar {
    private int semestar;
    private int ukupniECTS;
    private ArrayList<Predmet> predmetiSemestra;

    public Semestar() {}

    public Semestar(int semestar,int ukupniECTS){
        setSemestar(semestar);
        setUkupniECTS(ukupniECTS);
    }

    public int getSemestar() {
        return semestar;
    }

    public void setSemestar(int semestar) {
        this.semestar = semestar;
    }

    public int getUkupniECTS() {
        return ukupniECTS;
    }

    public void setUkupniECTS(int ukupniECTS) {
        this.ukupniECTS = ukupniECTS;
    }
}
