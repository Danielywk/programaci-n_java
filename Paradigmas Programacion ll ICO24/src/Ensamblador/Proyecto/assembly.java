/*
package Ensamblador.Proyecto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.Reader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;



public class assembly {
    public static void main(String[] args) {
        String ruta = "/Users/isa/NetBeansProjects/AnalizadorLexico/src/codigo/Lexer.flex";
        generarLexer(ruta);
        Analizador();
        lectura();
    }
    public static void generarLexer(String ruta){
        File archivo = new File(ruta);
        JFlex.Main.generate(archivo);
    }
    public static void lectura() {
        String nombreFichero = "/Users/isa/DOS/8086/HOLAM.asm";

        File myFile = new File(nombreFichero);
        long size = myFile.length();
        int contadorlineas = 0;

        BufferedReader br = null;

        Pattern pat = Pattern.compile(".*.asm.*");
        Matcher mat = pat.matcher(nombreFichero);

        if (mat.matches()) {
            System.out.println("Archivo valido");
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
            System.out.println("ARCHIVO NO VALIDO ~ ASM FILE OOESN´T EXIST");
        }
    }
    public static void Analizador(){
        try {
            Reader lector = new BufferedReader(new FileReader("/Users/isa/DOS/8086/HOLAM.asm"));
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
                    case Identificador: case Numero: case Reservadas:
                        resultado += lexer.lexeme + ": Es un " + tokens + "\n";
                        break;
                    default:
                        resultado += "Token: " + tokens + "\n";
                        break;
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
 */