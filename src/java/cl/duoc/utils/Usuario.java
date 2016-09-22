/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.utils;

/**
 *
 * @author CETECOM
 */
public class Usuario {
    
    private String nombre;
    private String direccion;
    private String correoElectronico;
    private String medioDePago;
    private String pass;

    public Usuario() {
    }

    public Usuario(String nombre, String direccion, String correoElectronico, String medioDePago, String pass) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.correoElectronico = correoElectronico;
        this.medioDePago = medioDePago;
        this.pass = pass;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getMedioDePago() {
        return medioDePago;
    }

    public void setMedioDePago(String medioDePago) {
        this.medioDePago = medioDePago;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", direccion=" + direccion + ", correoElectronico=" + correoElectronico + ", medioDePago=" + medioDePago + ", pass=" + pass + '}';
    }
    
    
    
    
}
