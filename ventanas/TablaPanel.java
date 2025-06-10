package ventanas;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import data.pacientes;

public class TablaPanel extends JScrollPane {

    public TablaPanel() {

        String[] columnas = { "ID", "Nombre", "Edad" };

        Object[][] datos = new pacientes().getDatos();

        DefaultTableModel base = new DefaultTableModel(datos, columnas);
        JTable tabla = new JTable(base);
        this.setViewportView(tabla); 
        this.setBounds(0, 0, 400, 800);
    }


}

