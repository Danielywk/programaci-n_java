package U2.P03Colecciones.Metodos.ComparadorPersona;
import java.util.Comparator; // importación de la libreria Comparator
public class ComparadorApellido implements Comparator <Persona>{
    @Override
    public int compare(Persona persona1, Persona persona2) {
        return persona1.getApellido().compareTo(persona2.getApellido()); // Uso del método compareTo para comparar cadwnas
    }
}