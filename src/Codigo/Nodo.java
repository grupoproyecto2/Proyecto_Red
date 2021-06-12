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
public class Nodo {

    private User dato;
    private Nodo left;
    private Nodo right;
    private int altura;
    private int balance;

    public Nodo(User dato) {
        this.dato = dato;
        this.left = null;
        this.right = null;
        this.balance = 0;
        this.altura = 0;
    }

    public Nodo() {
        this.dato = null;
        this.left = null;
        this.right = null;
        this.balance = 0;
        this.altura = 0;
    }

    public User getDato() {
        return dato;
    }

    public void setDato(User dato) {
        this.dato = dato;
    }

    public Nodo getLeft() {
        return left;
    }

    public void setLeft(Nodo left) {
        this.left = left;
    }

    public Nodo getRight() {
        return right;
    }

    public void setRight(Nodo right) {
        this.right = right;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance += balance;
    }

    public void delete_Node() {
        this.dato = null;
        this.left = null;
        this.right = null;
        this.altura = 0;
        this.balance = 0;
    }

    public void delete_left() {
        this.left = null;
    }

    public void delete_right() {
        this.right = null;
    }

    @Override
    public String toString() {
        return dato.toString();
    }
}
