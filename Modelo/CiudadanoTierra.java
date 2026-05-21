package Modelo;

public class CiudadanoTierra extends MaestroUnElemento implements MaestroTierra{
    /**
     * Constructor por defecto de un maestro de tierra, por defecto toma a Toph
     */
    public CiudadanoTierra() {
        super("Toph", "Tierra", "Mujer", 13, true, 7, 60);
    }

    /**
     * Constructor de un maestro de tierra
     * @param nombre Nombre del maestro
     * @param nacion Nacion del maestro
     * @param genero Genero del maestro
     * @param edad Edad que tiene el maestro
     * @param nivelDominio Nivel de dominio que tiene el maestro sobre la tierra
     * @param energia Energia que tiene el maestro
     */
    public CiudadanoTierra(String nombre, String nacion, String genero, int edad, int nivelDominio, int energia) {
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
        System.out.println(nombre + " ataca usando su dominio de la tierra!");
        energia -= 10;
    }

    /**
     * Metodo que le permite al maestro controlar la tierra
     */
    @Override
    public void controlarTierra() {
        System.out.println("Concentracion para poder controlar la tierra");
    }


    /**
     * Metodo que le permite al maestro crear muros de piedra
     */
    @Override
    public void crearParedes() {
        System.out.println("Concentracion para crear un muro de piedra");
    }

    /**
     * Metodo que le permite al maestro crear un escudo a partir de piedra
     */
    @Override
    public void crearEscudoPiedra() {
        System.out.println("Concentración para crear un escudo a partir de rocas");
    }
}
