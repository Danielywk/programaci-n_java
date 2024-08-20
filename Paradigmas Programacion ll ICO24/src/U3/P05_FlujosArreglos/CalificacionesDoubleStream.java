package U3.P05_FlujosArreglos;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class CalificacionesDoubleStream {
    public static void main(String[] args) {
        // Dado el siguiente arreglo de calificaciones
        double calificaciones[] = {3.2, 10.0, 6.7, 5.1, 4.6, 7.8, 8.2, 7.5, 5.8, 8.7};
        // Imprimir las califiaciones originales
        System.out.print("Valores originales: ");
        DoubleStream.of(calificaciones).forEach(valor -> System.out.printf("%.1f ", valor));
        imprimirRenglon();

        // Promedio de aquellos que pasaron
        System.out.printf("Promedio de aquellos que pasaron: %.1f",
                DoubleStream.of(calificaciones)
                        .filter(calificacion -> calificacion >= 6.0)
                        .average().getAsDouble()
        );
        imprimirRenglon();
        // Número de alumnos reprobados
        System.out.printf("Número de alumnos no aprobados: %d",
                DoubleStream.of(calificaciones).filter(calificacion -> calificacion < 6.0).count()
        );
        imprimirRenglon();
        // Calificación máxima de los que están 6.0 y 8.0
        // 6.7, 7.8, 7.5 => 7.8
        System.out.printf("Calificación máxima de los que están entre 6.0 y 8.0: %.1f",
                DoubleStream.of(calificaciones).filter(calif -> calif >= 6.0 && calif <= 8.0).max().getAsDouble()
        );
        imprimirRenglon();
        // Calificación mínima de los que están entre 4.0 y 6.0
        // 5.1, 4.6, 5.8 =>
        System.out.printf("Calificación mínima de los que están entre 4.0 y 6.0: %.1f",
                DoubleStream.of(calificaciones)
                        .filter(calif -> calif >= 4.0 && calif <= 6.0).min().getAsDouble()
        );

        // Mostrar los que sacaron entre 5.0 y 5.9 y sumarles un punto
        System.out.println("Mostrar los que sacaron entre 5.0 y 5.9 y sumarles un punto");
        DoubleStream.of(calificaciones)
                .filter(calif -> calif >= 5.0 && calif < 6.0).map(calif -> calif + 1.0).forEach(calificacion -> System.out.printf("%.1f", calificacion));

    }

    public static void imprimirRenglon() {
        System.out.println();
        System.out.println("------------------------------------------------------------");
    }
}
