/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import POJO.Alumno;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Eddy
 */
public class MAINPruebas {
    
    public static void main(String[] args){
       AlumnoDAO p;
       ArrayList<Alumno> resultados = null;
       
       p = new AlumnoDAO();
               
       resultados = p.consultaRegistros();
       
        for(Alumno o:resultados){
            System.out.println(""+o);
            JOptionPane.showMessageDialog(null, ""+o);
        }
        
    }
    
    
    
}
