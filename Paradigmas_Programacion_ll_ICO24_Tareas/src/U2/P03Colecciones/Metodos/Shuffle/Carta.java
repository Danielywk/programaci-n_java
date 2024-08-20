package U2.P03Colecciones.Metodos.Shuffle;

public class Carta {
    public static enum Cara {
        Az, Dos, Tres, Cuatro, Cinco, Seis, Siete, Ocho, Nueve, Diez, Joker, Reina, Rey
    }

    ;

    public static enum Palo {
        Treboles, Diamantes, Corazones, Espadas
    }

    private final Cara cara;
    private final Palo palo;

    public Carta(Cara cara, Palo palo) {
        this.cara = cara;
        this.palo = palo;
    }

    public Cara getCara() {
        return cara;
    }

    public Palo getPalo() {
        return palo;
    }

    @Override
    public String toString() {
        return String.format("%s De %s", cara, palo);
    }
}