// Importar clases

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.*;

import paneles.LoginPanel;
import paneles.bannerPanel;

public class Main {

    public static void main(String[] args) {
        
// Crear una ventana con JFrame

        JFrame miVentana = new JFrame();
        miVentana.setTitle("Hospital SCL");
        miVentana.setSize(1000,800);
        miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miVentana.setLayout(new BorderLayout());
        miVentana.setLocationRelativeTo(null);

// PanelBanner

bannerPanel BannerPanel = new bannerPanel();
        miVentana.add(BannerPanel.getBanner(), BorderLayout.WEST);

// Panel Login

        LoginPanel panelLogin = new LoginPanel();
        miVentana.add(panelLogin.getJPanel(), BorderLayout.CENTER);

        miVentana.setVisible(true);
    }

}