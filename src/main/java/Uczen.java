import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Uczen {
    private String imie;
    private String nazwisko;
    private String klasa;

    List<Operacja> operacjeUcznia;

    public Uczen(String imie, String nazwisko, String klasa) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.klasa = klasa;
        this.operacjeUcznia = new ArrayList<>();
    }

    public void dodajOperacje(Operacja operacja){
        operacjeUcznia.add(operacja);
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getKlasa() {
        return klasa;
    }

    public void setKlasa(String klasa) {
        this.klasa = klasa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Uczen uczen = (Uczen) o;
        return Objects.equals(imie, uczen.imie) && Objects.equals(nazwisko, uczen.nazwisko) && Objects.equals(klasa, uczen.klasa);
    }

    @Override
    public String toString() {
        return "Uczen{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", klasa='" + klasa + '\'' +
                ", operacjeUcznia=" + operacjeUcznia +
                '}';
    }
}
