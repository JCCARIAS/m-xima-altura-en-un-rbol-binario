package org.example.model;



public class NodoAB {
    private int valor;
    private NodoAB izquierdo;
    private NodoAB derecho;

    public NodoAB(int valor) {
        this.valor = valor;
        this.izquierdo = null;
        this.derecho = null;
    }

    // Getters y Setters
    public int getValor() { return valor; }
    public void setValor(int valor) { this.valor = valor; }
    public NodoAB getIzquierdo() { return izquierdo; }
    public void setIzquierdo(NodoAB izquierdo) { this.izquierdo = izquierdo; }
    public NodoAB getDerecho() { return derecho; }
    public void setDerecho(NodoAB derecho) { this.derecho = derecho; }
}
