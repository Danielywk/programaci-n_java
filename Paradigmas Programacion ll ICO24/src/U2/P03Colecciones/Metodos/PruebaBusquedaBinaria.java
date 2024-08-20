package U2.P03Colecciones.Metodos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PruebaBusquedaBinaria {
    public static void main(String[] args) {
        // Crea una lista de colores
        List<String> listaColores = new ArrayList<>();
        listaColores.add("rojo");
        listaColores.add("blanco");
        listaColores.add("azul");
        listaColores.add("negro");
        listaColores.add("amarillo");
        listaColores.add("morado");
        listaColores.add("canela");
        listaColores.add("rosa");
        Collections.sort(listaColores); // ordena el ArrayList
        System.out.printf("listaColores ordenado: %s%n", listaColores);

        // busca varios valores en la lista
        imprimirResultadosBusqueda(listaColores, "amarillo"); // Primer elemento
        imprimirResultadosBusqueda(listaColores, "canela"); // Elemento medio
        imprimirResultadosBusqueda(listaColores, "rosa"); // último elemento
        imprimirResultadosBusqueda(listaColores, "rojo"); // Penúltimo elemento
        imprimirResultadosBusqueda(listaColores, "gris"); // No existe
        imprimirResultadosBusqueda(listaColores, "verdeazulado"); // No existe

    } // fin de main

    // Realiza la búsqueda y muestra el resultado
    private static void imprimirResultadosBusqueda(List<String> lista, String clave) {
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