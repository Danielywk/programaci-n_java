package U2.P03Colecciones.Metodos.ComparadorPersona;
import java.util.Comparator; // importación de la libreria Comparator
public class ComparadorNombre implements Comparator <Persona>{
    @Override
    public int compare(Persona persona1, Persona persona2) {
        return persona1.getNombre().compareTo(persona2.getNombre()); // Uso del método compareTo para comparar cadwnas
    }
}