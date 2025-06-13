package ventanas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import paneles.MenuLateralPanel;

public class Dashboard extends JFrame {

    public Dashboard() {
        // Configuración original de la ventana
        this.setTitle("Doctor");
        this.setSize(1600, 800);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());

        // ----------------- HEADER -----------------
        JPanel header = new JPanel(new BorderLayout());
        header.setBackground(Color.GRAY); 
        header.setPreferredSize(new Dimension(getWidth(), 80));

        // ---- LADO IZQUIERDO (Emoji + "Hospital Chocho") ----
        JPanel leftPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 0));
        leftPanel.setBackground(Color.GRAY);

        // 1. Emoji de galleta (🍪) en lugar de imagen
        JLabel emojiCookie = new JLabel("zᶻ ૮˶- ﻌ -˶ა");
        emojiCookie.setFont(new java.awt.Font("Segoe UI Emoji", java.awt.Font.PLAIN, 30));
        emojiCookie.setForeground(Color.WHITE);

        // 2. Texto "Hospital Chocho"
        JLabel nombreHospital = new JLabel("Hospital Chocho");
        nombreHospital.setForeground(Color.WHITE);
        nombreHospital.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 20));

        leftPanel.add(emojiCookie);
        leftPanel.add(nombreHospital);

        // ---- LADO DERECHO ("Sofia Sandoval") ----
        JLabel nombreUsuario = new JLabel("Sofia Sandoval");
        nombreUsuario.setForeground(Color.WHITE);
        nombreUsuario.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 24));

        // Organización final
        header.add(leftPanel, BorderLayout.WEST);
        header.add(nombreUsuario, BorderLayout.EAST);
        header.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 20, 15, 20));

        this.add(header, BorderLayout.NORTH);
        // -----------------------------------------

        // Contenido original
        this.add(new MenuLateralPanel().getPanel(), BorderLayout.WEST);
        TablaPanel tablaPanel = new TablaPanel();
        add(tablaPanel, BorderLayout.CENTER);

        this.setVisible(true);
    }
}