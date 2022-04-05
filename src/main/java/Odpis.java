import java.util.Date;

public class Odpis {
    Date date;
    Uczen uczen;
    public  int iloscDni;

    public Odpis(Date date, Uczen uczen) {
        this.date = date;
        this.uczen = uczen;
 //       this.iloscDni = iloscDni;
    }

    public Date getDate() {
        return date;
    }


    public Uczen getUczen() {
        return uczen;
    }

    public int getIloscDni() {
        return iloscDni;
    }

    @Override
    public String toString() {
        return "Odpis{" +
                "date=" + date +
                ", uczen=" + uczen +
                '}';
    }
}

