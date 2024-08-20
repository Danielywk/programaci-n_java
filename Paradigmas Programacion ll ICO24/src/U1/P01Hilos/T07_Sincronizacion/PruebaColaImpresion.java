package U1.P02Hilos.T07_Sincronizacion;

public class PruebaColaImpresion {
    public static void main(String[] args) {
        Archivo.escribeEntrada("7");
        ColaImpresion colaImpresionx = new ColaImpresion();
        Thread procesoA = new Thread(colaImpresionx);
        procesoA.setName("A");
        Thread procesoB = new Thread(colaImpresionx);
        procesoB.setName("B");
        //Se arrancan ambos hilos
        procesoA.start();
        procesoB.start();
        //Hacer que el programa principal puedan continuar hasta
        //que se hayan ejecutado sus hilos hijo.
        do {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Hilo principal interrumpido");
            }
        } while (procesoA.isAlive() || procesoB.isAlive());
        System.out.println("-------");
        for (int i = 0; i < 10; i++) {
            System.out.println(i + ": " + VariablesCompartidas.spooler[i]);
        }
    }
}
