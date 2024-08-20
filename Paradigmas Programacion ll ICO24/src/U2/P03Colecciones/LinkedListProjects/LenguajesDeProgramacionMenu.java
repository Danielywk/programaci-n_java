package U2.P03Colecciones.LinkedListProjects;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
public class LenguajesDeProgramacionMenu {
    static LinkedList <String> listaLenguajesDeProgramacion = new LinkedList<>();
    public static void main(String[] args) {
        System.out.println("Pograma elaborado por Isaías Amado Carreño.");
        System.out.println("-------------------------------------------");
        listaLenguajesDeProgramacion.add("C++");
        Scanner entrada = new Scanner(System.in);
        int opcion;
        do {
            menu();
            opcion = entrada.nextInt();
            switch (opcion){
                case 1:
                    System.out.print("Dame elemento: ");
                    String agregar = entrada.next();
                    listaLenguajesDeProgramacion.add(agregar); // Agrega un elemento
                break;
                case 2:
                    System.out.print("Dame elemento: ");
                    String agregarFinal = entrada.next();
                    listaLenguajesDeProgramacion.addLast(agregarFinal); // Agrega un elemento al final
                    break;
                case 3:
                    System.out.print("Dame elemento: ");
                    String agregarPrimero = entrada.next();
                    listaLenguajesDeProgramacion.addFirst(agregarPrimero); // Agrega un elemnto en la primera posición
                    break;
                case 4:
                    System.out.println("----------------------------------------------------");
                    System.out.println("Valores del LinkedList listaLenguajesDeProgramación: ");
                    listaLenguajesDeProgramacion.forEach(lenguajes -> { // imprime los elemntos del Linked List por cada
                        // elemento
                        System.out.print(lenguajes + " ");
                    });
                    System.out.println(" ");
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("No valido!");
                    break;
            }
        }while (opcion != 5);
    } // fin de main
    public static void menu(){
        System.out.println("\n/ Lenguajes de Programación 2021");
        System.out.println("--------------------------------");
        System.out.println("1.- Añadir elemento");
        System.out.println("2.- Añadir elemento al final");
        System.out.println("3.- Añadir elemento al principio");
        System.out.println("4.- Imprimir Lista de elementos usando forEach");
        System.out.println("5.- Salir");
        System.out.print("?: ");

    }
}// fin de class