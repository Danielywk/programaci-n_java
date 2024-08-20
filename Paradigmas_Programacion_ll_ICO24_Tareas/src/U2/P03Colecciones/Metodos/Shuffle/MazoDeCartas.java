package U2.P03Colecciones.Metodos.Shuffle;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MazoDeCartas {
    private List<Carta> listaCartas; // Declara objeto List, guarda objetos Carta

    // Establece mazo de objetos carta
    public MazoDeCartas() {
        Carta[] mazo = new Carta[52];
        int cuenta = 0; // número de cartas
        // llena el mazo con objetos Carta
        for (Carta.Palo palo : Carta.Palo.values()) {
            for (Carta.Cara cara : Carta.Cara.values()) {
                mazo[cuenta] = new Carta(cara, palo);
                ++cuenta;
            }
        }
        listaCartas = Arrays.asList(mazo);
        Collections.shuffle(listaCartas); // baraja el mazo
    }

    // Imprime el mazo
    public void imprimirCartas() {
        // Muestra las 52 cartas en 4 columnas
        for (int i = 0; i < listaCartas.size(); i++) {
            System.out.printf("%-23s%s", listaCartas.get(i), ((i + 1) % 4 == 0) ? "\n" : "");
        }
    }

    public List<Carta> getListaCartas() {
        return listaCartas;
    }

    public static void main(String[] args) {
        MazoDeCartas cartas = new MazoDeCartas();
        cartas.imprimirCartas();
    }
}