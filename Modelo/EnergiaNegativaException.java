package Modelo;

public class EnergiaNegativaException extends RuntimeException {
    /**
     * Constructor vacio de la excepción, es la que usamos en nuestro controlador
     */
    public EnergiaNegativaException() {
        super("¡El personaje actual no puede tener energía negativa!");
    }

    /**
     * Constructor de la excepción, que acepta de parametros un mensaje
     * @param message Mensaje a escribir
     */
    public EnergiaNegativaException(String message) {
        super(message);
    }
}
