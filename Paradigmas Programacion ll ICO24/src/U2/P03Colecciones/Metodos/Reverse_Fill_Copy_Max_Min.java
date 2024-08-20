package U2.P03Colecciones.Metodos;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Los métodos Reverse, fill, copy, max y min de Collectons
public class Reverse_Fill_Copy_Max_Min {
    public static void main(String[] args) {

        // Crea y muestra un objeto List<Character>
        Character[] letras = {'P', 'C', 'M'};
        List<Character> listaLetras = Arrays.asList(letras); // obtiene el objeto list
        System.out.println("Lista letras contiene: ");
        imprimirListaLetras(listaLetras);
        // Invierte y muestra el objeto listaLetras
        Collections.reverse(listaLetras);
        System.out.println("\nDespués de llamar a reverse, listaLetras contiene: ");
        imprimirListaLetras(listaLetras);
        // Crea copia lista a partir de un arreglo de 3 objetos Character
        Character[] letrasCopia = new Character[3];
        List<Character> copiaLista = Arrays.asList(letrasCopia);
        // Copia el contenido de listaLetras a copiaLista
        Collections.copy(copiaLista, listaLetras);
        // copiaLista = listaLetras; // No copia los elemento, copia la referencia
        System.out.println("\nDespués de copiar, copiaLista contiene: ");
        imprimirListaLetras(copiaLista);
        // Llenar listaLetras con letras R
        Collections.fill(listaLetras, 'R');
        System.out.println("\nDespués de llamar a fill, listaLetras contiene: ");
        imprimirListaLetras(listaLetras);
        // copiaLista
        System.out.println("\ncopiaLista contiene: ");
        imprimirListaLetras(copiaLista);

    } // fin de main

    public static void imprimirListaLetras(List<Character> refLista) {
        System.out.println("La lista es: ");
        for (Character letra : refLista) {
            System.out.printf("%s ", letra);
        }
        System.out.printf("%nMax: %s", Collections.max(refLista));
        System.out.printf("%nMin: %s", Collections.min(refLista));
    } // fin de imprimirListaLetras
}
