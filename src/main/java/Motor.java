package main;

/**
 *
 * @author valen1217
 */
public class Motor {
    int registro;
    String tipo;

    void cambiarRegistro(int registro) {
        this.registro = registro;
    }

    void asignarTipo(String tipo) {
        if (tipo.equals("electrico") || tipo.equals("gasolina")) {
            this.tipo = tipo;
        }
    }
}
