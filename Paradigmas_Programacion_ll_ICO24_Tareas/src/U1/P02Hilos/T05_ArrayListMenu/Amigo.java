package U1.P02Hilos.T05_ArrayListMenu;

import java.util.Objects;

public class Amigo {
    public Amigo(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Amigo{" +
                "Id = '" + id + '\'' +
                ", Nombre = " + nombre +
                '}';
    }

    private String nombre;
    private int id;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Amigo amigo = (Amigo) o;
        return id == amigo.id
                && Objects.equals(id, amigo.id)
                && Objects.equals(nombre, amigo.nombre);

    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre);
    }
}
