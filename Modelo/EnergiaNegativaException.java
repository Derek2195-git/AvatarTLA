package Modelo;

public class EnergiaNegativaException extends RuntimeException {
    public EnergiaNegativaException() {
        super("¡El personaje actual no puede tener energía negativa!");
    }
    public EnergiaNegativaException(String message) {
        super(message);
    }
}
