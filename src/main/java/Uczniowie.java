import java.util.ArrayList;
import java.util.List;

public class Uczniowie {
    List<Uczen> uczniowie;

    public Uczniowie() {
        this.uczniowie = new ArrayList<>();
    }

    public void dodajUcznia(Uczen uczen) {
        this.uczniowie.add(uczen);
    }

    @Override
    public String toString() {
        return "Uczniowie{" +
                "uczniowie=" + uczniowie +
                '}';
    }
}
