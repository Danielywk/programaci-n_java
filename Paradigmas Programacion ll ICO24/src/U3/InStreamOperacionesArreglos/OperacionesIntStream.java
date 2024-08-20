package U3.InStreamOperacionesArreglos;

import java.util.stream.IntStream;

// Demostración con las operaciones IntStream
public class OperacionesIntStream {
    public static void main(String[] args) {
        int [] valores = {3, 10, 6, 1, 4, 8, 2, 5, 9, 7};
        // muestra los valores originales
        System.out.print("Valores originales: ");
        IntStream.of(valores).forEach(valor -> System.out.printf("%d ", valor));
        System.out.println();
    }
}
