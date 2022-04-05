import java.util.Date;
public class Wplata {

    double cenaPosilku;
    int iloscDni;

    public Wplata(double cenaPosilku, int iloscDni) {
        this.cenaPosilku = cenaPosilku;
        this.iloscDni = iloscDni;
    }

    public double kwotaDoZaplaty() {
        return cenaPosilku * iloscDni;
    }
}
