import java.util.Date;

public class Operacja {
    double kwota;
    Date data;
    Uczen uczen;

    public void dodajKwote(Uczen uczen, double kwota) {
        this.uczen = uczen;
        this.kwota = kwota;
        this.data = new Date();

    }

    @Override
    public String toString() {
        return "Operacja{" +
                "kwota=" + kwota +
                ", data=" + data +
                ", uczen=" + uczen.getNazwisko() +
                '}';
    }
}
