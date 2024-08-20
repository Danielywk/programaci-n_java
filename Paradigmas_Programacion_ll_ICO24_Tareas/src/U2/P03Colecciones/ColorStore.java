package U2.P03Colecciones;

import java.awt.*;
import java.util.HashMap;

public class ColorStore {
    private static HashMap<String, Color> colorHashMap = new HashMap<>();

    public ColorStore() {
        colorHashMap.put("MAGENTA", Color.MAGENTA);
        colorHashMap.put("AMARILLO", Color.YELLOW);
        colorHashMap.put("CYAN", Color.CYAN);
        colorHashMap.put("DARK_GRAY", Color.DARK_GRAY);
        colorHashMap.put("NARANJA", Color.ORANGE);
        colorHashMap.put("GRIS", Color.GRAY);
        colorHashMap.put("BLANCO", Color.WHITE);
        colorHashMap.put("AZUL", Color.BLUE);
        colorHashMap.put("VERDE", Color.GREEN);
        colorHashMap.put("ROJO", Color.RED);
        colorHashMap.put("ROSADO", Color.PINK);
        colorHashMap.put("LIGHT_GRAY", Color.LIGHT_GRAY);
        colorHashMap.put("NEGRO", Color.BLACK);

    }

    private String getName(Color color) {
        return color.getClass().getName();
    }

    public HashMap<String, Color> getAllColors() {
        return colorHashMap;
    }
}