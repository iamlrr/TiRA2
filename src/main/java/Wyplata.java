public class Wyplata {
    Wplata wplata;
    Odpis odpis;

    public Wyplata(Wplata wplata, Odpis odpis) {
        this.wplata = wplata;
        this.odpis = odpis;
    }

    public double kwotaOdpisu() {
        return odpis.getIloscDni() * wplata.cenaPosilku;
    }

}
