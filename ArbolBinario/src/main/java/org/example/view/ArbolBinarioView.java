package org.example.view;



public class ArbolBinarioView {
    public void mostrarAltura(int altura) {
        System.out.println("La altura máxima del árbol es: " + altura);
    }

    public void mostrarMenu() {
        System.out.println("\n1. Insertar valor");
        System.out.println("2. Calcular altura");
        System.out.println("3. Salir");
        System.out.print("Seleccione una opción: ");
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);

    }
}