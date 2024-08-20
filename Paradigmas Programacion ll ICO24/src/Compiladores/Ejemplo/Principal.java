package Compiladores.Ejemplo;

import Compiladores.Ejemplo.Lexer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Principal {
    public static void main(String[] args) {
        String ruta = "/Users/isa/IdeaProjects/Paradigmas Programacion ll ICO24/src/Compiladores/Ejemplo/Lexer.flex";
        generarLexer(ruta);
        System.out.println("---------------------------------------------------------------");
        lectura();
        System.out.println("---------------------------------------------------------------");
        Analizador();
    }

    public static void generarLexer(String ruta) {
        File archivo = new File(ruta);
        //JFlex.Main.generate(archivo);
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
            System.out.println("Valor: " + br);
            System.out.println("Mensaje de error: " + br);
            System.out.println("Registro: " + br);
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

    public static void Analizador() {
        try {
            Reader lector = new BufferedReader(new FileReader("/Users/isa/IdeaProjects/Paradigmas Programacion ll ICO24/src/Compiladores/Ejemplo/Prueba.java"));
            Lexer lexer = new Lexer(lector);
            String resultado = "";
            while (true) {
                Tokens tokens = lexer.yylex();
                if (tokens == null) {
                    resultado += "FIN";
                    System.out.println(resultado);
                    return;
                }
                switch (tokens) {
                    case ERROR:
                        resultado += "Simbolo no definido\n";
                        break;
                    case Identificador:
                    case Numero:
                    case Reservadas:
                        resultado += lexer.lexeme + ": Es una " + tokens + "\n";
                        break;
                    default:
                        resultado += "Token: " + tokens + "\n";
                        break;
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error: Fichero no encontrado");
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Error: Fichero no encontrado");
            System.out.println(ex.getMessage());
        }

    }
}
