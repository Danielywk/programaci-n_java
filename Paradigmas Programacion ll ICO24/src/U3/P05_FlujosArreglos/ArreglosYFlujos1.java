package U3.P05_FlujosArreglos;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArreglosYFlujos1 {
    public static void main(String[] args) {
        Integer[] valores = {2, 9, 5, 0, 3, 7, 1, 4, 8, 6};
        System.out.printf("Valores originales: %s%n", Arrays.asList(valores));
        // Ordenar los valores en forma ascendente con flujos
        System.out.printf("Valores ordenados: %s%n",
                Arrays.stream(valores)
                        .sorted()
                        .collect(Collectors.toList()) // Crea una nueva colección
        );
        // Valores mayores que 4
        List<Integer> mayorQue4 = Arrays.stream(valores)
                .filter(valor -> valor > 4)
                .collect(Collectors.toList());
        System.out.printf("Valores mayores que 4: %s%n", mayorQue4);
        // Filtra los valores mayores que 4 y luego ordena los resultados
        System.out.printf("Valores ordenados mayores que 4: %s%n",
                Arrays.stream(valores)
                        .filter(valor -> valor > 4)
                        .sorted()
                        .collect(Collectors.toList()) // Crea una nueva colección
        );
        // Al objeto List mayorQue4 se le ordena con flujos
        System.out.printf("Valores ordenados mayores que 4: %s%n",
                mayorQue4.stream()
                        .sorted().collect(Collectors.toList())
        );
    }
}
