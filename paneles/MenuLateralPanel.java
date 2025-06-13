package paneles;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JPanel;

public class MenuLateralPanel extends JPanel {
    
    // Botones agregados
    private JButton btnPacientes;
    private JButton btnHistorial;
    
    public MenuLateralPanel() {
        this.setPreferredSize(new Dimension(400, 1000));
        this.setOpaque(true);
        this.setBackground(Color.PINK);

        // --- AGREGADO: Creación de botones ---
        btnPacientes = new JButton("Pacientes");
        btnPacientes.setBounds(50, 50, 120, 40); // (x, y, ancho, alto)
        
        btnHistorial = new JButton("Historial");
        btnHistorial.setBounds(50, 120, 120, 40); // Posición debajo del primero

        // Agregar botones al panel
        this.setLayout(null); // Layout nulo para usar setBounds
        this.add(btnPacientes);
        this.add(btnHistorial);
        // --- FIN AGREGADO ---
    }
    
    public JPanel getPanel() {
        return this;
    }
}

