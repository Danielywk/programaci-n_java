package U2.P03Colecciones.Metodos.ComparadorPersona;
import java.util.Comparator; // importación de la libreria Comparator
public class ComparadorEdad implements Comparator <Persona> {

    @Override
    public int compare(Persona persona1, Persona persona2) {
        int diferenciaEdad = persona1.getEdad() - persona2.getEdad(); // Ordena las edades
        return diferenciaEdad; // Regresa las diferencias de edades en base al orden
    }
}