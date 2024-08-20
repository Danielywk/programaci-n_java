package U1.P02Hilos.T07_Sincronizacion;

import java.io.*;

public class Archivo {
    private FileReader fr;
    private FileReader fr1;

    public static int leeEntrada() {
        File archivo = null;
        FileReader fr1 = null;
        BufferedReader br = null;
        String linea = "";
        try {
            archivo = new File("variables.txt");
            fr1 = new FileReader(archivo);
            br = new BufferedReader(fr1);
            //lectura de entrada
            linea = br.readLine();
            fr1.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Integer.parseInt(linea);
    }

    public static void escribeEntrada(String numero) {
        FileWriter fw = null;
        PrintWriter pw = null;
        try {
            fw = new FileWriter("variables.txt", false);
            pw = new PrintWriter(fw);
            pw.print("" + numero); //Aqui se escribe en el archivo
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
