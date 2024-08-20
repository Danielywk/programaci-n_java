package U2.P03Colecciones.Metodos.ComparadorPersona;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class OrdenamientoListaPersonas {
    public static void main(String[] args) {
        System.out.println("Pograma elaborado por Isaías Amado Carreño.");
        System.out.println("-------------------------------------------");
        List<Persona> listaPersonas = new ArrayList<>();
        listaPersonas.add(new Persona("Pedro", "Picapiedra", 40));
        listaPersonas.add(new Persona("Pablo", "Mármol", 30));
        listaPersonas.add(new Persona("Vilma", "De Picapiedra", 35));
        listaPersonas.add(new Persona("Betty", "Mármol", 25));
        listaPersonas.add(new Persona("Tony", "Stark", 56));


        Scanner entrada = new Scanner(System.in);
        int opcion;
        do {
            menu();
            opcion = entrada.nextInt();
            switch (opcion){
                case 1:
                    // Ordenamos por nombre
                    Collections.sort(listaPersonas, new ComparadorNombre());
                    // imprime los lementos del objeto List
                    System.out.println("-------------------------------------------");
                    System.out.println("Elementos de la lista ordenados por Nombre:");
                    listaPersonas.forEach(persona -> System.out.println(persona));
                    System.out.println();
                    break;
                case 2:
                    // Ordenamos por apellido
                    Collections.sort(listaPersonas, new ComparadorApellido());
                    // imprime los lementos del objeto List
                    System.out.println("---------------------------------------------");
                    System.out.println("Elementos de la lista ordenados por Apellido:");
                    listaPersonas.forEach(persona -> System.out.println(persona));
                    System.out.println();
                    break;
                case 3:
                    // Ordenamos por eddad
                    Collections.sort(listaPersonas, new ComparadorEdad());
                    // imprime los lementos del objeto List
                    System.out.println("-----------------------------------------");
                    System.out.println("Elementos de la lista ordenados por Edad:");
                    listaPersonas.forEach(persona -> System.out.println(persona));
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("No valido!");
                    break;
            }
        }while (opcion != 4);
    }// fin de main
    public static void menu(){
        System.out.println("\n/ Ordenamiento de Personas");
        System.out.println("--------------------------");
        System.out.println("1.- Ordenar por nombre");
        System.out.println("2.- Ordenar por apellido");
        System.out.println("3.- Ordenar por edad");
        System.out.println("4.- Salir");
        System.out.print("?: ");
    }
}// fin de class