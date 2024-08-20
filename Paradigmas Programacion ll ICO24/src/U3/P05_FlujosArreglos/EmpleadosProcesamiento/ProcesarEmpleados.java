package U3.P05_FlujosArreglos.EmpleadosProcesamiento;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ProcesarEmpleados {
    public static void main(String[] args) {
        Empleado[] empleados = {
                new Empleado("José", "García", 5000, "TI"),
                new Empleado("Rosario", "Vázquez", 7600, "TI"),
                new Empleado("Luis", "Prieto", 10000, "TI"),
                new Empleado("Luis", "Vázquez", 5000, "Ventas"),
                new Empleado("Gabriela", "Prieto", 5000, "Ventas"),
                new Empleado("Vianney", "Rodríguez", 65000, "Marketing"),
                new Empleado("Francisco", "Vázquez", 50000, "Marketing"),
                new Empleado("Irma", "Domínguez", 7500, "Ventas"),
                new Empleado("Rosario", "Prieto", 100000, "Marketing")
        };
        List<Empleado> listaEmpleados = Arrays.asList(empleados);
        // Muestra a todos los empleados
        System.out.println("Lista completa de los empleados");
        imprimirEncabezado();
        listaEmpleados.stream().forEach(System.out::println); //(s-> System.out.println(s)) Alernativo
        imprimirRenglon();

        // Ordenamiento de objetos Empleado según varios campos

        // Funciones para obtener primer nombre y apellido de un Empleado
        Function<Empleado, String> porPrimerNombre = Empleado::getPrimerNombre;
        Function<Empleado, String> porApellidoPaterno = Empleado::getApellidoPaterno;
        // Comparator para comparar Empleados por primer nombre y luego por
        // apellido paterno
        Comparator<Empleado> apellidoLuegoNombre = Comparator.comparing(porApellidoPaterno).thenComparing(porPrimerNombre);
        // Ordena Empleados por apellido paterno luego por nombre
        System.out.println("Empleados en orden ascendente por apellido y " + "luego por nombre");
        imprimirEncabezado();
        listaEmpleados.stream().sorted(apellidoLuegoNombre)
                .forEach(System.out::println);
        imprimirRenglon();
        // Ordena Empleados en forma descendente por apellido paterno luego por nombre
        System.out.println("Empleados en orden descendente por apellido y " + "luego por nombre");
        imprimirEncabezado();
        listaEmpleados.stream().sorted(apellidoLuegoNombre.reversed())
                .forEach(System.out::println);
        imprimirRenglon();
        // Agrupación de objetos Empleado por departamento
        System.out.println("Empleados por departamento");
        Map<String, List<Empleado>> agrupadoPorDepartamento = listaEmpleados.stream()
                .collect(Collectors.groupingBy(Empleado::getDepartamento));
        agrupadoPorDepartamento.forEach(
                (departamento, empleadosEnDepartamento) -> {
                    System.out.println(departamento);
                    empleadosEnDepartamento.forEach(
                            empleado -> System.out.printf("  $s%n", empleado.toString())
                    );
                }
        );
    }

    public static void imprimirRenglon() {
        System.out.println();
        System.out.println("---------------------------------------------------");
    }

    public static void imprimirEncabezado() {
        System.out.printf("%7s %12s %17s %12s%n", "Nombre", "Apellidos", "Salario", "Departamento");
        System.out.println("---------------------------------------------------");
    }


}
