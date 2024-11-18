package test;

/**
 *
 * @author valen1217
 */
public class Auto {
    String modelo;
    int precio;
    Motor motor;
    Asiento[] asientos;
    int registro;
    static int cantidadCreados;

    int cantidadAsientos() {
        int count = 0;
        for (Asiento asiento : asientos) {
            if (asiento != null) count++;
        }
        return count;
    }

    String verificarIntegridad() {
        if (this.registro != motor.registro) {
            return "Las piezas no son originales";
        }
        for (Asiento asiento : asientos) {
            if (asiento != null && asiento.registro != this.registro) {
                return "Las piezas no son originales";
            }
        }
        return "Auto original";
    }
}
