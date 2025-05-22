

import org.example.controller.ArbolBinarioController;
import org.example.model.ArbolBinarioModel;
import org.example.view.ArbolBinarioView;


public class Main {
    public static void main(String[] args) {
        ArbolBinarioModel model = new ArbolBinarioModel();
        ArbolBinarioView view = new ArbolBinarioView();
        ArbolBinarioController controller = new ArbolBinarioController(model, view);

        controller.iniciar();
    }
}