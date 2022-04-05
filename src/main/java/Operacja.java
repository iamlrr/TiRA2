import java.util.Date;

public class Operacja {
    double kwotaWplacona;
    Date data;
    Uczen uczen;
    Wplata wplata;
    Wyplata wyplata;

    public void dodajKwote(Uczen uczen, double kwotaWplacona) {
        this.uczen = uczen;
        this.kwotaWplacona = kwotaWplacona;
        this.data = new Date();
        uczen.dodajOperacje(this);
    }

    public double kwotaDoZaplaty() {
        return wplata.kwotaDoZaplaty() - wyplata.kwotaOdpisu();
    }

    @Override
    public String toString() {
        return "Operacja{" +
                "kwota=" + kwotaWplacona +
                ", data=" + data +
                ", uczen=" + uczen.getNazwisko() +
                '}';
    }

    public void zwrocRoznice() {
        double roznica;
        if (kwotaWplacona < kwotaDoZaplaty()) {
            roznica = kwotaDoZaplaty() - kwotaWplacona;
            System.out.println("Niedpolata w kwocie: " + roznica);
        }
        if (kwotaWplacona > kwotaDoZaplaty()) {
            roznica = kwotaWplacona - kwotaDoZaplaty();
            System.out.println("Nadplata w kwocie: " + roznica);
        }
    }
}
