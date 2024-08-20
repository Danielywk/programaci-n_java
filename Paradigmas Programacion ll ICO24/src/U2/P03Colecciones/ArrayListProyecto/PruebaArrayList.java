package U2.P03Colecciones.ArrayListProyecto;

import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
import java.util.Iterator;

public class PruebaArrayList {
    public static void main(String[] args) {
        // Crear un arreglo que guarde colores
        String[] colores = {"MAGENTA", "ROJO", "AZUL", "CYAN"};
        List<String> listaColores = new ArrayList<String>();
        System.out.println("ArrayList: ");

        // listaColores.add(colores[0]);
        for (String color : colores) {
            listaColores.add(color);
        }
        // Imprimir el contenido de listaColores
        for (int i = 0; i < listaColores.size(); i++) {
            System.out.printf("%s ", listaColores.get(i));
        }
    }
}