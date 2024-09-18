
package Modelo;
import Logica.cls_cliente;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;
public class ConsultaSQL {
    
    private Connection conexion;
    private Statement st;
    
    public ConsultaSQL(){
      conexion  = new Conexion().getConexion();
 } 
      public boolean registrarCliente(cls_cliente c){
         String query = "Insert into tbl_usuario (pk_usuario, nombre, clave, fk_id_tbl_estado," +
                "fk_id_tbl_rol, fechaRegistro,tarjetaCredito,telefono, email, direccion)" + "Values(" + c.getUsuario()+","+c.getClave()+",1,2,current_timestamp(),"+
                "null,null,null,null);" + c.getTarjetecredito() +","+c.getTelefono()+","+c.getEmail()+","+c.getDireccion()+");";
          return true;
      
      }
         
     
     public boolean validarregistro(cls_cliente c) {
        ResultSet rs;
        boolean resultado = true;
        
         String sql = "SELECT pk_usuario FROM tbl_usuario WHERE pk_uuario =" + c.getUsuario() + ";";
         
         try {
              st = conexion.createStatement();
              
              rs = st.executeQuery(sql);
              
             if(rs.next()){
                 resultado = true;
             } else {
                 resultado = false;
             }
         } catch (SQLException e){
             System.out.println(e);
         }
         return resultado;
     }
}
