package paneles;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.*;

import javax.swing.*;

import ventanas.Dashboard;
import control.LoginControler;

public class LoginPanel {

    private JPanel panelLogin;

    public LoginPanel(){

        panelLogin = new JPanel();
        panelLogin.setSize(500,800);
        panelLogin.setOpaque(true);
        panelLogin.setBackground(Color.WHITE);
        panelLogin.setLayout(new GridBagLayout());

// Administrador de diseño

        GridBagConstraints gbc =new GridBagConstraints();
        gbc.insets = new Insets(10, 80, 10, 80);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;

// Título
        JLabel titulo = new JLabel("Login");
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        titulo.setOpaque(true);
        titulo.setBackground(Color.WHITE);
        
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        

        panelLogin.add(titulo,gbc);

// Entrada de correo

        JTextField entradaCorreo = new JTextField("");
        entradaCorreo.setPreferredSize(new Dimension(500,50));
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        panelLogin.add(entradaCorreo, gbc);

// Entrada contraseña

        JPasswordField entradaContra = new JPasswordField("");
        entradaContra.setSize(new Dimension(100,50));
        gbc.gridx = 1;
        gbc.gridy = 2;
        panelLogin.add(entradaContra, gbc);

// botón

        JButton entradaBoton = new JButton("Iniciar");
        entradaBoton.setPreferredSize(new Dimension());
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.EAST;
        gbc.fill = GridBagConstraints.NONE;

        panelLogin.add(entradaBoton,gbc);



        entradaBoton.addActionListener(new ActionListener(){
            @Override      
                public void actionPerformed(ActionEvent e){

                // Recuperar Datos

                        String entradaUsuario = entradaCorreo.getText();
                        String entradaContrasenna= entradaContra.getText();

                        if (new LoginControler().validacionDatos(entradaUsuario, entradaContrasenna))  {

                        new Dashboard();
                        JFrame ventanaPadre = (JFrame) SwingUtilities.getWindowAncestor(panelLogin);
                        ventanaPadre.dispose();

                        }
                }
        });
 
}
    
    public JPanel getJPanel(){
        return panelLogin;
    }
}
