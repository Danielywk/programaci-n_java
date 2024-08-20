package U1.P02Hilos.T05_ArrayListMenu;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class Menu {
    private static final Scanner entrada = new Scanner(System.in);
    static ArrayList<Amigo> ListaAmigos = new ArrayList<>();

    public static void main(String[] args) {
        imprimirAmigos();
    }

    private static void menu() {
        ;
        System.out.println("Array List de Amigos");
        System.out.println("----------------------\n");
        System.out.println("1.- Dar de alta un amigo");
        System.out.println("2.- Dar de baja un amigo");
        System.out.println("3.- Buscar un amigo por nombre");
        System.out.println("4.- Imprimir lista de amigos");
        System.out.println("5.- Buscar un amigo por indice");
        System.out.println("6.- Salir");
        System.out.print("Elige tu opción: ");
    }

    public static void imprimirAmigos() {
        //mostrarCanciones();
        int opcion, indice;
        String ind;
        int id;
        do {
            menu();
            opcion = entrada.nextInt();
            entrada.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("¿Cuántos amigos deseas agregar?");
                    int num = entrada.nextInt();
                    for (int j = 0; j < num; j++) {

                        System.out.print("Dime la clave de tu amigo: ");
                        id = entrada.nextInt();
                        entrada.nextLine();
                        indice = buscarAmigoPorID(id);
                        if (indice != -1) {
                            System.out.println("La clave ya existe...");
                        } else {

                                System.out.print("Dime el nombre de tu amigo: ");
                                String name = entrada.nextLine();
                                // Con esos datos se crea una instancia de Estudiante
                                Amigo amigol = new Amigo(id, name);
                                // Y esa instancia la agregamos a la lista
                                ListaAmigos.add(amigol);


                        }
                    }
                    break;
                case 2:
                    System.out.print("Dame la clave del amigo a borrar: ");
                    id = entrada.nextInt();
                    indice = buscarAmigoPorID(id);
                    if (indice != -1) {
                        borrarAmigo(id);

                    } else {
                        System.out.println("No Encontrado");
                    }
                    break;
                case 3:
                    System.out.print("Dame el nombre del amigo a buscar: ");
                    String nom = entrada.nextLine();
                    String nom1 = String.valueOf(ListaAmigos);
                    if (nom.equalsIgnoreCase(nom1)){
                        System.out.println("El nombre está en la lista");
                    }else{
                        System.out.println("No encontrado");
                    }
                case 4:
                    mostrarAmigos();
                    break;
                case 5:
                    System.out.print("Dame la clave del amigo a buscar: ");
                    id = entrada.nextInt();
                    indice = buscarAmigoPorID(id);
                    if (indice != -1) {
                        System.out.println("Encontrado en la posición " + indice);
                    } else {
                        System.out.println("No Encontrado");
                    }
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("No valido");
                    break;
            } // fin de switch
        } while (opcion != 6);
    }

    public static void borrarAmigo(int id) {
        Iterator<Amigo> amigoIterator = ListaAmigos.iterator();
        while (amigoIterator.hasNext()) {
            Amigo amigox = amigoIterator.next();
            System.out.println(amigox);
            if (id == amigox.getId()) {
                amigoIterator.remove();
            }
        }
    }
    private static int buscarAmigoPorID(int idBuscar) {
        for (int i = 0; i < ListaAmigos.size(); i++) {
            if (ListaAmigos.get(i).getId() == idBuscar) {
                return 1;
            }
        }
        return -1;
    }


    private static void mostrarAmigos() {
        // Imprimimos la lista
        for (Amigo aux : ListaAmigos) {
            System.out.println(aux.toString());
        }
    }
}