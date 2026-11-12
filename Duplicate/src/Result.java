
import java.util.ArrayList;

public class Result {

    private ArrayList<Integer> duplicados;
    private int comparaciones;
    private long tiempo;

    public Result(ArrayList<Integer> duplicados,
                  int comparaciones,
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

    public int getComparaciones() {
        return comparaciones;
    }

    public long getTiempo() {
        return tiempo;
    }
}
