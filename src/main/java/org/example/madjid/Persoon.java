package org.example.madjid;

public class Persoon {
    private int id;
    private String naam;
    private int leeftijd;
    public static int AantalPersonen=0;



    public Persoon() {
    }

    public Persoon(String naam, int leeftijd, int id) {
        this.naam = naam;
        this.leeftijd = leeftijd;
        this.id = id;
        AantalPersonen++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getLeeftijd() {
        return leeftijd;
    }

    public void setLeeftijd(int leeftijd) {
        this.leeftijd = leeftijd;
    }

    public String toStringPersoonGegevens() {
        return "Persoongegevens [Persoonsid=" + id + ", Naam=" + naam + ", leeftijd=" + leeftijd + "]";
    }
}
