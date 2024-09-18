package Logica;

import Modelo.ConsultaSQL;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Smauf
 */
public class cls_cliente extends cls_usuario{
    private String direccion;
    private int tarjetecredito;
    private String email;
    private int telefono;

    public cls_cliente(String direccion, int tarjetecredito, String email, int telefono, String usuario, String clave, String estado, String fecharegistro) {
        super(usuario, clave, estado, fecharegistro);
        this.direccion = direccion;
        this.tarjetecredito = tarjetecredito;
        this.email = email;
        this.telefono = telefono;
    }

  
    
     public boolean registrar(){
         ConsultaSQL c = new ConsultaSQL();
        if(!c.validarregistro(this)) {
            c.registrarCliente(this);
        }
         
         return true;
     }

    public String getDireccion() {
        return direccion;
    }

    public int getTarjetecredito() {
        return tarjetecredito;
    }

    public String getEmail() {
        return email;
    }

    public int getTelefono() {
        return telefono;
    }

     
     
    
     
}
   
        
    
      

