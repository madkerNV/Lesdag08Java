package org.example.madjid;

public class Huis {
    Adres adres;
    private int aantalKamers;
    Persoon persoon;


    public Huis() {
    }

    public Huis(Adres adres, int aantalKamers, Persoon persoon) {
        this.adres = adres;
        this.aantalKamers = aantalKamers;
        this.persoon = persoon;
    }

    public Adres getAdres() {
        return adres;
    }

    public void setAdres(Adres adres) {
        this.adres = adres;
    }

    public int getAantalKamers() {
        return aantalKamers;
    }

    public void setAantalKamers(int aantalKamers) {
        this.aantalKamers = aantalKamers;
    }

    public Persoon getPersoon() {
        return persoon;
    }

    public void setPersoon(Persoon persoon) {
        this.persoon = persoon;
    }

    public String toStringHuisGegevens() {
        return "Huisgegevens [ADRESGEGEVENS ="
                + "straatnaam + huisnummer= "
                + adres.straat + " " + adres.huisnummer +
                ", Woonplaats=" + adres.woonplaats + ", Land=" + adres.land + "; HUISGEGEVENS =" +





                " aantal kamers=" + aantalKamers + ", huiseigenaar=" + persoon.getNaam() + "]";
    }
}
