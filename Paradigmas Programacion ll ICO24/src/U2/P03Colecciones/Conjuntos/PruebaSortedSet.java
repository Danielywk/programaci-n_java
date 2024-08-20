package U2.P03Colecciones.Conjuntos;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class PruebaSortedSet {
    public static void main(String[] args) {
        // Crear un Treeset a partir del arreglo de colores
        String[] colores = {"amarillo", "verde", "negro", "carne", "gris", "blanco", "naranja", "rojo", "verde"};
        SortedSet<String> arbol = new TreeSet<>(Arrays.asList(colores));
        System.out.println("Conjunto ordenado: ");
        imprimirConjunto(arbol);
        // Obtiene subconjunto mediante headSet, con base en "naranja"
        System.out.println("headSet (naranja)");
        imprimirConjunto(arbol.headSet("naranja"));

        // Obtiene subconjunto mediante headSet, con base en "naranja"
        System.out.println("tailSet (naranja)");
        imprimirConjunto(arbol.tailSet("naranja"));

        System.out.printf("primero: %s%n", arbol.first());
        System.out.printf("último: %s%n", arbol.last());
    }
    // Imprime sorted mediante un for mejorado

    public static void imprimirConjunto(SortedSet<String> conjunto) {
        for (String s : conjunto) {
            System.out.printf("%s ", s);
        }
        System.out.println();
        System.out.println();
    }
}