package proyectomundial.DAO;

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
        
        //BasedeDatos.conectar();
        boolean registro = BasedeDatos.ejecutarActualizacionSQL(sql);
        //BasedeDatos.desconectar();
        return registro;
    }
    
    
}
