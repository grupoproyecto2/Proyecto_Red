/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigo;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;

/**
 *
 * @author javie
 */
public class Arbol {
    private Nodo raiz;
    private int ax;
    private User aux;
    private String auxx;

    public Arbol() {
        this.raiz = null;
    }
    
    private Nodo in(Nodo x, User d){
        if(x == null){
            Nodo nnodo = new Nodo(d);
            System.out.println("pureba");
            return nnodo;
        }else{
            if(d.toString().length() < x.toString().length()){
                x.setLeft(in(x.getLeft(),d));
            }else if(d.toString().length() > x.toString().length()){
                x.setRight(in(x.getRight(),d));
            }else{
                x.setLeft(in(x.getLeft(),d));
            }
        }
        return x;
    }
    
    public void insertar(User d){
        if(raiz == null){
            raiz = in(raiz,d);
        }else{
            in(raiz,d);
        }
    }
    
    private void mostrar_usuarios(Nodo x, JTextArea c){
        if(x == null){
            return;
        }else{
            mostrar_usuarios(x.getRight(), c);
            c.append("\n");
            c.append(x.toString()+"\n");
            mostrar_usuarios(x.getLeft(), c);
        }
    }
    
    public void mostar_usuarios(JTextArea c){
        mostrar_usuarios(raiz, c);
    }
    
    private boolean busqueda(Nodo x, User c){
        if(x == null){
            return false;
        }else if(x.getDato().getNombres().equals(c.getNombres())){
            aux = c;
            return true;
        }else if(c.toString().length() < x.getDato().toString().length()){
            return busqueda(x.getLeft(),c);
        }else{
            return busqueda(x.getRight(),c);
        }
    }
    
    public User busqueda(User c){
        if(busqueda(raiz, c)){
            return aux;
        }else{
            return null;
        }
    }
    
    //Prototipo
}
