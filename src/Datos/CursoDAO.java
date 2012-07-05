package Datos;

import POJO.Alumno;
import POJO.Curso;
import java.util.ArrayList;

/**
 *
 * @author Eddy
 */
public class CursoDAO extends DAO{
    
    public CursoDAO(){
        super();
    }
     public ArrayList<Curso> consultaCurso() {
        try {
            ArrayList<Curso> resultados = new ArrayList<Curso>();
            Curso nuevoCurso;
            preparedStatement = conn.prepareStatement("SELECT * FROM curso");
            result = preparedStatement.executeQuery();
            while (result.next()) {
                nuevoCurso = new Curso();
                nuevoCurso.setIdCurso(result.getString("IdCurso"));
                nuevoCurso.setNombre(result.getString("Nombre"));
                resultados.add(nuevoCurso);
                nuevoCurso = null;
            }
            return resultados;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

  
}
