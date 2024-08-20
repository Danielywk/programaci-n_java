package Compiladores.Ejemplo;
import java.util.Scanner;

public class Prueba{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
//hola de nuevo isa
        System.out.print("Escribe algo: ");
        String txt = sc.nextLine();
        System.out.print("\n"+txt+"\n\n");
        for(int i=0; i < txt.length(); i++){
            if(i % 2 == 0){
                String txt2 = Character.toString(txt.charAt(i));
                System.out.print(txt2.toUpperCase());
            }
            else{
                System.out.print(txt.charAt(i));
            }
        }
        System.out.println("\n");
    }
}