import org.example.madjid.Adres;
import org.example.madjid.Huis;
import org.example.madjid.Persoon;
import org.junit.jupiter.api.Test;

public class TestCoronaApp {


    @Test
     void experimentMet4PersonenInEenHuis() {
        Adres adres1 = new Adres("Amsterdam", "Amsterdamweg", 56, "Nederland");
        Persoon persoon1 = new Persoon("Jan",32 ,1);
        Persoon persoon2 = new Persoon("Mark",33, 2);
        Persoon persoon3 = new Persoon("Pim",28, 3);
        Persoon persoon4 = new Persoon("Tom",34, 4);
        Huis huis1 = new Huis(adres1, 3, persoon1);
        System.out.println("Er zijn in totaal: " + Persoon.AantalPersonen + " personen in het huis");
        if (Persoon.AantalPersonen > 6 && Persoon.AantalPersonen <= 100 && Huis.aantalHuizen == 1) {
            System.out.println("Hierbij schrijven wij een boete uit van 95 euro aan huiseigenaar " + huis1.getPersoon().getNaam());
        }
        else if (Persoon.AantalPersonen > 100 && Persoon.AantalPersonen <= 1000 && Huis.aantalHuizen == 1) {
            System.out.println("Hierbij schrijven wij een boete uit van 395 euro aan huiseigenaar " + huis1.getPersoon().getNaam());
        }
        else if (Persoon.AantalPersonen <= 6 && Huis.aantalHuizen == 1) {
            System.out.println("Controle uitgevoerd en niets strafbaars ontdekt bij het huis van " + huis1.getPersoon().getNaam());
        }
        else if (Persoon.AantalPersonen <= 0 && Huis.aantalHuizen < 1){
            System.out.println("CONTROLE NIET MOGELIJK OP DIT ADRES");
        }
        else if (Persoon.AantalPersonen > 6 && Huis.aantalHuizen > 1){
            System.out.println("Extra BOA team sturen");
        }
        else {
            System.out.println("NIET BEHANDELBAAR DOOR BOA");
        }
        System.out.println("Registratie van uitgevoerde controle hieronder:");
        System.out.println(huis1.toStringHuisGegevens());
        System.out.println(persoon1.toStringPersoonGegevens());
        System.out.println(persoon2.toStringPersoonGegevens());
        System.out.println(persoon3.toStringPersoonGegevens());
        System.out.println(persoon4.toStringPersoonGegevens());

        }

