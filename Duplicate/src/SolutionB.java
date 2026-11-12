
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class SolutionB {

    public Result buscar(int[] datos) {

        Set<Integer> vistos = new HashSet<>();

        ArrayList<Integer> duplicados = new ArrayList<>();

        int comparaciones = 0;

        long inicio = System.nanoTime();

        for (int numero : datos) {

            comparaciones++;

            if (vistos.contains(numero)) {

                if (!duplicados.contains(numero)) {
                    duplicados.add(numero);
                }

            } else {
                vistos.add(numero);
            }
        }

        long fin = System.nanoTime();

        return new Result(
                duplicados,
                comparaciones,
                fin - inicio
        );
    }
}
