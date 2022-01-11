/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import javax.swing.UIManager;

/**
 *
 * @author OCA-UIE
 */
public class App {
    
    public static void main(String args[]){
        System.out.println("Hola!!!");
         
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch (Exception e) {
        }
        vista.frmIngreso flogin = new vista.frmIngreso();
        controlador.IngresoControlador  controlador = new controlador.IngresoControlador( datos.Repositorio.admin , flogin);
        controlador.iniciar();
        
    }
}
