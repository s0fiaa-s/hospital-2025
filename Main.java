// Importar clases

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.*;

import vistas.LoginPanel;

public class Main {

    public static void main(String[] args) {
        
// Crear una ventana con JFrame

        JFrame miVentana = new JFrame();
        miVentana.setTitle("Hospital SCL");
        miVentana.setSize(1000,800);
        miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miVentana.setLayout(new BorderLayout());

// PanelBanner

        JPanel panelBanner = new JPanel();
        panelBanner.setPreferredSize(new Dimension(500,800));
        panelBanner.setSize(500,800);
        panelBanner.setOpaque(true);
        panelBanner.setBackground(Color.RED);
        miVentana.add(panelBanner,BorderLayout.WEST);

// Panel Login

        LoginPanel panelLogin = new LoginPanel();
        miVentana.add(panelLogin.getJPanel(), BorderLayout.CENTER);

        miVentana.setVisible(true);
    }

}