package U2.P03Colecciones.ArrayListProyecto;
/* El programa pedirá que ingrese una cantidad de amigos. A continuación mediate un for
pedirá el nombre de cada uno de sus amigos y los almacenará en un ArrayList que se llame
ListaAmigos.
Posteriormente los mostrará en pantalla.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;
public class ArrayListAmigos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingreesa cantidad de amigos: ");
        int amiguitos = sc.nextInt();
        String [] amigos = new String[amiguitos];
        for (int i = 0; i < amigos.length; i++) {
            System.out.print("Ingrese nombre del amigo: ");
            amigos[i] = sc.next();
        }


        List<String> listaAmigos = new ArrayList<String>();
        System.out.println("ArrayList: ");

        // listaColores.add(amigos[0]);
        for (String amigo: amigos){
            listaAmigos.add(amigo);
        }
        // Imprimir el contenido de listaAmigos
        for (int i = 0; i < listaAmigos.size(); i++) {
            System.out.printf("%s ", listaAmigos.get(i));
        }
    }
}
