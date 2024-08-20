package U2.P03Colecciones.Metodos.Shuffle;
import javax.swing.*;
import java.awt.*;
public class FrmCartas extends JFrame {
    // Se declaran las variables que ocupará el formulario

    // Se declara el constructor del formulario
    public FrmCartas() {
        initComponents();
        agregarImagenes();
    }
    // Se declaran los métodos que ocupará el formulario por parte del usuario
public void agregarImagenes(){
        ImageIcon picture1, picture2, picture3;
    // Hacer el cambio de imagen
    try {
        String carpeta = "cartas/";
        String nombreImagen1 = carpeta+"Dos de Corazones.png";
        String nombreImagen2 = carpeta+"Cuatro de Treboles.png";
        String nombreImagen3 = carpeta+"Tres de Diamantes.png";
        picture1 = new ImageIcon(getClass().getResource(nombreImagen1));
        picture2 = new ImageIcon(getClass().getResource(nombreImagen2));
        picture3 = new ImageIcon(getClass().getResource(nombreImagen3));
        Icon imgEscalada1 = new ImageIcon(picture1.getImage().getScaledInstance(imagen1.getWidth(), imagen1.getHeight(), Image.SCALE_SMOOTH));
        Icon imgEscalada2 = new ImageIcon(picture2.getImage().getScaledInstance(imagen2.getWidth(), imagen2.getHeight(), Image.SCALE_SMOOTH));
        Icon imgEscalada3 = new ImageIcon(picture3.getImage().getScaledInstance(imagen3.getWidth(), imagen3.getHeight(), Image.SCALE_SMOOTH));
        imagen1.setIcon(picture1);
        imagen2.setIcon(picture2);
        imagen3.setIcon(picture3);
    }catch (Exception e){
        e.printStackTrace();
    }
}

    // Se declara un método para inicializar los componentes del formulario
    private void initComponents() {
        imagen1 = new JLabel();
        imagen2 = new JLabel();
        imagen3 = new JLabel();
        lblTitulo = new JLabel();
        // Características de la ventana
        getContentPane().setBackground(Color.black);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(626, 635);
        setLocationRelativeTo(null);
        // Establecer un layout de 2 renglones y una columna
        setLayout(new GridLayout(2, 1, 10, 10));
        // Características del titulo
        lblTitulo.setFont(new Font("Dialog", 0, 48));
        lblTitulo.setText("JUEGO DE CARTAS");
        lblTitulo.setForeground(Color.WHITE);
        lblTitulo.setPreferredSize(new Dimension(300, 60));
        lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        add(lblTitulo);
        // Panel donde se colocaran las imágenes
        panelImagenes = new JPanel();
        panelImagenes.setBackground(Color.black);
        panelImagenes.setLayout(new GridLayout(1, 2, 10, 10));
        add(panelImagenes);
        // Se establecen los tamaños de las etiquetas y se agregan al panel
        imagen1.setSize(200, 300);
        imagen2.setSize(200, 300);
        imagen3.setSize(200, 300);
        panelImagenes.add(imagen1);
        panelImagenes.add(imagen2);
        panelImagenes.add(imagen3);
    }
    // Se declara el método main para ejecutar el formulario
    public static void main(String[] args) {
        new FrmCartas().setVisible(true);
    }
    // Se declaran los controles que llevará el formulario
    private JLabel lblTitulo;
    private JLabel imagen1;
    private JLabel imagen2;
    private JLabel imagen3;
    JPanel panelImagenes;
}