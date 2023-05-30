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
    
    public boolean registrarInicio(String User, String Password) {
        
        String sql = "Select * from poo.users where username = usarname and password = password";
        
        //BasedeDatos.conectar();
        boolean registro = BasedeDatos.ejecutarActualizacionSQL(sql);
        //BasedeDatos.desconectar();
        return registro;
    }
}
