package U3.P05_FlujosArreglos.Examen;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.*;

public class ExamenFlujos {
    public static void main(String[] args) {
        String[] names = {"John", "Peter", "Susan", "Kim", "Jen", "George", "Alan", "Stacy", "Michelle", "john"};
        // Selecciona usando Streams los nombres cuya longitud sea mayor que 4 (10 puntos)
        System.out.printf("Nombres mayores que 4 en orden ascendente: %s%n",
                Arrays.stream(names)
                        .filter(s -> s.length() > 4)
                        .sorted(String.CASE_INSENSITIVE_ORDER)
                        .collect(Collectors.toList())
        );

        // Usando Streams convierte a mayúsculas todos los nombres (10 puntos)
        System.out.printf("Nombres en mayúsculas: %s%n", Arrays.stream(names)
                .map(String::toUpperCase) // :: Lambda por cada cadena, forma alternativa
                .collect(Collectors.toList())
        );
        Integer[] valores = {3, 4, 1, 5, 20, 1, 3, 3, 4, 6};
        // Usando Streams mostrar el promedio de los números pares
        // mayores que 3 (10 puntos)
        System.out.printf("Promedio de los número pares mayores que 3: %s%n",
                Arrays.stream(valores)
                        .filter(valor -> valor > 3 && valor % 2 == 0)
                        .mapToDouble(Integer::doubleValue)
                        .average()
                        .getAsDouble()
        );
        // Usando Streams mostrar la suma de los primeros 4 números (10 puntos)
        System.out.printf("Suma de los primeros 4 números: %s%n",
                Arrays.stream(valores)
                        .filter(valor -> valor >= 0 && valor <=4)
                        .mapToDouble(Integer::doubleValue)
                        .sum()
        );
        MyStudent[] students = {new MyStudent("John", "Lu", "CS", 32, 78),
                new MyStudent("Susan", "Yao", "Math", 31, 85.4), new MyStudent("Kim", "Johnson", "CS", 30, 78.1),
                new MyStudent("John", "Johnson", "CS", 23, 89.2), new MyStudent("Susan", "Johnson", "Math", 21, 89.1),
                new MyStudent("John", "Peterson", "CS", 21, 92.3), new MyStudent("Kim", "Yao", "Math", 22, 87.3),
                new MyStudent("Jeff", "Johnson", "CS", 23, 78.5),
                // Agrega un estudiante con tu nombre y edad
                new MyStudent("Isaias", "Amado", "Ig", 20, 85.6)
        };
        // Usando Streams agrupa a los estudiantes por edad,
        List<MyStudent> listStudents = Arrays.asList(students);
        Predicate<MyStudent> porEdad = Mstudent -> (Mstudent.getAge() > 0);
        System.out.println("\nEstudiantes agrupados por edad");
        System.out.println("------------------------------");
        listStudents.stream()
                .filter(porEdad)
                .sorted(Comparator.comparing(MyStudent::getAge).reversed())
                .forEach(System.out::println);

        // mostrar apellido y nombre (10 puntos)}
        Function<MyStudent, String> porNombre = MyStudent::getFirstName;
        Function<MyStudent, String> porApellido = MyStudent::getLastName;
        Comparator<MyStudent> nombreLuegoApellido = Comparator.comparing(porNombre).thenComparing(porApellido);
        System.out.println("\nEstudiantes en orden ascendente por nombre y " + "luego por apellido");
        System.out.println("---------------------------------------------------------------");
        listStudents.stream()
                .sorted(nombreLuegoApellido)
                .map(MyStudent::obtenerNombreCompleto)
                .forEach(System.out::println);
    }
}