/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigo;

/**
 *
 * @author javie
 */
public class Nodo_Lista {
    private User usuario;
    private Nodo_Lista siguiente;

    public Nodo_Lista() {
        this.usuario = null;
        this.siguiente = null;
    }

    public Nodo_Lista(User usuario) {
        this.usuario = usuario;
        this.siguiente = null;
    }

    public User getUsuario() {
        return usuario;
    }

    public void setUsuario(User usuario) {
        this.usuario = usuario;
    }

    public Nodo_Lista getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo_Lista siguiente) {
        this.siguiente = siguiente;
    }
    
    public void eliminar_nodo(){
        usuario = null;
        siguiente = null;
    }

    @Override
    public String toString() {
        return usuario.toString();
    }
}