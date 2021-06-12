/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigo;

import javax.swing.ImageIcon;

/**
 *
 * @author javie
 */
public class User {
    private String nickname;
    private String nombres;
    private String fecha;
    private String foto;
    private Lista seguidores;
    private Lista seguidos;
    

    public User(String nickname, String nombres, String fecha, String foto) {
        this.nickname = nickname;
        this.nombres = nombres;
        this.fecha = fecha;
        this.foto = foto;
        this.seguidores = null;
        this.seguidos = null;
        
    }

    public User(String nickname, String nombres, String fecha) {
        this.nickname = nickname;
        this.nombres = nombres;
        this.fecha = fecha;
        this.foto = null;
        this.seguidores = null;
        this.seguidos = null;
      
    }

    public User(String nickname, String nombres) {
        this.nickname = nickname;
        this.nombres = nombres;
        this.fecha = "No especificado";
        this.foto = null;
        this.seguidores = null;
        this.seguidos = null;
        
    }

    public User(String nombres) {
        this.nombres = nombres;
    }
    
    

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public Lista getSeguidores() {
        return seguidores;
    }

    public void setSeguidores(Lista seguidores) {
        this.seguidores = seguidores;
    }

    public Lista getSeguidos() {
        return seguidos;
    }

    public void setSeguidos(Lista seguidos) {
        this.seguidos = seguidos;
    }

 
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    
    
    

    @Override
    public String toString() {
        return nombres+" "+nickname;
    }
}
