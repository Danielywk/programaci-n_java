package U1.P02Hilos.T02_CopiaDeSeguridadEnArchivo;

import java.io.*;

public class Archivo {
    public static int leeEntrada() {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        String linea = "";
        try {
            archivo = new File("caja.txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            //lectura de entrada
            linea = br.readLine();
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Integer.parseInt(linea);
    }

    public static void escribeEntrada(String caja) {
        FileWriter fw = null;
        PrintWriter pw = null;
        try {
            fw = new FileWriter("variables.txt", false);
            pw = new PrintWriter(fw);
            pw.print(caja); //Aqui se escribe en el archivo
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}