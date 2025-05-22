package org.example.controller;


import org.example.model.ArbolBinarioModel;
import org.example.view.ArbolBinarioView;

import java.util.Scanner;

public class ArbolBinarioController {
    private ArbolBinarioModel model;
    private ArbolBinarioView view;
    private Scanner scanner;

    public ArbolBinarioController(ArbolBinarioModel model, ArbolBinarioView view) {
        this.model = model;
        this.view = view;
        this.scanner = new Scanner(System.in);
    }

    public void iniciar() {
        int opcion;
        do {
            view.mostrarMenu();
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    view.mostrarMensaje("Ingrese el valor a insertar:");
                    int valor = scanner.nextInt();
                    model.insertar(valor);
                    break;
                case 2:
                    int altura = model.calcularAltura();
                    view.mostrarAltura(altura);
                    break;
                case 3:
                    view.mostrarMensaje("Saliendo del programa...");
                    break;
                default:
                    view.mostrarMensaje("Opción no válida");
            }
        } while (opcion!=3);
}
}