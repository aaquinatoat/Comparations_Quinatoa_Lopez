
import java.util.ArrayList;

public class Result {

    private ArrayList<Integer> duplicados;
    private long comparaciones;
    private long tiempo;

    public Result(ArrayList<Integer> duplicados,
                  long comparaciones,
                  long tiempo) {

        this.duplicados = duplicados;
        this.comparaciones = comparaciones;
        this.tiempo = tiempo;
    }

    public boolean hayDuplicados() {
        return !duplicados.isEmpty();
    }

    public ArrayList<Integer> getDuplicados() {
        return duplicados;
    }

    public long getComparaciones() {
        return comparaciones;
    }

    public long getTiempo() {
        return tiempo;
    }
}
