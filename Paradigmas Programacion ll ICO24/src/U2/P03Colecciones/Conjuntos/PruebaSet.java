package U2.P03Colecciones.Conjuntos;

import java.util.*;

// Uso de un objeto HashSet para eliminar elelmentos duplicadosn de un arreglo de cadenas
public class PruebaSet {
    public static void main(String[] args) {
        // Crea y muestra un objeto List<String>
        String[] colores = {"rojo", "blanco", "azul", "verde", "gris", "naranja", "carne", "blanco", "cyan", "durazno", "gris", "naranja"};
        List<String> lista = Arrays.asList(colores);
        System.out.printf("Lista: %s%n", lista);
        imprimirSinDuplicados(lista);
    }

    // Crea un objeto set a partir de un onjeto Collection para eliminar duplicados
    public static void imprimirSinDuplicados(Collection<String> valores) {
        Set<String> conjunto = new HashSet<>(valores);
        for (String valor : conjunto) {
            System.out.printf("%s ", valor);
        }
        System.out.println();
    }
}