

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        SolutionA solucionA = new SolutionA();
        SolutionB solucionB = new SolutionB();

        int[] datos = {8, 3, 12, 8, 5, 9, 3, 20};

        Result resultadoA = solucionA.buscar(datos);
        Result resultadoB = solucionB.buscar(datos);

        System.out.println("===== BUSCAR DUPLICADOS =====");

        System.out.println("\nSOLUCION A: DOBLE RECORRIDO");

        System.out.println("Hay duplicados: "
                + resultadoA.hayDuplicados());

        System.out.println("Numeros duplicados: "
                + resultadoA.getDuplicados());

        System.out.println("Comparaciones: "
                + resultadoA.getComparaciones());

        System.out.println("Tiempo: "
                + resultadoA.getTiempo() / 1000000.0 + " ms");

        System.out.println("\nSOLUCION B: HASHSET");

        System.out.println("Hay duplicados: "
                + resultadoB.hayDuplicados());

        System.out.println("Numeros duplicados: "
                + resultadoB.getDuplicados());

        System.out.println("Comparaciones: "
                + resultadoB.getComparaciones());

        System.out.println("Tiempo: "
                + resultadoB.getTiempo() / 1000000.0 + " ms");

        System.out.println("\n===== COMPARACION =====");

        if (resultadoA.getDuplicados().equals(
                resultadoB.getDuplicados())) {

            System.out.println(
                    "Las dos soluciones dan el mismo resultado.");

        } else {

            System.out.println(
                    "Las soluciones dan resultados diferentes.");
        }

        int[] tamanos = {
            100, 1000, 10000, 100000, 1000000
        };

        int repeticiones = 3;

        for (int n : tamanos) {

            int[] datosPrueba = generarDatos(n);

            long tiempoA = 0;
            long tiempoB = 0;

            Result resultadoA2 = null;
            Result resultadoB2 = null;

            if (n <= 10000) {

                for (int i = 0; i < repeticiones; i++) {

                    resultadoA2 = solucionA.buscar(datosPrueba);

                    tiempoA += resultadoA2.getTiempo();
                }
            }

            for (int i = 0; i < repeticiones; i++) {

                resultadoB2 = solucionB.buscar(datosPrueba);

                tiempoB += resultadoB2.getTiempo();
            }

            System.out.println("\n===== DATOS: " + n + " =====");

            System.out.println("\nSOLUCION A: DOBLE RECORRIDO");

            if (resultadoA2 != null) {

                System.out.println("Hay duplicados: "
                        + resultadoA2.hayDuplicados());

                System.out.println("Numeros duplicados: "
                        + resultadoA2.getDuplicados().size());

                System.out.println("Comparaciones: "
                        + resultadoA2.getComparaciones());

                System.out.println("Tiempo promedio: "
                        + (tiempoA / (double) repeticiones)
                        / 1000000.0 + " ms");

            } else {

                long operaciones = ((long) n * (n - 1)) / 2;

                System.out.println("No se ejecuto por la cantidad de datos.");

                System.out.println("Comparaciones: " + operaciones);
            }

            System.out.println("\nSOLUCION B: HASHSET");

            System.out.println("Hay duplicados: "
                    + resultadoB2.hayDuplicados());

            System.out.println("Numeros duplicados: "
                    + resultadoB2.getDuplicados().size());

            System.out.println("Comparaciones: "
                    + resultadoB2.getComparaciones());

            System.out.println("Tiempo promedio: "
                    + (tiempoB / (double) repeticiones)
                    / 1000000.0 + " ms");

            System.out.println("\n===== COMPARACION =====");

            if (resultadoA2 != null) {

                if (resultadoA2.getDuplicados().equals(
                        resultadoB2.getDuplicados())) {

                    System.out.println(
                            "Las dos soluciones dan el mismo resultado.");

                } else {

                    System.out.println(
                            "Las soluciones dan resultados diferentes.");
                }

            } else {

                System.out.println(
                        "No se ejecuto la solucion A para estos datos.");
            }
        }
    }

    public static int[] generarDatos(int n) {

        int[] datos = new int[n];

        Random random = new Random(12345L + n);

        for (int i = 0; i < datos.length; i++) {

            datos[i] = random.nextInt(n / 2 + 1);
        }

        return datos;
    }
}
