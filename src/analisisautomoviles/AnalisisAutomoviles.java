/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analisisautomoviles;

import javax.swing.JOptionPane;

/**
 *
 * @author Kevin
 */
public class AnalisisAutomoviles {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Coche Fordfocus = new Coche();{
        String acelera;
        
        double velocidad = Double.parseDouble(JOptionPane.showInputDialog("Velocidad:"));
        double tiempo = Double.parseDouble(JOptionPane.showInputDialog("Tiempo:"));
        Fordfocus.prende = true;
        acelera = Fordfocus.acelerar(velocidad, tiempo);

        if(!acelera.equals(""))
            JOptionPane.showMessageDialog(null, acelera, "Error", 
                    JOptionPane.ERROR_MESSAGE);

/*
        c1.setLuz(true, true);
        c1.setLuz(false, true);
*/
        //c1.setLuz_delantera(true);
        //c1.setLuz_trasera(false);
        Fordfocus.enciendeLuzDelantera();
        Fordfocus.enciendeLuzTrasera();

        JOptionPane.showMessageDialog(null, Fordfocus, "Ford Focus", JOptionPane.INFORMATION_MESSAGE);
       
        /*
        c1.cambiaEstadoLuzDelantera();
        JOptionPane.showMessageDialog(null, c1, "Info", JOptionPane.INFORMATION_MESSAGE);
        c1.cambiaEstadoLuzDelantera();
        JOptionPane.showMessageDialog(null, c1, "Info", JOptionPane.INFORMATION_MESSAGE);
        */
    }{
        Coche Toyotacorolla = new Coche();
        String acelera;

        double velocidad = Double.parseDouble(JOptionPane.showInputDialog("Velocidad:"));
        double tiempo = Double.parseDouble(JOptionPane.showInputDialog("Tiempo:"));
        Toyotacorolla.prende = false;
        acelera = Toyotacorolla.acelerar(velocidad, tiempo);

        if(!acelera.equals(""))
            JOptionPane.showMessageDialog(null, acelera, "Error", 
                    JOptionPane.ERROR_MESSAGE);

/*
        c1.setLuz(true, true);
        c1.setLuz(false, true);
*/
        //c1.setLuz_delantera(true);
        //c1.setLuz_trasera(false);
        Toyotacorolla.enciendeLuzDelantera();
        Toyotacorolla.apagaLuzTrasera();

        JOptionPane.showMessageDialog(null, Toyotacorolla, "Toyota Corolla", JOptionPane.INFORMATION_MESSAGE);
    }
        
        Coche Platina = new Coche();
        String acelera;

        double velocidad = Double.parseDouble(JOptionPane.showInputDialog("Velocidad:"));
        double tiempo = Double.parseDouble(JOptionPane.showInputDialog("Tiempo:"));
        Platina.prende = true;
        acelera = Platina.acelerar(velocidad, tiempo);

        if(!acelera.equals(""))
            JOptionPane.showMessageDialog(null, acelera, "Error", 
                    JOptionPane.ERROR_MESSAGE);

/*
        c1.setLuz(true, true);
        c1.setLuz(false, true);
*/
        //c1.setLuz_delantera(true);
        //c1.setLuz_trasera(false);
        Platina.enciendeLuzDelantera();
        Platina.apagaLuzTrasera();

        JOptionPane.showMessageDialog(null, Platina, "Platina", JOptionPane.INFORMATION_MESSAGE);
    
        
       
        
    
    
    }   
    
    
}
