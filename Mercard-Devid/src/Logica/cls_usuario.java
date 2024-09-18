package Logica;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Smauf
 */
abstract class cls_usuario {
    private String usuario;
    private String clave;
    private String estado;
    private String fecharegistro;

    public cls_usuario(String usuario, String clave, String estado, String fecharegistro) {
        this.usuario = usuario;
        this.clave = clave;
        this.fecharegistro = fecharegistro;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getClave() {
        return clave;
    }
    
    
    
    
}
