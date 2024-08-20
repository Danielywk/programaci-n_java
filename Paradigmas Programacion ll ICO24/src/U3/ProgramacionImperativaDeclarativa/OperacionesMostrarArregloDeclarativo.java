package U3.ProgramacionImperativaDeclarativa;

import java.util.stream.IntStream;

public class OperacionesMostrarArregloDeclarativo {
    public static void main(String[] args) {
        int [] valores = {3, 18, 6, 1, 4, 8, 2, 5, 9, 7};
        IntStream.of(valores).forEach(valor -> System.out.printf("%d ", valor));
    }
}
