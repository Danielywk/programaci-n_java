package U1.P02Hilos.T02_CopiaDeSeguridadEnArchivo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public class FrmCajaTexto extends JFrame implements Runnable {
    private JTextField txtCaja1;

    public FrmCajaTexto() {
        super("Caja de Texto");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 100);
        setLocationRelativeTo(null);
        txtCaja1 = new JTextField(20);
        add(txtCaja1);
        txtCaja1.addActionListener(new CajaTextoListener());
        int entrada = Archivo.leeEntrada();
        Thread cargarDatos = new Thread(this);
        cargarDatos.start();

    }

    public class CajaTextoListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String cadena = "";
            if (e.getSource() == txtCaja1) {
                cadena = String.format("Caja de Texto: %s", e.getActionCommand());
            }
            JOptionPane.showMessageDialog(null, cadena);
        }
    }

    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //El hilo despierta
        txtCaja1.setText("");
        Archivo.escribeEntrada("");
    }

    public static void main(String[] args) {
        FrmCajaTexto window = new FrmCajaTexto();
        window.setVisible(true);
    }
}