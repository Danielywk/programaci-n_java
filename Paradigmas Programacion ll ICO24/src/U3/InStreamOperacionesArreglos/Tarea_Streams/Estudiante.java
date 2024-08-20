package U3.InStreamOperacionesArreglos.Tarea_Streams;

public class Estudiante {
    private String nombre;
    private String apellidos;
    private int edad;
    private String carrera;
    private double promedio;

    public Estudiante(String nombre, String apellidos, int edad, String carrera, double promedio) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.carrera = carrera;
        this.promedio = promedio;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return String.format("%10s%15s%8d%18s%10.1f", nombre, apellidos, edad, carrera, promedio);
    }
}
