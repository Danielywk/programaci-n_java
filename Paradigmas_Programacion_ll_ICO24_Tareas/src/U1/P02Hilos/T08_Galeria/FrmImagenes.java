package U1.P02Hilos.T08_Galeria;

import javax.swing.*;
import java.awt.*;

public class FrmImagenes extends JFrame implements Runnable {
    //SE DECLARAN LAS VARIABLES QUE OCUPARÁ EL USUARIO
    Thread hilo1;

    //SE DECLARA EL CONSTRUCTOR DEL FORMULARIO
    public FrmImagenes() {
        initComponents();
        hilo1 = new Thread(this);
        hilo1.start();
    }

    //SE DECLARAN LOS MÉTODOS QUE OCOUPARÁ USUARIO POR PARTE DEL FORMULARIO


    @Override
    public void run() {
        int contadorAdelante = 1;
        int contadorAtras = 6;
        int contadorAleatorio = (int) (Math.random() * 10 + 1);
        ImageIcon picture1, picture2, picture3;
        while (true) {
            //El hilo se duerme durante 2 segundos
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //Hacer el cambio de imagen
            try {
                String nombreImagen1 = "p" + contadorAdelante + ".jpg";
                String nombreImagen2 = "p" + contadorAtras + ".jpg";
                String nombreImagen3 = "p" + contadorAleatorio + ".jpg";
                picture1 = new ImageIcon(getClass().getResource(nombreImagen1));
                picture2 = new ImageIcon(getClass().getResource(nombreImagen2));
                picture3 = new ImageIcon(getClass().getResource(nombreImagen3));
                imagen1.setIcon(picture1);
                imagen2.setIcon(picture2);
                imagen3.setIcon(picture3);

            } catch (Exception e) {
                e.printStackTrace();
            }
            //Incrementar y decrementar los contadores
            contadorAdelante++;
            if (contadorAdelante > 10) {
                contadorAdelante = 1;
            }
            contadorAtras--;
            if (contadorAtras < 1) {
                contadorAtras = 10;
            }
            contadorAleatorio++;
            if (contadorAleatorio > 1) {
                contadorAleatorio = (int) (Math.random() * 10 + 1);
            }
            System.out.println(contadorAdelante + " " + contadorAtras + " " + contadorAleatorio);
        }
    }

    // SE DECLARA UN METODO PARA INICIALIZAR LOS COMPONENTES DEL FORMULARIO
    private void initComponents() {
        imagen1 = new JLabel();
        imagen2 = new JLabel();
        imagen3 = new JLabel();
        lblTitulo = new JLabel();
        //Características ventana
        getContentPane().setBackground(Color.BLACK);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(900, 400);
        setLocationRelativeTo(null);
        //ESTABLECER UN LAYOUT DE 2 RENGLONES Y UNA COLUMNA
        setLayout(new GridLayout(2, 1, 10, 10));
        //CARACTERÍSTICAS DEL TÍTULO
        lblTitulo.setFont(new Font("Dialog", 0, 48));
        lblTitulo.setText("ESCENA POST-PUNK");
        lblTitulo.setForeground(Color.WHITE);
        lblTitulo.setPreferredSize(new Dimension(300, 50));
        lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        add(lblTitulo);
        // Panel donde se colocan las imagenes
        panelImagenes = new JPanel();
        panelImagenes.setBackground(Color.BLACK);
        panelImagenes.setLayout(new GridLayout(1, 2, 10, 10));
        add(panelImagenes);
        //SE ESTABLECEN LOS TAMAÑOS DE LAS ETIQUETAS Y SE AGREGAN AL PANEL
        imagen1.setSize(300, 200);
        imagen2.setSize(300, 200);
        imagen3.setSize(300, 200);
        panelImagenes.add(imagen1);
        panelImagenes.add(imagen2);
        panelImagenes.add(imagen3);
    }

    //SE DECLARA EL MÉTODO MAIN PARA EJECUTAR EL FORMULARIO
    public static void main(String[] args) {
        new FrmImagenes().setVisible(true);
    }

    //SE DECLARAM LOS CONTROLES QUE LLEVARÁ EL USUSARIO

    private JLabel lblTitulo;
    private JLabel imagen1;
    private JLabel imagen2;
    private JLabel imagen3;
    JPanel panelImagenes;

}
