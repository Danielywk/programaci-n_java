package U3.P05_FlujosArreglos;

import java.util.Arrays;
import java.util.Locale;
import java.util.stream.Collectors;

public class ArreglosYFlujos2 {
    public static void main(String[] args) {
        String[] colores = {"Rojo", "naranja", "Amarillo", "verde", "Azul", "indigo", "Violeta"};
        System.out.printf("Colores originales: %s%n", Arrays.asList(colores));
        // Colores en mayúsculas
        System.out.printf("Colores en mayúsculas: %s%n", Arrays.stream(colores)
                .map(String::toUpperCase) // :: Lambda por cada cadena, forma alternativa
                .collect(Collectors.toList())
        );

        System.out.printf("Colores mayores que m en orden ascendente: %s%n",
                Arrays.stream(colores)
                        .filter(s -> s.compareToIgnoreCase("m") > 0)
                        .sorted(String.CASE_INSENSITIVE_ORDER)
                        .collect(Collectors.toList())
        );
        System.out.printf("Colores mayores que m en orden descendente: %s%n",
                Arrays.stream(colores)
                        .filter(s -> s.compareToIgnoreCase("m") > 0)
                        .sorted(String.CASE_INSENSITIVE_ORDER.reversed())
                        .collect(Collectors.toList())
        );
    }
}
