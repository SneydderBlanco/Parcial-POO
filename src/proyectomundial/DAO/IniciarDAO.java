package proyectomundial.DAO;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import proyectomundial.model.IniciarSeccion;
import proyectomundial.util.BasedeDatos;

/**
 *
 * @author USUARIO
 */
public class IniciarDAO {
    
    public  IniciarDAO() {
        BasedeDatos.conectar();
    }
    
    public boolean TomarUsarios(String User, String Password) {
        
        String sql = "Select * from poo.users where username = '"+User+"' and password = '"+Password+"'";
        boolean val = false;
        List<IniciarSeccion> iniciarSecciones = new ArrayList<IniciarSeccion>();
        
        try {
            ResultSet result = BasedeDatos.ejecutarSQL(sql);
            
            if(result != null) {
            
                while (result.next()) { 
                    IniciarSeccion iniciarSeccion = new IniciarSeccion(result.getString("username"), result.getString("password"));
                    iniciarSecciones.add(iniciarSeccion);
                }
            }
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("Error consultando iniciarSeccion");
        }
        
        if (!iniciarSecciones.isEmpty()) {
            val = true;
        }
        
        return val;
    }  
}
