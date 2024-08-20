package U3.InStreamOperacionesArreglos.Tarea_Streams;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PruebaEstudiante {
    public static void main(String[] args) {
        Estudiante[] estudiantes = {
                new Estudiante("José", "Alvarez", 22, "Ingeniería", 8.4),
                new Estudiante("Juan", "Ruíz", 19, "Derecho", 6.3),
                new Estudiante("Carlos", "Pérez", 24, "Contaduria", 7.3),
                new Estudiante("Pablo", "Sanchez", 20, "Administración", 8.9),
                new Estudiante("Edwin", "Gaytan", 21, "Psicología", 8.6),
                new Estudiante("Kevin", "Herrera", 25, "Informática", 7.0),
                new Estudiante("Rosa", "Morales", 23, "Derecho", 9.9),
                new Estudiante("Imelda", "López", 21, "Contaduria", 8.0),
                new Estudiante("Gabriel", "Francisco", 24, "Administración", 8.1),
                new Estudiante("Lupe", "Fidencio", 24, "Ingeniería", 7.8),
                new Estudiante("Santiago", "Anastacio", 20, "Informática", 8.6),
                new Estudiante("Esmeralda", "Luna", 21, "Contaduria", 8.6),
                new Estudiante("Andrea", "Apolinar", 20, "Informática", 10.0),
                new Estudiante("Michel", "Amado", 22, "Psicología", 6.7),
                new Estudiante("Lucia", "Ramirez", 21, "Derecho", 9.0),
                new Estudiante("Ana", "Segundo", 20, "Ingeniería", 6.4),
                new Estudiante("Montse", "Gómez", 21, "Psicología", 6.0),
                new Estudiante("Yaneth", "Calixto", 23, "Contaduria", 7.9),
                new Estudiante("Dulce", "Huitrón", 22, "Ingeniería", 9.2),
                new Estudiante("Carmen", "Zamora", 21, "Derecho", 7.9)
        };
        List<Estudiante> listaEstudiantes = Arrays.asList(estudiantes);
        // Muestrarlos en pantalla.
        System.out.println("Lista completa de los estudiantes");
        imprimirEncabezado();
        listaEstudiantes.stream().forEach(System.out::println); //(s-> System.out.println(s)) Alernativo
        imprimirRenglon();
        // Mostrar a los estudiantes que tienen de 8 a 10 de promedio en forma ascendente.
        Predicate<Estudiante> ochoAdiez = estudiante -> (estudiante.getPromedio() >= 8.0 || estudiante.getPromedio() == 10.0);
        System.out.println("Estudiantes que tienen de 8 a 10 de calificación");
        imprimirEncabezado();
        listaEstudiantes.stream()
                .filter(ochoAdiez)
                .sorted(Comparator.comparing(Estudiante::getPromedio))
                .forEach(System.out::println);
        imprimirRenglon();
        // Mostrar a los alumnos ordenados por nombre y luego por apellidos.
        Function<Estudiante, String> porNombre = Estudiante::getNombre;
        Function<Estudiante, String> porApellido = Estudiante::getApellidos;
        Comparator<Estudiante> nombreLuegoApellido = Comparator.comparing(porNombre).thenComparing(porApellido);
        System.out.println("Estudiantes en orden ascendente por nombre y " + "luego por apellido");
        imprimirEncabezado();
        listaEstudiantes.stream()
                .sorted(nombreLuegoApellido)
                .forEach(System.out::println);
        imprimirRenglon();
        // Mostrar agrupados a los estudiantes por carrera.
        System.out.println("Estudiantes agrupados por carrera");
        Map<String, List<Estudiante>> agrupadoPorCarrera = listaEstudiantes.stream()
                .collect(Collectors.groupingBy(Estudiante::getCarrera));
        agrupadoPorCarrera.forEach(
                (carrera, estudianteCarrera) -> {
                    System.out.println(carrera);
                    estudianteCarrera.forEach(
                            estudiante -> System.out.printf("  %s%n", estudiante.toString())
                    );
                }
        );
        imprimirRenglon();
        // Contar a los estudiantes que hay en cada carrera
        System.out.println("Conteo de estudiantes por carrera:");
        Map<String, Long> conteoPorCarrera = listaEstudiantes.stream()
                .collect(Collectors.groupingBy(Estudiante::getCarrera, TreeMap::new, Collectors.counting()));
        conteoPorCarrera.forEach(
                (carrera, conteo) -> System.out.printf("%s tiene %d estudiante(s)%n", carrera, conteo)
        );
        imprimirRenglon();
        // Muestra el promedio de edad de los estudiantes de Ingeniería.
        System.out.printf("Promedio de la edad de los estudiantes de ingeniería: %.2f%n",
                listaEstudiantes.stream()
                        .mapToDouble(Estudiante::getEdad)
                        .average()
                        .getAsDouble()
        );
    }

    public static void imprimirRenglon() {
        System.out.println();
        System.out.println("-------------------------------------------------------------");
    }

    public static void imprimirEncabezado() {
        System.out.printf("%10s %14s %7s %17s %9s%n", "Nombre", "Apellidos", "Edad", "Carrera", "Promedio");
        System.out.println("-------------------------------------------------------------");
    }
}