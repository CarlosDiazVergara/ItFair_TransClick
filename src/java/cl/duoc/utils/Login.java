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
public class Login {
    private String usuario;
    private String password;
    private Boolean recordarme;

    public Login() {
    }

    public Login(String usuario, String password, Boolean recordarme) {
        this.usuario = usuario;
        this.password = password;
        this.recordarme = recordarme;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getRecordarme() {
        return recordarme;
    }

    public void setRecordarme(Boolean recordarme) {
        this.recordarme = recordarme;
    }

    @Override
    public String toString() {
        return "Login{" + "usuario=" + usuario + ", password=" + password + ", recordarme=" + recordarme + '}';
    }
    
    
    
    
}
