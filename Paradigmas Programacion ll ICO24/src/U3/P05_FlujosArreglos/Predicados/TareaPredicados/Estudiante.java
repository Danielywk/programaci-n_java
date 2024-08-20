package U3.P05_FlujosArreglos.Predicados.TareaPredicados;

public class Estudiante {
    int clave;
    String nombre;
    String apellidos;
    double calificacion1;
    double calificacion2;
    double promedio;

    public Estudiante(int clave, String nombre, String apellidos, double calificacion1, double calificacion2, double promedio) {
        this.clave = clave;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.calificacion1 = calificacion1;
        this.calificacion2 = calificacion2;
        this.promedio = promedio;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public double getCalificacion1() {
        return calificacion1;
    }

    public void setCalificacion1(double calificacion1) {
        this.calificacion1 = calificacion1;
    }

    public double getCalificacion2() {
        return calificacion2;
    }

    public void setCalificacion2(double calificacion2) {
        this.calificacion2 = calificacion2;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return String.format("%10d%15s%15s%8.1f%8.1f%8.1f", clave, nombre, apellidos, calificacion1, calificacion2, promedio);
    }
}