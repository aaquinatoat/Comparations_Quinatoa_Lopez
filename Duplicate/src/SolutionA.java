
import java.util.ArrayList;

public class SolutionA {

    public Result buscar(int[] datos) {

        ArrayList<Integer> duplicados = new ArrayList<>();

        int comparaciones = 0;

        long inicio = System.nanoTime();

        for (int i = 0; i < datos.length - 1; i++) {

            for (int j = i + 1; j < datos.length; j++) {

                comparaciones++;

                if (datos[i] == datos[j]) {

                    if (!duplicados.contains(datos[i])) {
                        duplicados.add(datos[i]);
                    }
                }
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
