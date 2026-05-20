package Modelo;

public class EnergiaInsuficienteException extends Exception {
    public EnergiaInsuficienteException() {
        super("¡El maestro necesita descansar y meditar!");
    }

    public EnergiaInsuficienteException(String mensaje) {
        super(mensaje);
    }
}
