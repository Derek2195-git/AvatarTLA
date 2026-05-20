package Modelo;

public class CiudadanoFuego extends MaestroUnElemento implements MaestroFuego {
    /**
     * El constructor vacio del maestro crea a Zuko
     */
    public CiudadanoFuego() {
        super("Zuko", "Fuego", "Hombre", 13, true, 5, 70);
    }

    /**
     * Constructor del personaje
     * @param nombre Nombre del maestro
     * @param nacion Nacion de donde proviene el maestro
     * @param genero Genero del maestro (Si es hombre o mujer)
     * @param edad Edad del maestro
     * @param nivelDominio Nivel de dominio de un elemento que posee el maestro
     * @param energia Energia actual del maestro
     */
    public CiudadanoFuego(String nombre, String nacion, String genero, int edad, int nivelDominio, int energia) {
        super(nombre, nacion, genero, edad, true, nivelDominio, energia);
    }

    @Override
    public void controlarFuego() {
        System.out.println("Concentracion para poder controlar el fuego");
    }

    @Override
    public void atacar() throws EnergiaInsuficienteException {
        if (energia < 10) {
            throw new EnergiaInsuficienteException();
        }
        System.out.println(nombre + " ataca usando su dominio del fuego!");
        energia -= 10;
    }

    @Override
    public void lanzarBolasFuego() {
        System.out.println("Concentracion para lanzar bolas de fuego de sus palmas");
    }

    @Override
    public void alientoFuego() {
        System.out.println("Concentracion para poder lanzar fuego por la boca");
    }
}
