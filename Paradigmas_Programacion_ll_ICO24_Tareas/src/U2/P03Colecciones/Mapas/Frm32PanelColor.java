package U2.P03Colecciones.Mapas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.HashMap;
import java.util.Vector;

import U2.P03Colecciones.ColorStore;

public class Frm32PanelColor extends JFrame {
    final HashMap<String, Color> colorMap = new ColorStore().getAllColors();
    private final JComboBox<String> imagenesJComboBox;

    public Frm32PanelColor() {
        PanelColor paintPanel = new PanelColor();
        add(paintPanel, BorderLayout.CENTER);
        // create a label and place it in SOUTH of BorderLayout
        add(new JLabel("Drag the mouse to draw"),
                BorderLayout.SOUTH);
        imagenesJComboBox = new JComboBox<String>(new Vector<>(colorMap.keySet()));
        imagenesJComboBox.setMaximumRowCount(3);
        imagenesJComboBox.addItemListener(
                new ItemListener() {//Clase interna anónima
                    @Override
                    public void itemStateChanged(ItemEvent evento) {
                        if (evento.getStateChange() == ItemEvent.SELECTED) {
                            // etiqueta.setIcon(iconos[imagenesJComboBox.getSelectedIndex()]);
                            String seleccionado = (String) imagenesJComboBox.getSelectedItem();
                        }
                    }
                }
        );
        add(imagenesJComboBox, BorderLayout.WEST);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setVisible(true);
    }
}