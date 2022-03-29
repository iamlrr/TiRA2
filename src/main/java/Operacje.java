import java.util.ArrayList;
import java.util.List;

public class Operacje {
    List<Operacja> operacje;
    public Operacje() {
        this.operacje = new ArrayList<>();
    }
    public void dodajOperacje(Operacja operacja){
        this.operacje.add(operacja);
    }

    @Override
    public String toString() {
        return "Operacje{" +
                "operacje=" + operacje +
                '}';
    }
}
