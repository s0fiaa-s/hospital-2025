// Importar clases

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {

    public static void main(String[] args) {
        
// Crear una ventana con JFrame

        JFrame miVentana = new JFrame();
        miVentana.setTitle("Hospital SCL");
        miVentana.setSize(1000,800);

// Crear un texto con JLabel

        JLabel texto = new JLabel();
        texto.setText("Hola Mundo");
        miVentana.add(texto);

        miVentana.setVisible(true);


    }

}