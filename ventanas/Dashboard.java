package ventanas;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;

import paneles.MenuLateralPanel;

public class Dashboard extends JFrame{
 
    public Dashboard() {
        
//VENTANA JFRAME

        this.setTitle("Doctor");
        this.setSize(1600,800);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());

        this.add(new MenuLateralPanel().getPanel(),BorderLayout.WEST);
        TablaPanel tablaPanel = new TablaPanel();
        add(tablaPanel);
        this.setVisible(true);

    }


}
