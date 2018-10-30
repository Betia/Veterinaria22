/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veterinariasl;

import Interface.VistaPrincipal;
import Interface.VistaVisitaMain;
import clasesdata.VisitaDeAtencionData;
import clasesprincipales.VisitaDeAtencion;
import java.awt.BorderLayout;
import java.awt.Component;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JDesktopPane;
import javax.swing.JPanel;

/**
 *
 * @author Usuario
 */
public class VeterinariaSL {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException {
        
        VistaPrincipal vistaPrincipal = new VistaPrincipal();
        
        vistaPrincipal.setVisible(true);
        
        JPanel panelCentral = vistaPrincipal.getPanelCentral();
        
        panelCentral.add(new VistaVisitaMain(),BorderLayout.CENTER);
        panelCentral.revalidate();
        panelCentral.repaint();
        
        
        //VisitaDeAtencionData visitaDeAtencionDATA = new VisitaDeAtencionData();
        //ArrayList<VisitaDeAtencion> listarVisitas = visitaDeAtencionDATA.listarVisitas();
        
        
    }
    
}
