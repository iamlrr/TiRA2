import java.util.Date;

public class Odpis {
    Date date;
    Uczen uczen;

    public Odpis(Date date, Uczen uczen) {
        this.date = date;
        this.uczen = uczen;
    }

    public Date getDate() {
        return date;
    }


    public Uczen getUczen() {
        return uczen;
    }

    @Override
    public String toString() {
        return "Odpis{" +
                "date=" + date +
                ", uczen=" + uczen +
                '}';
    }
}

