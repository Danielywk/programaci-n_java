package U1.P02Hilos.T07_Sincronizacion;

public class ColaImpresion extends Thread {
    int siguiente_ranura_libre;
    String nombreArchivo;

    public void run() {

        colocarArchivos();
    }

    // synchronized: Bloquea la entrada de 2 hilos al mismo tiempo
    public synchronized void colocarArchivos() {// cogigo de la region critica

        VariablesCompartidas.entrada = Archivo.leeEntrada();
        siguiente_ranura_libre = VariablesCompartidas.entrada;
        System.out.println("Ranura libre: " + siguiente_ranura_libre);
        nombreArchivo = Thread.currentThread().getName() + siguiente_ranura_libre + ".txt";
        VariablesCompartidas.spooler[siguiente_ranura_libre] = nombreArchivo;
        System.out.println(nombreArchivo);
        VariablesCompartidas.entrada = siguiente_ranura_libre + 1;
        Archivo.escribeEntrada("" + VariablesCompartidas.entrada);
        System.out.println("Siguiente ranura libre: " + VariablesCompartidas.entrada);
        System.out.println("-------------------------");
    }
}
