package U3.ProgramacionImperativaDeclarativa;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
Este programa dado un conjunto de elementos quiere saber cuántos números
son mayores a 60.
*/
/*
 * No es necesario explicarle cómo hacer las cosas, solo "Declaramos".
 * Usa la programación funcional: es de manera más rápida, concisa y con menos errores de programar.
 * Los programas funcionales son más fáciles de paralelizar, es decir: usar más funciones al mismo tiempo.
 */
/*
 * Expresiones Lambda
 * Representa un método anónimo:
 * private double sumar(double a, double b){
 * return a + b;
 * }
 * En Lamba queda:
 * (double a, double b){ -> No tiene nombre: Es anónima.
 * return a + b;
 * }
 * Sintaxis
 * Una lambda consiste en una lista de parámetros seguida del token flecha (->)
 * y un cuerpo.
 * (listaParámetros) -> {instrucciones}
 * (int x, int y) -> {return x + y}
 * Se pueden omitir los tipos de parámetros:
 * (x, y) -> {return x + y}
 * Cuando el cuerpo contiene solo una instrucción, se puede omitir la palabra
 * clave "return" y las llaves.
 * (x, y) -> x + y;
 *
 * Cuando la lista de parámetros se peden omitir los paréntesis.
 * valor -> souf("%d ", valor);
 * Para definir una lambda con una lista de parámetros vacios, específica la lista de parámetros
 * como paréntesis vacios a la izquierda del token flecha (->):
 * ()-> sout("Bienvenido a los lambdas");
 * Flujos (Streams)
 * Sirven para procesar colecciones (Arraylist, List, HashMap, Set, Queue, Stack), son
 * similares a los iteradores. En conjunto con las lambdas, los flujos te permiten realiar tareas
 * sobre colecciones de elementos, a menudo de un objeto arreglo o colección.
 * */
public class ConteoProgDeclarativo {
    public static void main(String[] args) {
        Double[] numeros = {2.4, 55.6, 90.12, 26.6, 100.0};
        Set<Double> conjuntoNumeros = new HashSet<>(Arrays.asList(numeros));
        long conteo = conjuntoNumeros.stream().filter(num -> num > 60).count();
        System.out.println("Total de valores mayores a 60: " + conteo);
    }
}