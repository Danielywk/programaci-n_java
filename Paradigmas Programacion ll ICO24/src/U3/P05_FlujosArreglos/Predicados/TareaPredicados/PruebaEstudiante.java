package U3.P05_FlujosArreglos.Predicados.TareaPredicados;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;

public class PruebaEstudiante {

    public static void main(String[] args) {
        // Mostrar todos los estudiantes (Agregar 20).
        Estudiante[] estudiantes = {
                new Estudiante(1, "José", "Alvarez", 9.7, 7.2, 8.4),
                new Estudiante(2, "Juan", "Ruíz", 6.4, 6.2, 6.3),
                new Estudiante(3, "Carlos", "Pérez", 7.4, 7.2, 7.3),
                new Estudiante(4, "Pablo", "Sanchez", 8.7, 9.2, 8.9),
                new Estudiante(5, "Edwin", "Gaytan", 7.8, 9.4, 8.6),
                new Estudiante(6, "Kevin", "Herrera", 6.8, 7.2, 7.0),
                new Estudiante(7, "Rosa", "Morales", 9.8, 9.9, 9.9),
                new Estudiante(8, "Imelda", "López", 7.3, 8.7, 8.0),
                new Estudiante(9, "Gabriel", "Francisco", 4.4, 9.7, 8.1),
                new Estudiante(10, "Lupe", "Fidencio", 5.6, 10.0, 7.8),
                new Estudiante(11, "Santiago", "Anastacio", 7.6, 9.6, 8.6),
                new Estudiante(12, "Esmeralda", "Luna", 9.4, 7.8, 8.6),
                new Estudiante(13, "Andrea", "Apolinar", 10.0, 10.0, 10.0),
                new Estudiante(14, "Michel", "Amado", 5.6, 7.8, 6.7),
                new Estudiante(15, "Lucia", "Ramirez", 8.8, 9.5, 9.0),
                new Estudiante(16, "Ana", "Segundo", 7.3, 5.4, 6.4),
                new Estudiante(17, "Montse", "Gómez", 6.7, 4.3, 6.0),
                new Estudiante(18, "Yaneth", "Calixto", 8.5, 7.2, 7.9),
                new Estudiante(19, "Dulce", "Huitrón", 10.0, 8.4, 9.2),
                new Estudiante(20, "Carmen", "Zamora", 9.0, 6.7, 7.9)
        };
        List<Estudiante> listaEstudiantes = Arrays.asList(estudiantes);
        // Muestra a todos los empleados
        System.out.println("Lista completa de los estudiantes");
        imprimirEncabezado();
        listaEstudiantes.stream().forEach(System.out::println); //(s-> System.out.println(s)) Alernativo
        imprimirRenglon();

        // Mostrar aquellos estudiantes cuyos promedios muestren que están aprobados.
        Predicate<Estudiante> ochoAdiez = estudiante -> (estudiante.getPromedio() >= 8.0 && estudiante.getPromedio() <= 10.0);
        System.out.println("Estudiantes que tienen calificación de 8.0 a 10.0 y que están aprodados " + "ordenados por promedio");
        imprimirEncabezado();
        listaEstudiantes.stream()
                .filter(ochoAdiez)
                .sorted(Comparator.comparing(Estudiante::getPromedio))
                .forEach(System.out::println);
        imprimirRenglon();
        // Mostrar aquellos estudiantes cuyo promedio esté entre 6.0 y 8.0 (usar predicados.
        // para los filtros, ocupar la operación and()).
        Predicate<Estudiante> seisAocho = estudiante -> (estudiante.getPromedio() >= 6.0 && estudiante.getPromedio() <= 8.0);
        System.out.println("Estudiantes que tienen calificación de 6.0 a 8.0 " + "ordenados por promedio");
        imprimirEncabezado();
        listaEstudiantes.stream()
                .filter(seisAocho)
                .sorted(Comparator.comparing(Estudiante::getPromedio))
                .forEach(System.out::println);
        imprimirRenglon();
        // Mostrar los nombres y apellidos de los estudiantes que no hayan aprobado en su
        // primer examen, ocupar la operación negate().
        Predicate<Estudiante> noAprobado = estudiante -> (estudiante.getPromedio() >= 0 != estudiante.getPromedio() >= 8.0);
        System.out.println("Estudiantes que no aprobaron " + "ordenados por promedio");
        imprimirEncabezado();
        listaEstudiantes.stream()
                .filter(noAprobado)
                .sorted(Comparator.comparing(Estudiante::getPromedio))
                .forEach(System.out::println);
        imprimirRenglon();
        // Mostrar los registros de los estudiantes que hayan aprobado en el primer examen, ocupar
        // la operación or()
        Predicate<Estudiante> aprodadoPrimer = estudiante -> (estudiante.getCalificacion1() >= 8.0 || estudiante.getCalificacion1() == 10.0);
        System.out.println("Estudiantes que aprobaron en el primer parcial " + "ordenados por promedio");
        imprimirEncabezado();
        listaEstudiantes.stream()
                .filter(aprodadoPrimer)
                .sorted(Comparator.comparing(Estudiante::getCalificacion1))
                .forEach(System.out::println);
        imprimirRenglon();
        // Mostrar todos los estudiantes en orden ascendente según el apellido.
        Function<Estudiante, String> porApellidos = Estudiante::getApellidos;
        Comparator<Estudiante> apellidoPaterno = Comparator.comparing(porApellidos);
        System.out.println("Estudiantes en orden ascendente por apellido");
        imprimirEncabezado();
        listaEstudiantes.stream().sorted(apellidoPaterno)
                .forEach(System.out::println);
        imprimirRenglon();
        // Pedir una letra. Mostrar todos los estudiantes cuyos nombres empiecen con esa letra.
        Scanner sc = new Scanner(System.in);
        System.out.println("Muestra de todos los estudiantes cuyos nombres empiecen con una letra");
        System.out.print("Dame una letra: ");
        String entrada = sc.next();
        Predicate<Estudiante> porLetra = estudiante -> estudiante.getNombre().contains(entrada);
        System.out.println("Estudiantes ordenados dada una letra");
        imprimirEncabezado();
        listaEstudiantes.stream()
                .filter(porLetra)
                .sorted(Comparator.comparing(Estudiante::getNombre))
                .forEach(System.out::println);
        imprimirRenglon();
    }

    public static void imprimirRenglon() {
        System.out.println();
        System.out.println("------------------------------------------------------------------");
    }

    public static void imprimirEncabezado() {
        System.out.printf("%10s %14s %14s %7s %7s %9s%n", "Clave", "Nombre", "Apellidos", "1er P", "2do P", "Promedio");
        System.out.println("------------------------------------------------------------------");
    }

}