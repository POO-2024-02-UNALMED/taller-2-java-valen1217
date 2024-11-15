package automovil;

/**
 *
 * @author valen1217
 */
public class Main {
     public static void main(String[] args) {
        Motor motor = new Motor();
        motor.cambiarRegistro(12345);
        motor.asignarTipo("gasolina");

        Asiento asiento1 = new Asiento();
        asiento1.cambiarColor("rojo");
        asiento1.registro = 12345;

        Asiento asiento2 = new Asiento();
        asiento2.cambiarColor("verde");
        asiento2.registro = 12345;

        Auto auto = new Auto();
        auto.modelo = "Toyota";
        auto.precio = 20000;
        auto.motor = motor;
        auto.asientos = new Asiento[]{asiento1, asiento2, null, null};
        auto.registro = 12345;

        System.out.println("Cantidad de asientos: " + auto.cantidadAsientos());

        System.out.println("Verificación de integridad: " + auto.verificarIntegridad());
    }
}
