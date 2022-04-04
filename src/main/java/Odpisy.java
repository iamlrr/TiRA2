import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class Odpisy {
    List<Odpis> odpisy;

    public Odpisy() {
        this.odpisy = new ArrayList<>();

    }

    public List<Odpis> wyswietlOdpisyPoUczniu(Uczen uczen) {
        return odpisy.stream().filter(odpis -> odpis.getUczen().equals(uczen)).collect(Collectors.toList());
    }

    public List<Odpis> wyswietlOdpisyPoDniu(Date date) {
        return odpisy.stream().filter(odpis -> odpis.getDate().equals(date)).collect(Collectors.toList());
    }

    public long wyswietlSumeOdpisowDanegoDnia(Date date) {
        return odpisy.stream().filter(odpis -> odpis.getDate().equals(date)).count();
    }

    public long wyswietlOdpisyDanegoUcznia(Uczen uczen) {
        return odpisy.stream().filter(odpis -> odpis.getUczen().equals(uczen)).count();
    }
    public void dodajOdpis(Odpis odpis) {
        this.odpisy.add(odpis);
    }
}
