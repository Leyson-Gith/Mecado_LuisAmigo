
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
   public class Conexion {
      private String url = "jdbc:mysql://localhost:3306/dbs_mercado_amigo"; // Reemplaza "nombreBaseDatos" por el nombre de tu base de datos
      private  String usuario = "Mercado_Amigo"; // Reemplaza con tu usuario de MySQL
      private String contraseña = "root"; // Reemplaza con tu contraseña de MySQL
      private Connection conexion = null;

      
    public Conexion() {
        try {
            // Crear la conexión a la base de datos
            conexion = DriverManager.getConnection(url, usuario, contraseña);
            System.out.println("Conexión exitosa a la base de datos!");
            // Aquí puedes añadir el código para interactuar con la base de datos
         } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos.");
            e.printStackTrace(); 
        }
    }

    public Connection getConexion() {
        return conexion;
    }
    
    
}
