package U1.P02Hilos.T09_Seccion_Critica;

public class CAdquirirDatos extends Thread {
    private CBufer muestras;

    // objeto para almacenar los datos

    public CAdquirirDatos(CBufer muestrasx, String nombre) // constructor
    {

        setName(nombre);

        this.muestras = muestrasx;
    }

    public void run() {

        int i = 0;

        do {

            i = muestras.adquirirDato(getName());
            // adquirir datos
        } while (muestras.index < muestras.longitud);
    }
}