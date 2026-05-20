package Modelo;

public class CiudadanoTierra extends MaestroUnElemento implements MaestroTierra{
    /**
     * El constructor vacio del maestro crea a Toph
     */
    public CiudadanoTierra() {
        super("Toph", "Tierra", "Mujer", 13, true, 7, 60);
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
    public CiudadanoTierra(String nombre, String nacion, String genero, int edad, int nivelDominio, int energia) {
        super(nombre, nacion, genero, edad, true, nivelDominio, energia);
    }

    @Override
    public void controlarTierra() {
        System.out.println("Concentracion para poder controlar el fuego");
    }

    @Override
    public void atacar() throws EnergiaInsuficienteException {
        if (energia < 10) {
            throw new EnergiaInsuficienteException();
        }
        System.out.println(nombre + " ataca usando su dominio de la tierra!");
        energia -= 10;
    }

    @Override
    public void crearParedes() {
        System.out.println("Concentracion para crear un muro de piedra");
    }

    @Override
    public void crearEscudoPiedra() {
        System.out.println("Concentración para crear un escudo a partir de rocas");
    }
}
