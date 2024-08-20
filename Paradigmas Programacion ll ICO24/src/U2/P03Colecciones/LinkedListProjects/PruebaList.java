package U2.P03Colecciones.LinkedListProjects;
import java.util.*;

public class PruebaList {
    public static void main(String[] args) {
        LinkedList<String> lista1 = new LinkedList<>();
        lista1.add("negro");
        lista1.add("amarillo");
        lista1.add("verde");
        lista1.add("azul");
        lista1.add("violeta");
        lista1.add("plateado");
        // Agrega varios colores a lista2
        LinkedList<String> lista2 = new LinkedList<>();
        lista2.add("dorado");
        lista2.add("blanco");
        lista2.add("café");
        lista2.add("azul");
        lista2.add("gris");
        lista2.add("plateado");
        // Concatenar las 2 listas
        lista1.addAll(lista2);
        // Libera los recursos de lista2
        lista2 = null;
        imprimirLista(lista1);
        // convierte cada elemento de lista1 a mayúsculas
        convertirCadenasAMayusculas(lista1);
        imprimirLista(lista1); // imprime los elementos de lista1

        System.out.printf("%nEliminando elementos 4 a 6...");
        eliminarElementos(lista1, 4, 7); // Elimina los elementos 4 a 6 de la lista
        imprimirLista(lista1); // imprime los elementos de lista1
        imprimirListaInversa(lista1); // imprime la lista en oeden inverso
    }// fín main
    private static void  imprimirLista(LinkedList<String> lista){
        System.out.printf("%nLista: %n");
        for (String color: lista){
            System.out.printf("%s ", color);
        }
        System.out.println();
    } // fin de imprimirLista
    // Localiza los objetos string y los convierte a mayúsculas
    private static void  convertirCadenasAMayusculas(LinkedList<String> lista){
        ListIterator<String> iterator = lista.listIterator();
        while (iterator.hasNext()){
            String color = iterator.next(); // Obtiene el elemento
            iterator.set(color.toUpperCase()); // Convierte a mayúsculas
        }
    } // fin de convertirCadenasAMayusculas
    // obtener una sublista y utilizar el método clear para eliminar los elementos
    // de la misma
    private static void eliminarElementos(List<String> lista, int inicio, int fin){
        lista.subList(inicio, fin).clear(); // elimina los elementos
    }
    // imprime la lista inversa
    public static void imprimirListaInversa(List<String> lista){
        ListIterator <String> iterador = lista.listIterator(lista.size());
        System.out.printf("%nLista inversa: %n");
        // imprime la lista en orden inverso
        while (iterador.hasPrevious()){
            System.out.printf("%s ", iterador.previous());
        }
    }
}