    @Test
    void experimentMet10PersonenInEenHuis() {
        Adres adres1 = new Adres("Nijmegen", "Nijmegenstraat", 88, "Nederland");
        Persoon persoon1 = new Persoon("Jon",32 ,1);
        Persoon persoon2 = new Persoon("Murk",33, 2);
        Persoon persoon3 = new Persoon("Pom",28, 3);
        Persoon persoon4 = new Persoon("Tam",34, 4);
        Persoon persoon5 = new Persoon("Tum",35, 5);
        Persoon persoon6 = new Persoon("Pam",27, 6);
        Persoon persoon7 = new Persoon("Tak",35, 7);
        Persoon persoon8 = new Persoon("Boom",38, 8);
        Persoon persoon9 = new Persoon("Lantaarn",54, 9);
        Persoon persoon10 = new Persoon("Pak",89, 10);
        Huis huis1 = new Huis(adres1, 3, persoon1);
        System.out.println("Er zijn in totaal: " + Persoon.AantalPersonen + " personen in het huis");
        if (Persoon.AantalPersonen > 6 && Persoon.AantalPersonen <= 100 && Huis.aantalHuizen == 1) {
            System.out.println("Hierbij schrijven wij een boete uit van 95 euro aan huiseigenaar " + huis1.getPersoon().getNaam());
        }
        else if (Persoon.AantalPersonen > 100 && Persoon.AantalPersonen <= 1000 && Huis.aantalHuizen == 1) {
            System.out.println("Hierbij schrijven wij een boete uit van 395 euro aan huiseigenaar " + huis1.getPersoon().getNaam());
        }
        else if (Persoon.AantalPersonen <= 6 && Huis.aantalHuizen == 1) {
            System.out.println("Controle uitgevoerd en niets strafbaars ontdekt bij het huis van " + huis1.getPersoon().getNaam());
        }
        else if (Persoon.AantalPersonen <= 0 && Huis.aantalHuizen < 1){
            System.out.println("CONTROLE NIET MOGELIJK OP DIT ADRES");
        }
        else if (Persoon.AantalPersonen > 6 && Huis.aantalHuizen > 1){
            System.out.println("Extra BOA team sturen");
        }
        else {
            System.out.println("NIET BEHANDELBAAR DOOR BOA");
        }

        System.out.println("Registratie van uitgevoerde controle hieronder:");
        System.out.println(huis1.toStringHuisGegevens());
        System.out.println(persoon1.toStringPersoonGegevens());
        System.out.println(persoon2.toStringPersoonGegevens());
        System.out.println(persoon3.toStringPersoonGegevens());
        System.out.println(persoon4.toStringPersoonGegevens());
        System.out.println(persoon5.toStringPersoonGegevens());
        System.out.println(persoon6.toStringPersoonGegevens());
        System.out.println(persoon7.toStringPersoonGegevens());
        System.out.println(persoon8.toStringPersoonGegevens());
        System.out.println(persoon9.toStringPersoonGegevens());
        System.out.println(persoon10.toStringPersoonGegevens());

    }
    @Test
    void experimentMet10PersonenInTweeHuizen() {
        Adres adres1 = new Adres("Nijmegen", "Nijmegenstraat", 88, "Nederland");
        Adres adres2 = new Adres("Almere", "Almerestraat", 121, "Nederland");

        Persoon persoon1 = new Persoon("Jonny",32 ,1);
        Persoon persoon2 = new Persoon("Murk",33, 2);
        Persoon persoon3 = new Persoon("Pom",28, 3);
        Persoon persoon4 = new Persoon("Tam",34, 4);
        Persoon persoon5 = new Persoon("Tum",35, 5);
        Persoon persoon6 = new Persoon("Pam",27, 6);
        Persoon persoon7 = new Persoon("Tak",35, 7);
        Persoon persoon8 = new Persoon("Boom",38, 8);
        Persoon persoon9 = new Persoon("Lantaarn",54, 9);
        Persoon persoon10 = new Persoon("Pak",89, 10);
        Huis huis1 = new Huis(adres1, 3, persoon1);
        Huis huis2 = new Huis(adres2, 5, persoon3);

        System.out.println("Er zijn in totaal: " + Persoon.AantalPersonen/Huis.aantalHuizen + " personen in elk huis");
        if (Persoon.AantalPersonen/Huis.aantalHuizen > 6 && Persoon.AantalPersonen/Huis.aantalHuizen <= 100 && Huis.aantalHuizen == 1) {
            System.out.println("Hierbij schrijven wij een boete uit van 95 euro aan huiseigenaar " + huis1.getPersoon().getNaam() +" en "+ huis2.getPersoon().getNaam());
        }
        else if (Persoon.AantalPersonen/Huis.aantalHuizen > 100 && Persoon.AantalPersonen/Huis.aantalHuizen <= 1000 && Huis.aantalHuizen == 1) {
            System.out.println("Hierbij schrijven wij een boete uit van 395 euro aan huiseigenaar " + huis1.getPersoon().getNaam() +" en "+ huis2.getPersoon().getNaam());
        }else if (Persoon.AantalPersonen/Huis.aantalHuizen > 6 && Huis.aantalHuizen > 1){
            System.out.println("Extra BOA/POLITIE team sturen voor proces verbaal: rechter bepaalt boete");
        }
        else if (Persoon.AantalPersonen/Huis.aantalHuizen <= 6 && Huis.aantalHuizen == 1 || Huis.aantalHuizen > 1) {
            System.out.println("Controle uitgevoerd en niets strafbaars ontdekt bij het huis van " + huis1.getPersoon().getNaam() +" en " + huis2.getPersoon().getNaam());
        }
        else if (Persoon.AantalPersonen/Huis.aantalHuizen <= 0 && Huis.aantalHuizen < 1){
            System.out.println("CONTROLE NIET MOGELIJK OP DIT ADRES");
        }

        else {
            System.out.println("NIET BEHANDELBAAR DOOR BOA");
        }

        System.out.println("Registratie van uitgevoerde controle hieronder:");
        System.out.println(huis1.toStringHuisGegevens());
        System.out.println(huis2.toStringHuisGegevens());
        System.out.println(persoon1.toStringPersoonGegevens());
        System.out.println(persoon2.toStringPersoonGegevens());
        System.out.println(persoon3.toStringPersoonGegevens());
        System.out.println(persoon4.toStringPersoonGegevens());
        System.out.println(persoon5.toStringPersoonGegevens());
        System.out.println(persoon6.toStringPersoonGegevens());
        System.out.println(persoon7.toStringPersoonGegevens());
        System.out.println(persoon8.toStringPersoonGegevens());
        System.out.println(persoon9.toStringPersoonGegevens());
        System.out.println(persoon10.toStringPersoonGegevens());

    }

