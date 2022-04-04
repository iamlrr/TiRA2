import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

class OdpisyTest {
    Uczen janK;
    Uczen pawelK;
    Uczen kasiaK;
    Uczniowie uczniowie;
    final Date dateDzisiaj = new Date(2022, 1, 1);
    final Date dateJutro = new Date(2022, 1, 2);
    final Date datePojutrze = new Date(2022,1,3);

    Odpis odpisJanaDzisiaj;
    Odpis odpisPawlaDzisiaj;
    Odpis odpisKasiDzisiaj;
    Odpis odpisJanaJutro;
    Odpis odpisJanaPojutrze;
    Odpis odpisPawlaPojutrez;
    Odpisy odpisy;

    @BeforeEach
    void setUp() {
        this.janK = new Uczen("Jan", "Kowalski", "3X");
        this.pawelK = new Uczen("Pawel", "Kowalski", "3x");
        this.kasiaK = new Uczen("Kasia", "Kowalski", "3x");

        this.uczniowie = new Uczniowie();
        uczniowie.dodajUcznia(janK);
        uczniowie.dodajUcznia(pawelK);
        uczniowie.dodajUcznia(kasiaK);

        this.odpisJanaDzisiaj = new Odpis(dateDzisiaj, janK);
        this.odpisPawlaDzisiaj = new Odpis(dateDzisiaj, pawelK);
        this.odpisKasiDzisiaj = new Odpis(dateDzisiaj, kasiaK);
        this.odpisJanaJutro = new Odpis(dateJutro, janK);
        this.odpisJanaPojutrze = new Odpis(datePojutrze, janK);
        this.odpisPawlaPojutrez = new Odpis(datePojutrze, pawelK);

        this.odpisy = new Odpisy();
        odpisy.dodajOdpis(odpisJanaDzisiaj);
        odpisy.dodajOdpis(odpisJanaPojutrze);
        odpisy.dodajOdpis(odpisJanaJutro);
        odpisy.dodajOdpis(odpisPawlaDzisiaj);
        odpisy.dodajOdpis(odpisKasiDzisiaj);
        odpisy.dodajOdpis(odpisPawlaPojutrez);
    }

    @Test
    public void odpisyPoUczniuTest() {
        Assertions.assertTrue(odpisy.wyswietlOdpisyPoUczniu(janK).contains(odpisJanaJutro));
        Assertions.assertTrue(odpisy.wyswietlOdpisyPoUczniu(janK).contains(odpisJanaPojutrze));
        Assertions.assertTrue(odpisy.wyswietlOdpisyPoUczniu(janK).contains(odpisJanaDzisiaj));
          }
    @Test
    public void odpisyPoDacieTest() {
        Assertions.assertTrue(odpisy.wyswietlOdpisyPoDniu(datePojutrze).contains(odpisJanaPojutrze));
        Assertions.assertTrue(odpisy.wyswietlOdpisyPoDniu(datePojutrze).contains(odpisPawlaPojutrez));
        Assertions.assertFalse(odpisy.wyswietlOdpisyPoDniu(datePojutrze).contains(odpisKasiDzisiaj));
    }

    @Test
    public void iloscOdpisowKonkretnegoDnia() {
        Assertions.assertEquals(3L, odpisy.wyswietlSumeOdpisowDanegoDnia(dateDzisiaj));
        Assertions.assertEquals(1L, odpisy.wyswietlSumeOdpisowDanegoDnia(dateJutro));
        Assertions.assertEquals(2L, odpisy.wyswietlSumeOdpisowDanegoDnia(datePojutrze));
    }

    @Test
    public void iloscOdpisowKonkretnegoUczniaTest() {
        Assertions.assertEquals(3, odpisy.wyswietlOdpisyDanegoUcznia(janK));
        Assertions.assertEquals(1, odpisy.wyswietlOdpisyDanegoUcznia(kasiaK));
        Assertions.assertEquals(2, odpisy.wyswietlOdpisyDanegoUcznia(pawelK));

    }

}