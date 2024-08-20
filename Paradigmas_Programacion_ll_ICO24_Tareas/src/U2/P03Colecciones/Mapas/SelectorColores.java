package U2.P03Colecciones.Mapas;

import U2.P03Colecciones.ColorStore;

import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;
import java.util.Vector;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;

public class SelectorColores {

    private JFrame mainFrame;
    private JLabel headerLabel;
    private JPanel controlPanel;
    private JPanel dibujoPanel;

    public SelectorColores() {
        prepareGUI();
    }

    public static void main(String[] args) {
        SelectorColores colorDemo = new SelectorColores();
        colorDemo.showListDemo();
    }

    private void prepareGUI() {
        mainFrame = new JFrame("Seleccione un color para cambiar el fondo");
        mainFrame.setSize(250, 400);
        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
        headerLabel = new JLabel("", JLabel.CENTER);
        controlPanel = new JPanel();
        dibujoPanel = new JPanel();

        dibujoPanel.setPreferredSize(new Dimension(200, 200));
        controlPanel.setLayout(new FlowLayout());
        mainFrame.add(headerLabel);
        mainFrame.add(controlPanel);
        controlPanel.add(dibujoPanel);
        mainFrame.setVisible(true);
    }

    private void showListDemo() {
        headerLabel.setText("Seleccione un color para cambiar bg");
        final HashMap<String, Color> colorMap = new ColorStore().getAllColors();
        final JList jlist = new JList(new Vector(colorMap.keySet()));
        jlist.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jlist.setSelectedIndex(0);
        jlist.setVisibleRowCount(5);
        JScrollPane listScrollPane = new JScrollPane(jlist);
        jlist.addListSelectionListener((ListSelectionEvent listSelectionEvent) -> {
            String seleccionado = (String) jlist.getSelectedValue();
            controlPanel.setBackground(Color.cyan);
            dibujoPanel.setBackground(colorMap.get(seleccionado));

        });
        controlPanel.add(listScrollPane);
        mainFrame.setVisible(true);
        mainFrame.setLocationRelativeTo(null);
    }
}