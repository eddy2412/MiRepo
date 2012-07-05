/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import POJO.Alumno;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Eddy
 */
public class AlumnoDAO extends DAO {

    public AlumnoDAO() {
        super();
    }

    public ArrayList<Alumno> consultaPorBoleta(String boleta) {
        try {
            ArrayList<Alumno> resultados = new ArrayList<Alumno>();
            Alumno nuevoAlumno;
            preparedStatement = conn.prepareStatement("SELECT * FROM alumno WHERE boleta = ?");
            preparedStatement.setString(1, boleta);
                    
            result = preparedStatement.executeQuery();

            while (result.next()) {
                nuevoAlumno = new Alumno();
                nuevoAlumno.setBoleta(result.getString("Boleta"));
                nuevoAlumno.setNombre(result.getString("Nombre"));
                nuevoAlumno.setApellidoPaterno(result.getString("Apaterno"));
                nuevoAlumno.setApellidoMaterno(result.getString("AMaterno"));
                resultados.add(nuevoAlumno);
                nuevoAlumno = null;
            }
            return resultados;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public ArrayList<Alumno> consultaRegistros() {
        try {
            ArrayList<Alumno> resultados = new ArrayList<Alumno>();
            Alumno nuevoAlumno;
            preparedStatement = conn.prepareStatement("SELECT * FROM alumno");
            result = preparedStatement.executeQuery();

            while (result.next()) {
                nuevoAlumno = new Alumno();
                nuevoAlumno.setBoleta(result.getString("Boleta"));
                nuevoAlumno.setNombre(result.getString("Nombre"));
                nuevoAlumno.setApellidoPaterno(result.getString("Apaterno"));
                nuevoAlumno.setApellidoMaterno(result.getString("AMaterno"));
                resultados.add(nuevoAlumno);
                nuevoAlumno = null;
            }
            return resultados;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
   public void insertarAlumno(Alumno a){
       //TODO: Meter el alumno en la base de datos
   }
}
