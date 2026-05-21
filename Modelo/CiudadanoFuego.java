package Modelo;

public class CiudadanoFuego extends MaestroUnElemento implements MaestroFuego {

    /**
     * Constructor por defecto de un maestro de fuego, por defecto toma a Zuko
     */
    public CiudadanoFuego() {
        super("Zuko", "Fuego", "Hombre", 13, true, 5, 70);
    }

    /**
     * Constructor de un maestro de fuego
     * @param nombre Nombre del maestro
     * @param nacion Nacion del maestro
     * @param genero Genero del maestro
     * @param edad Edad que tiene el maestro
     * @param nivelDominio Nivel de dominio que tiene el maestro sobre el fuego
     * @param energia Energia que tiene el maestro
     */
    public CiudadanoFuego(String nombre, String nacion, String genero, int edad, int nivelDominio, int energia) {
        super(nombre, nacion, genero, edad, true, nivelDominio, energia);
    }

    /**
     * Metodo que le permite al maestro atacar
     * @throws EnergiaInsuficienteException Arroja una excepción si el maestro no tiene la suficiente energía
     */
    @Override
    public void atacar() throws EnergiaInsuficienteException {
        if (energia < 10) {
            throw new EnergiaInsuficienteException();
        }
        System.out.println(nombre + " ataca usando su dominio del fuego!");
        energia -= 10;
    }

    /**
     * Metodo que le permite al maestro controlar el fuego
     */
    @Override
    public void controlarFuego() {
        System.out.println("Concentracion para poder controlar el fuego");
    }

    /**
     * Metodo que le permite al maestro lanzar bolas de fuego
     */
    @Override
    public void lanzarBolasFuego() {
        System.out.println("Concentracion para lanzar bolas de fuego de sus palmas");
    }

    /**
     * Metodo que le permite al maestro lanzar fuego por la boca
     */
    @Override
    public void alientoFuego() {
        System.out.println("Concentracion para poder lanzar fuego por la boca");
    }
}
