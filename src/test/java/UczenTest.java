import org.junit.jupiter.api.Test;

public class UczenTest {
    @Test
    public void dodanieOperacjiUczniaTest() {
        Uczen pawel = new Uczen("Pawel", "Pawlowski", "8A");
        Operacja wplataPawla2 = new Operacja();
        Operacja wplataPawla = new Operacja();

        wplataPawla.dodajKwote(pawel, 150);
        wplataPawla2.dodajKwote(pawel, -150);

        pawel.dodajOperacje(wplataPawla);
        pawel.dodajOperacje(wplataPawla2);
        System.out.println("Wplaty Pawla: " + pawel);
    }
}
