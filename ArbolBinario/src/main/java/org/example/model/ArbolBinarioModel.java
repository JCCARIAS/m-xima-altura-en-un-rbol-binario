package org.example.model;


public class ArbolBinarioModel {
    private NodoAB raiz;

    public ArbolBinarioModel() {
        this.raiz = null;
    }

    public int calcularAltura() {
        return calcularAltura(raiz);
    }

    private int calcularAltura(NodoAB nodo) {
        if (nodo == null) return 0;
        return 1 + Math.max(calcularAltura(nodo.getIzquierdo()),
                calcularAltura(nodo.getDerecho()));
    }

    public void insertar(int valor) {
        raiz = insertar(raiz, valor);
    }

    private NodoAB insertar(NodoAB nodo, int valor) {
        if (nodo == null) return new NodoAB(valor);
        if (valor < nodo.getValor()) {
            nodo.setIzquierdo(insertar(nodo.getIzquierdo(), valor));
        } else if (valor > nodo.getValor()) {
            nodo.setDerecho(insertar(nodo.getDerecho(), valor));
        }
        return nodo;
    }
}