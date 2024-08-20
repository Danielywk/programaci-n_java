package U2.P03Colecciones.Conjuntos;

import java.util.*;

public class EliminacionDuplicados {
    public static void main(String[] args) {
        String[] nombres = {"Isa", "Fer", "Manuel", "Isa", "Fer", "Manuel", "Angel", "Matias", "Julian", "Abraham"};
        List<String> listaNombres = Arrays.asList(nombres);
        System.out.printf("Lista: %s%n", listaNombres);
        System.out.println("");

        SortedSet<String> arbol = new TreeSet<>(Arrays.asList(nombres));
        System.out.println("Conjunto ordenado sin duplicados: ");
        imprimirConjuntoOrdenado(arbol);
        Collections.sort(listaNombres);
        System.out.printf("listaNombres ordenado: %s%n", listaNombres);
        for (int i = 0; i < nombres.length; i++) {
            imprimirResultadosBusqueda(listaNombres, nombres[i]);
        }
    }

    public static void imprimirConjuntoOrdenado(SortedSet<String> conjunto) {
        for (String s : conjunto) {
            System.out.printf("%s ", s);
        }
        System.out.println();
        System.out.println();
    }

    private static void imprimirResultadosBusqueda(List<String> lista, String clave) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dame nombre a buscar: ");
        clave = sc.next();
        int resultado = 0;
        System.out.printf("%nBuscando: %s%n", clave);
        resultado = Collections.binarySearch(lista, clave);
        if (resultado >= 0) {
            System.out.printf("Se encontró en el índice: %d%n", resultado);
        } else {
            System.out.printf("No se encontró (%d)%n", resultado);
        }
    }
}