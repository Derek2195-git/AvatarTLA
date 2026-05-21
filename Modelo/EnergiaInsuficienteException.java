package Modelo;

public class EnergiaInsuficienteException extends Exception {
    /**
     * Constructor vacio de la excepción, es la que usamos en el controlador
     */
    public EnergiaInsuficienteException() {
        super("¡El maestro necesita descansar y meditar!");
    }

    /**
     * Constructor de la excepción usada a partir de una cadena
     * @param mensaje Mensaje a escribir
     */
    public EnergiaInsuficienteException(String mensaje) {
        super(mensaje);
    }
}
