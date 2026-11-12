
public class Main {

    public static void main(String[] args) {

        int[] datos = {8, 3, 12, 8, 5, 9, 3, 20};

        SolutionA solucionA = new SolutionA();
        SolutionB solucionB = new SolutionB();

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

        if (resultadoA.hayDuplicados()
                == resultadoB.hayDuplicados()) {

            System.out.println("Las dos soluciones dan el mismo resultado.");

        } else {

            System.out.println("Las soluciones dan resultados diferentes.");
        }
    }
}
