import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UczniowieTest {
    @Test
    public void wyswietlUczniowTest() {
        Uczen pawel = new Uczen("Pawel", "Kowalski", "6G");
        Uczen piotr = new Uczen("Piotr", "Kowalski", "3B");
        Uczniowie uczniowie = new Uczniowie();
        uczniowie.dodajUcznia(piotr);
        uczniowie.dodajUcznia(pawel);
        System.out.println("Uczniowie: "  + uczniowie);
    }

}