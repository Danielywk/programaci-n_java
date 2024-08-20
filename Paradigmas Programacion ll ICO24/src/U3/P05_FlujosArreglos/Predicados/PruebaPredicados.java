package U3.P05_FlujosArreglos.Predicados;

import java.util.ArrayList;
import java.util.List;

public class PruebaPredicados {
    public static void main(String[] args) {
        List<Persona> listaPersonas = new ArrayList<>();
        listaPersonas.add(new Persona("Luis", "Pérez", 20));
        listaPersonas.add(new Persona("Armando", "Sánchez", 30));
        listaPersonas.add(new Persona("Luis", "Blanco", 40));
        listaPersonas.add(new Persona("Felipe", "Blanco", 70));
        // Recorremos la lista por medio de un Stream
        System.out.println("Mostrando datos de todas las personas");
        imprimirEncabezado();
        listaPersonas.stream()
                .forEach(p -> System.out.println(p.toString()));
    }
    public static void imprimirRenglon(){
        System.out.println();
        System.out.println("----------------------------------------------------------");
    }
    public static void imprimirEncabezado(){
        System.out.printf("%15s%15s%5s%n", "Nombre", "Apellidos", "Edad");
        System.out.println("-----------------------------------");
    }
}
