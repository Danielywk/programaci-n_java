package U2.P03Colecciones.Metodos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AddAll_Frequency_DisJoint {
    public static void main(String[] args) {
        // Inicializa lista1 y lista2
        String[] colores = {"rojo", "blanco", "amarillo", "azul"};
        List<String> lista1 = Arrays.asList(colores);
        ArrayList<String> lista2 = new ArrayList<>();
        lista2.add("negro");
        lista2.add("rojo");
        lista2.add("verde");
        System.out.println("Antes de AddAll, lista2 contiene: ");
        for (String s : lista2) {
            System.out.printf("%s ", s);
        }
        // Agregar los objetos String de colores a lista2
        Collections.addAll(lista2, colores);
        System.out.println("\nDespués de AddAll, lista2 contiene: ");
        for (String s : lista2) {
            System.out.printf("%s ", s);
        }
        // Obtiene la frequencia de "rojo"
        int frequencia = Collections.frequency(lista2, "rojo");
        System.out.println("\nFrequencia de rojo en lista2: " + frequencia);
        //System.out.printf("%sFrequencia de rojo en lista2: $d%n", frequencia);
        // Comprueba si lista1 y lista2 tienen elementos en común
        boolean desunion = Collections.disjoint(lista1, lista2);
        System.out.printf("lista1 y lista2 %s elementos en común", (desunion ? "no tienen" : "tienen"));
    }
}