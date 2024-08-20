package Compiladores.Ejercicios;

import java.lang.Math;
import java.util.Scanner;

public class Converter_IPs {
    private static final Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do {
            menu();
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Elegiste opción 1: Convertir IP de decimal a binario");
                    Decimal_Binario();
                    break;
                case 2:
                    System.out.println("Elegiste opción 2: Convertir dirección IP de binario a decimal");
                    Binario_Decimal();
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no valida...");
            }
        } while (opcion != 3);
    }

    public static void menu() {
        System.out.println("1.- Convertir dirección IP de decimal a binario");
        System.out.println("2.- Convertir dirección IP de binario a decimal");
        System.out.println("3.- Salir");
        System.out.print("Elige tu opción: ");
    }

    public static void Decimal_Binario() {
        int v1, v2, v3, v4;
        int p1, p2, p3, p4;
        int exp, digito;
        double binario, binario2, binario3, binario4;

        do {
            System.out.print("Ingrese el primer octeto: ");
            v1 = entrada.nextInt();
            p1 = v1;
        } while (v1 < 0);
        exp = 0;
        binario = 0;
        while (v1 != 0) {
            digito = v1 % 2;
            binario = binario + digito * Math.pow(10, exp);
            exp++;
            v1 = v1 / 2;
        }
        do {
            System.out.print("Ingrese el segundo octeto: ");
            v2 = entrada.nextInt();
            p2 = v2;
        }
        while (v2 < 0);
        binario2 = 0;
        while (v2 != 0) {
            digito = v2 % 2;
            binario2 = binario2 + digito * Math.pow(10, exp);
            exp++;
            v2 = v2 / 2;
        }
        do {
            System.out.print("Ingrese el tercero octeto: ");
            v3 = entrada.nextInt();
            p3 = v3;
        }
        while (v3 < 0);
        binario3 = 0;
        while (v3 != 0) {
            digito = v3 % 2;
            binario3 = binario3 + digito * Math.pow(10, exp);
            exp++;
            v3 = v3 / 2;
        }
        do {
            System.out.print("Ingrese el cuarto octeto: ");
            v4 = entrada.nextInt();
            p4 = v4;
        }
        while (v4 < 0);
        binario4 = 0;
        while (v4 != 0) {
            digito = v4 % 2;
            binario4 = binario4 + digito * Math.pow(10, exp);
            exp++;
            v4 = v4 / 2;
        }

        if (p1 <= 127) {
            System.out.println("La dirección IP es clase A");
        } else if (p1 <= 191) {
            System.out.println("La dirección IP es clase B");
        } else if (p1 <= 223) {
            System.out.println("La dirección IP es clase C");
        } else if (p1 <= 255) {
            System.out.println("La dirección IP es clase D");
        }

        System.out.printf("La dirección IP introducida es: %d.%d.%d.%d %n", p1, p2, p3, p4);
        System.out.printf("El equivalente a binario es: %.0f.%.0f.%.0f.%.0f %n", binario, binario2, binario3, binario4);
    }

    public static void Binario_Decimal() {
        //int v1, v2, v3, v4, v5, v6, v7, v8;
        int v1, v2, v3, v4, v5, v6, v7, v8;
        int p1, p2, p3, p4, p5, p6, p7, p8;
        System.out.println("Ingreso del primer octeto");
        System.out.print("Ingrese primer dígito: ");
        v1 = entrada.nextInt();
        entrada.nextLine();
        System.out.print("Ingrese segundo dígito: ");
        v2 = entrada.nextInt();
        entrada.nextLine();
        System.out.print("Ingrese tercero dígito: ");
        v3 = entrada.nextInt();
        entrada.nextLine();
        System.out.print("Ingrese cuarto dígito: ");
        v4 = entrada.nextInt();
        entrada.nextLine();
        System.out.print("Ingrese quinto dígito: ");
        v5 = entrada.nextInt();
        entrada.nextLine();
        System.out.print("Ingrese sexto dígito: ");
        v6 = entrada.nextInt();
        entrada.nextLine();
        System.out.print("Ingrese septimo dígito: ");
        v7 = entrada.nextInt();
        entrada.nextLine();
        System.out.print("Ingrese octavo dígito: ");
        v8 = entrada.nextInt();
        entrada.nextLine();
        p1 = v8 * calculatePower(2, 0);
        p2 = v7 * calculatePower(2, 1);
        p3 = v6 * calculatePower(2, 2);
        p4 = v5 * calculatePower(2, 3);
        p5 = v4 * calculatePower(2, 4);
        p6 = v3 * calculatePower(2, 5);
        p7 = v2 * calculatePower(2, 6);
        p8 = v1 * calculatePower(2, 7);

        int v9, v10, v11, v12, v13, v14, v15, v16;
        int p9, p10, p11, p12, p13, p14, p15, p16;
        System.out.println("Ingreso del segundo octeto");
        System.out.print("Ingrese primer dígito: ");
        v9 = entrada.nextInt();
        entrada.nextLine();
        System.out.print("Ingrese segundo dígito: ");
        v10 = entrada.nextInt();
        entrada.nextLine();
        System.out.print("Ingrese tercero dígito: ");
        v11 = entrada.nextInt();
        entrada.nextLine();
        System.out.print("Ingrese cuarto dígito: ");
        v12 = entrada.nextInt();
        entrada.nextLine();
        System.out.print("Ingrese quinto dígito: ");
        v13 = entrada.nextInt();
        entrada.nextLine();
        System.out.print("Ingrese sexto dígito: ");
        v14 = entrada.nextInt();
        entrada.nextLine();
        System.out.print("Ingrese septimo dígito: ");
        v15 = entrada.nextInt();
        entrada.nextLine();
        System.out.print("Ingrese octavo dígito: ");
        v16 = entrada.nextInt();
        entrada.nextLine();
        p9 = v16 * calculatePower(2, 0);
        p10 = v15 * calculatePower(2, 1);
        p11 = v14 * calculatePower(2, 2);
        p12 = v13 * calculatePower(2, 3);
        p13 = v12 * calculatePower(2, 4);
        p14 = v11 * calculatePower(2, 5);
        p15 = v10 * calculatePower(2, 6);
        p16 = v9 * calculatePower(2, 7);

        int v17, v18, v19, v20, v21, v22, v23, v24;
        int p17, p18, p19, p20, p21, p22, p23, p24;
        System.out.println("Ingreso del tercer octeto");
        System.out.print("Ingrese primer dígito: ");
        v17 = entrada.nextInt();
        entrada.nextLine();
        System.out.print("Ingrese segundo dígito: ");
        v18 = entrada.nextInt();
        entrada.nextLine();
        System.out.print("Ingrese tercero dígito: ");
        v19 = entrada.nextInt();
        entrada.nextLine();
        System.out.print("Ingrese cuarto dígito: ");
        v20 = entrada.nextInt();
        entrada.nextLine();
        System.out.print("Ingrese quinto dígito: ");
        v21 = entrada.nextInt();
        entrada.nextLine();
        System.out.print("Ingrese sexto dígito: ");
        v22 = entrada.nextInt();
        entrada.nextLine();
        System.out.print("Ingrese septimo dígito: ");
        v23 = entrada.nextInt();
        entrada.nextLine();
        System.out.print("Ingrese octavo dígito: ");
        v24 = entrada.nextInt();
        entrada.nextLine();
        p17 = v24 * calculatePower(2, 0);
        p18 = v23 * calculatePower(2, 1);
        p19 = v22 * calculatePower(2, 2);
        p20 = v21 * calculatePower(2, 3);
        p21 = v20 * calculatePower(2, 4);
        p22 = v19 * calculatePower(2, 5);
        p23 = v18 * calculatePower(2, 6);
        p24 = v17 * calculatePower(2, 7);

        int v25, v26, v27, v28, v29, v30, v31, v32;
        int p25, p26, p27, p28, p29, p30, p31, p32;
        System.out.println("Ingreso del cuarto octeto");
        System.out.print("Ingrese primer dígito: ");
        v25 = entrada.nextInt();
        entrada.nextLine();
        System.out.print("Ingrese segundo dígito: ");
        v26 = entrada.nextInt();
        entrada.nextLine();
        System.out.print("Ingrese tercero dígito: ");
        v27 = entrada.nextInt();
        entrada.nextLine();
        System.out.print("Ingrese cuarto dígito: ");
        v28 = entrada.nextInt();
        entrada.nextLine();
        System.out.print("Ingrese quinto dígito: ");
        v29 = entrada.nextInt();
        entrada.nextLine();
        System.out.print("Ingrese sexto dígito: ");
        v30 = entrada.nextInt();
        entrada.nextLine();
        System.out.print("Ingrese septimo dígito: ");
        v31 = entrada.nextInt();
        entrada.nextLine();
        System.out.print("Ingrese octavo dígito: ");
        v32 = entrada.nextInt();
        entrada.nextLine();
        p25 = v32 * calculatePower(2, 0);
        p26 = v31 * calculatePower(2, 1);
        p27 = v30 * calculatePower(2, 2);
        p28 = v29 * calculatePower(2, 3);
        p29 = v28 * calculatePower(2, 4);
        p30 = v27 * calculatePower(2, 5);
        p31 = v26 * calculatePower(2, 6);
        p32 = v25 * calculatePower(2, 7);
        int r1, r2, r3, r4;
        r1 = p1 + p2 + p3 + p4 + p5 + p6 + p7 + p8;
        r2 = p9 + p10 + p11 + p12 + p13 + p14 + p15 + p16;
        r3 = p17 + p18 + p19 + p20 + p21 + p22 + p23 + p24;
        r4 = p25 + p26 + p27 + p28 + p29 + p30 + p31 + p32;

        System.out.printf("L adirección IP introducida en binario es: %d%d%d%d %d%d%d%d.%d%d%d%d %d%d%d%d.%d%d%d%d %d%d%d%d.%d%d%d%d %d%d%d%d %n", v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16, v17, v18, v19, v20, v21, v22, v23, v24, v25, v26, v27, v28, v29, v30, v31, v32);
        System.out.println("Octeto en decimal equivale a: " + (r1)
                + "." + (r2)
                + "." + (r3)
                + "." + (r4));
        if (r1 <= 127) {
            System.out.println("La dirección IP es clase A");
        } else if (r1 <= 191) {
            System.out.println("La dirección IP es clase B");
        } else if (r1 <= 223) {
            System.out.println("La dirección IP es clase C");
        } else if (r1 <= 255) {
            System.out.println("La dirección IP es clase D");
        }
    }

    static int calculatePower(int num, int power) {
        int answer = 1;
        if (num > 0 && power == 0) {
            return answer;
        } else if (num == 0 && power >= 1) {
            return 0;
        } else {
            for (int i = 1; i <= power; i++) {
                answer = answer * num;
            }
            return answer;
        }
    }
}