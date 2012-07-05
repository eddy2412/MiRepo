/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package POJO;

/**
 *
 * @author Eddy
 */
public class Curso {
       private String IdCurso;
       private String Nombre;

    /**
     * @return the IdCurso
     */
    public String getIdCurso() {
        return IdCurso;
    }

    /**
     * @param IdCurso the IdCurso to set
     */
    public void setIdCurso(String IdCurso) {
        this.IdCurso = IdCurso;
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    @Override
    public String toString(){
        return Nombre;
    }   
       
}
