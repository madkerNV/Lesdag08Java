package org.example.madjid;

public class Adres {

    String woonplaats;
    String straat;
    int huisnummer;
    String land;

    public Adres() {
    }

    public Adres(String woonplaats, String straat, int huisnummer, String land) {
        this.woonplaats = woonplaats;
        this.straat = straat;
        this.huisnummer = huisnummer;
        this.land = land;
    }

    public String getWoonplaats() {
        return woonplaats;
    }

    public void setWoonplaats(String woonplaats) {
        this.woonplaats = woonplaats;
    }

    public String getStraat() {
        return straat;
    }

    public void setStraat(String straat) {
        this.straat = straat;
    }

    public int getHuisnummer() {
        return huisnummer;
    }

    public void setHuisnummer(int huisnummer) {
        this.huisnummer = huisnummer;
    }

    public String getLand() {
        return land;
    }

    public void setLand(String land) {
        this.land = land;
    }

    public String toStringAdresGegevens() {
        return "Adresgegevens [Straatnaam=" + straat + ", huisnummer=" + huisnummer + ", land=" + land + "]";
    }
}
