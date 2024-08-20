package Compiladores.Ejercicios;

import java.io.*;

public class Optimizador_Recursos {
    static long tiempoInicio;
    static long tiempoFinal;

    public static void main(String[] args) throws InterruptedException {
        try {

            //String ruta = "Users/isa/Downloads/salida.txt";

            tiempoInicio = System.nanoTime();
            Operacion();
            Memory();
            // TIEMPO DE EJECUCIÓN
        /*long inicio = System.currentTimeMillis();
        Thread.sleep(2000);
        long fin = System.currentTimeMillis();
        double tiempo = (double) ((fin - inicio) / 1000);
        System.out.printf("\nTiempo de ejecución del programa: %.2f %n", tiempo);
         */

            // TIEMPO DE EJECUCIÓN
            tiempoFinal = System.nanoTime();
            System.out.println("\nTIEMPO DE COMPILACIÓN");
            System.out.println("Ejecución: " + ((tiempoFinal - tiempoInicio) / 1000000000.0) + " segundos.");
            System.out.println("--------------------------------------------------------------------------");
            System.out.println("\nERRORES DE COMPILACIÓN");
            System.out.println("Ninguno");
            System.out.println("--------------------------------------------------------------------------");

        } catch (Exception e) {
            System.out.println("Error en la compilación" + e.getMessage());
            e.printStackTrace();
            System.exit(1);
        }
    }

    public static void Memory() {
        System.out.println("\nUSO DE MEMORIA");
        // USO DE MEMORIA
        System.out.println("Valores de memoria actuales en la JVM");
        // la cantidad de memoria en uso
        System.out.println("Usada: " + (Runtime.getRuntime().totalMemory() + -Runtime.getRuntime().freeMemory()) / (1024 * 1024) + " Megabytes");
        // la cantidad de memoria libre
        System.out.println("Libre: " + (Runtime.getRuntime().freeMemory() / (1024 * 1024)) + " Megabytes");
        // la cantidad de memoria total
        System.out.println("Libre: " + (Runtime.getRuntime().totalMemory() / (1024 * 1024)) + " Megabytes");
        // la cantidad máxima que podría llegar a usar la JVM
        System.out.println("Máxima: " + (Runtime.getRuntime().maxMemory() / (1024 * 1024)) + " Megabytes");
        System.out.println("--------------------------------------------------------------------------");
    }

    public static void Operacion() {
        // OPERACIÓN MATEMÁTICA
        System.out.println("\nOPERACIÓN MATEMÁTICA");
        int a, b;
        double c, d, op1, op2;
        a = (int) (Math.random() * 99 + 1);
        b = (int) (Math.random() * 99 + 1);
        c = (double) (Math.random() * 99 + 1);
        d = (double) (Math.random() * 99 + 1);

        op1 = a * b;
        op2 = c / d;
        System.out.printf("Valor 1: %d \nValor 2: %d \nValor 3: %.2f \nValor 4: %.2f %n", a, b, c, d);
        System.out.printf("Resultado 1: %.2f %n", op1);
        System.out.printf("Resultado 2: %.2f %n", op2);
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("\nDIRECCIONES DE MEMORIA");
        System.out.println("Dirección de menoria del primer resultado: " + System.identityHashCode(op1));
        System.out.println("Dirección de menoria del segundo resultado: " + System.identityHashCode(op2));
        System.out.println("--------------------------------------------------------------------------");
    }
}
