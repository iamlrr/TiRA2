import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperacjeTest {
    @Test
    public void wyswietlOperacjeTest() {
        Operacje operacje = new Operacje();
        Uczen pawel = new Uczen("Pawel", "Pawlowski", "8A");
        Operacja wplataPawla2 = new Operacja();
        Operacja wplataPawla = new Operacja();

        wplataPawla.dodajKwote(pawel, 150);
        wplataPawla2.dodajKwote(pawel, -150);
        operacje.dodajOperacje(wplataPawla);
        operacje.dodajOperacje(wplataPawla2);
        System.out.println("Operacje " + operacje);

    }

}