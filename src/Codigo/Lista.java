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
public class Lista {
    private Nodo_Lista lista;
    private Nodo_Lista fin;

    public Lista() {
        this.lista = null;
        this.fin = null;
    }
    
    public void insertar_elemento(User c){
        Nodo_Lista nnodo = new Nodo_Lista();
        nnodo.setUsuario(c);
        nnodo.setSiguiente(null);
        
        if(lista_vacia()){
            lista = nnodo;
        }else{
            fin.setSiguiente(nnodo);
        }
        fin = nnodo;
    }
    
    public boolean eliminar_usuario(User c){
        boolean band = false;
        if(lista_vacia() == false){
            Nodo_Lista aux_borrar;
            Nodo_Lista anterior = null;
            
            aux_borrar = lista;
            
            while((aux_borrar != null) && (aux_borrar.getUsuario().getNickname() != c.getNickname())){
                anterior = aux_borrar;
                aux_borrar = aux_borrar.getSiguiente();
                
            }
            
            if(anterior == null){
                lista = lista.getSiguiente();
                aux_borrar.eliminar_nodo();
            }else if(aux_borrar != null){
                band = true;
                anterior.setSiguiente(aux_borrar.getSiguiente());
                aux_borrar.eliminar_nodo();
            }
        }
        return band;
    }
    
    public void eliminar_lista_completa(){
        if(lista_vacia() == false){
            while(lista != null){
                Nodo_Lista aux = lista;
                lista = aux.getSiguiente();
                aux.eliminar_nodo();
            }
        }
    }
    
    public User buscar_elemnto(User c){
        User aux = null;
        Nodo_Lista actual = new Nodo_Lista();
        actual = lista;
        
        while(actual != null){
            if(actual.getUsuario().getNickname().equals(c.getNickname())){
                aux = actual.getUsuario();
                break;
            }
            actual = actual.getSiguiente();
        }
        
        return aux;
    }
    
    public void mostar_elementos(){
        User aux = null;
        Nodo_Lista actual = new Nodo_Lista();
        actual = lista;
            
        if(actual != null){
            while(actual != null){
            aux = actual.getUsuario();
            actual = actual.getSiguiente();
            System.out.println("\n"+aux.getNickname());
            }
        }
    }
    
    public boolean lista_vacia(){
        return (lista == null)? true : false;
    }
}