    @Test
    void experimentMet18PersonenInTweeHuizen() {
        Adres adres1 = new Adres("Nijmegen", "Nijmegenstraat", 88, "Nederland");
        Adres adres2 = new Adres("Almere", "Almerestraat", 121, "Nederland");

        Persoon persoon1 = new Persoon("Jonny",32 ,1);
        Persoon persoon2 = new Persoon("Murk",33, 2);
        Persoon persoon3 = new Persoon("Pom",28, 3);
        Persoon persoon4 = new Persoon("Tam",34, 4);
        Persoon persoon5 = new Persoon("Tum",35, 5);
        Persoon persoon6 = new Persoon("Pam",27, 6);
        Persoon persoon7 = new Persoon("Tak",35, 7);
        Persoon persoon8 = new Persoon("Boom",38, 8);
        Persoon persoon9 = new Persoon("Lantaarn",54, 9);
        Persoon persoon10 = new Persoon("Pak",89, 10);
        Persoon persoon11 = new Persoon("ark",89, 11);
        Persoon persoon12 = new Persoon("astark",89, 12);
        Persoon persoon13 = new Persoon("bstark",89, 13);
        Persoon persoon14 = new Persoon("cstark",89, 14);
        Persoon persoon15 = new Persoon("dstark",89, 15);
        Persoon persoon16 = new Persoon("estark",89, 16);
        Persoon persoon17 = new Persoon("fstark",89, 17);
        Persoon persoon18 = new Persoon("gstark",89, 18);

        Huis huis1 = new Huis(adres1, 3, persoon1);
        Huis huis2 = new Huis(adres2, 5, persoon3);

        System.out.println("Er zijn in totaal: " + Persoon.AantalPersonen/Huis.aantalHuizen + " personen in elk huis");
        if (Persoon.AantalPersonen/Huis.aantalHuizen > 6 && Persoon.AantalPersonen/Huis.aantalHuizen <= 100 && Huis.aantalHuizen == 1) {
            System.out.println("Hierbij schrijven wij een boete uit van 95 euro aan huiseigenaar " + huis1.getPersoon().getNaam() +" en "+ huis2.getPersoon().getNaam());
        }
        else if (Persoon.AantalPersonen/Huis.aantalHuizen > 100 && Persoon.AantalPersonen/Huis.aantalHuizen <= 1000 && Huis.aantalHuizen == 1) {
            System.out.println("Hierbij schrijven wij een boete uit van 395 euro aan huiseigenaar " + huis1.getPersoon().getNaam() +" en "+ huis2.getPersoon().getNaam());
        }else if (Persoon.AantalPersonen/Huis.aantalHuizen > 6 && Huis.aantalHuizen > 1){
            System.out.println("Extra BOA/POLITIE team sturen voor proces verbaal: rechter bepaalt boete");
        }
        else if (Persoon.AantalPersonen/Huis.aantalHuizen <= 6 && Huis.aantalHuizen == 1 || Huis.aantalHuizen > 1) {
            System.out.println("Controle uitgevoerd en niets strafbaars ontdekt bij het huis van " + huis1.getPersoon().getNaam() +" en " + huis2.getPersoon().getNaam());
        }
        else if (Persoon.AantalPersonen/Huis.aantalHuizen <= 0 && Huis.aantalHuizen < 1){
            System.out.println("CONTROLE NIET MOGELIJK OP DIT ADRES");
        }

        else {
            System.out.println("NIET BEHANDELBAAR DOOR BOA");
        }

        System.out.println("Registratie van uitgevoerde controle hieronder:");
        System.out.println(huis1.toStringHuisGegevens());
        System.out.println(huis2.toStringHuisGegevens());
        System.out.println(persoon1.toStringPersoonGegevens());
        System.out.println(persoon2.toStringPersoonGegevens());
        System.out.println(persoon3.toStringPersoonGegevens());
        System.out.println(persoon4.toStringPersoonGegevens());
        System.out.println(persoon5.toStringPersoonGegevens());
        System.out.println(persoon6.toStringPersoonGegevens());
        System.out.println(persoon7.toStringPersoonGegevens());
        System.out.println(persoon8.toStringPersoonGegevens());
        System.out.println(persoon9.toStringPersoonGegevens());
        System.out.println(persoon10.toStringPersoonGegevens());
        System.out.println(persoon11.toStringPersoonGegevens());
        System.out.println(persoon12.toStringPersoonGegevens());
        System.out.println(persoon13.toStringPersoonGegevens());
        System.out.println(persoon14.toStringPersoonGegevens());
        System.out.println(persoon15.toStringPersoonGegevens());
        System.out.println(persoon16.toStringPersoonGegevens());
        System.out.println(persoon17.toStringPersoonGegevens());
        System.out.println(persoon18.toStringPersoonGegevens());


    }


    }





