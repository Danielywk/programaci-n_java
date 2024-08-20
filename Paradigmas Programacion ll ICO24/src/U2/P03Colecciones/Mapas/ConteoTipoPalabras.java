package U2.P03Colecciones.Mapas;

import java.util.*;

// Programa que cuenta en número de ocurrencias de un objeto String
public class ConteoTipoPalabras {
    public static void main(String[] args) {
        // Crea HashMap para almacenar valores String y valores Integer
        Map<String, Integer> miMap = new HashMap<>();
        crearMap(miMap); // Crea un mapa con base a la entrada del usuario
        mostrarMap(miMap); // Muestra el contenido del mapa
    }

    // Muestra el contenido del mapa
    private static void mostrarMap(Map<String, Integer> mapa) {
        Set<String> claves = mapa.keySet(); // Obtiene las claves
        // Ordena las claves
        TreeSet<String> clavesOrdenadas = new TreeSet<>(claves);
        System.out.printf("%nEl mapa contiene: %nClave\t\tValor%n");
        // Genera la salida para cada clave del mapa
        for (String clave : clavesOrdenadas) {
            System.out.printf("%-10s%10s%n", clave, mapa.get(clave));
        }
        // Escribe el tamaño del mapa y si está vacío
        System.out.printf("&nTamaño: %c%n¿Está vacío el mapa?: %b%n", mapa.size(), mapa.isEmpty());
    }

    // Crea un mapa a partir de la entrada del usuario
    private static void crearMap(Map<String, Integer> mapa) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escribe un anunciado: ");
        String enunciado = entrada.nextLine();

        // Divide el enunciado en tokens
        String[] tokens = enunciado.split(" ");

        // Procesamiento del texto de entrada
        for (String token : tokens) {
            String palabra = token.toLowerCase();
            // Si el mapa contiene la entrada
            if (mapa.containsKey(palabra)) { //¿Está la palabra en map?
                int cuenta = mapa.get(palabra); // Obtiene la cuenta actual
                mapa.put(palabra, cuenta + 1); // Incrementa la cuenta
            } else {
                // Agrega una nueva palabra con una cuenta de uno al mapa
                mapa.put(palabra, 1);
            }
        }
    }
}