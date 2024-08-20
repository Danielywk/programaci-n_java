package Compiladores.Conversor;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Principal {
    private String texto = "\n";
    private String txt = "";

    public static void main(String[] args) {
        new Principal();
    }

    public Principal() {
        lectura();
        System.out.println("---------------------------------------------------");
        Mtom();
        System.out.println("___________________________________________________");
        //guardarArchivo();
    }

    public static void lectura() {
        String nombreFichero = "/Users/isa/IdeaProjects/Paradigmas Programacion ll ICO24/src/Compiladores/Ejemplo/Prueba.java";

        File myFile = new File(nombreFichero);
        long size = myFile.length();
        int contadorlineas = 0;

        BufferedReader br = null;

        Pattern pat = Pattern.compile(".*.java.*");
        Matcher mat = pat.matcher(nombreFichero);

        if (mat.matches()) {
            System.out.println("Archivo valido");
            System.out.println("Tipo de archivo: " + pat);
            try {
                br = new BufferedReader(new FileReader(nombreFichero));
                String texto = br.readLine();
                while (texto != null) {
                    contadorlineas++;
                    texto = br.readLine();
                }
                System.out.println("Nombre: " + nombreFichero);
                System.out.println("Numero de lineas: " + contadorlineas);
                System.out.println("Tamaño del archivo = " + size + " bytes");
            } catch (FileNotFoundException e) {
                System.out.println("Error: Fichero no encontrado");
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("Error al leer el fichero");
                System.out.println(e.getMessage());
            } finally {
                try {
                    if (br != null)
                        br.close();
                } catch (Exception e) {
                    System.out.println("Error: No se ha conseguido ejecutar el programa");
                    System.out.println(e.getMessage());
                }
            }
        } else {
            System.out.println("ARCHIVO NO VALIDO ~ JAVA FILE OOESN´T EXIST");
        }
    }

    private void Mtom() {
        File nombre = new File("/Users/isa/IdeaProjects/Paradigmas Programacion ll ICO24/src/Compiladores/Ejemplo/Prueba.java");

        try {
            BufferedReader entrada = new BufferedReader(new FileReader(nombre));
            StringBuffer bufer = new StringBuffer();
            while ((texto = entrada.readLine()) != null)
                bufer.append(texto + "\n");
            texto = bufer.toString();
            System.out.println("Minúscula");
            System.out.println(texto);
            System.out.println("---------------------------------------------------");
            texto = texto.toUpperCase();
            System.out.println("Mayúscula");
            System.out.println(texto);
            texto = texto.toLowerCase();
        } catch (IOException e) {
            System.out.println(e);
            System.out.println("Archivo no encontrado!");
        }
    }
}