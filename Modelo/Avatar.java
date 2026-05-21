package Modelo;

public class Avatar extends Personaje implements MaestroFuego, MaestroAgua, MaestroAire, MaestroTierra {

    /**
     * Constructor por defecto del Avatar, por defecto toma a Aang
     */
    public Avatar() {
        super("Aang", "Nomada", "Hombre", 12, true, 9);
    }

    /**
     * Constructor del avatar
     * @param nombre Nombre del avatar
     * @param nacion Nacion de donde viene el avatar
     * @param genero Genero del avatar
     * @param edad Edad que tiene el avatar
     * @param energia Energia que posee el avatar
     */
    public Avatar(String nombre, String nacion, String genero, int edad, int energia) {
        super(nombre, nacion, genero, edad, true, energia);
    }

    /**
     * Metodo que le permite al avatar atacar
     * @throws EnergiaInsuficienteException Arroja una excepción si el avatar no tiene la suficiente energía
     */
    public void atacar() throws EnergiaInsuficienteException {
        if (energia < 10) {
            throw new EnergiaInsuficienteException();
        }
        System.out.println(nombre + " ataca con su dominio de los 4 elementos!");
        energia -= 10;
    }

    /**
     * Metodo que le permite al avatar controlar el agua
     */
    @Override
    public void controlarAgua() {
        System.out.println("Concentracion para poder controlar el agua");
    }

    /**
     * Metodo que le permite al avatar controlar la sangre de un cuerpo
     */
    @Override
    public void sangreControl() {
        System.out.println("Controlar la sangre");
    }

    /**
     * Metodo que le permite al avatar sanar heridas
     */
    @Override
    public void sanar() {
        System.out.println("Concentracion para sanar");
    }

    /**
     * Metodo que le permite al avatar controlar la vegetación
     */
    @Override
    public void controlPlantas() {
        System.out.println("Concentracion en el suelo para controlar plantas");
    }
    /**
     * Metodo que le permite al avatar controlar el aire
     */
    @Override
    public void controlarAire() {
        System.out.println("Concentración para controlar el aire");
    }

    /**
     * Metodo que le permite al avatar lanzar una rafaga de aire
     */
    @Override
    public void lanzarRafaga() {
        System.out.println("Lanza una rafaga de aire con las palmas de las manos");
    }

    /**
     * Metodo que le permite al avatar cambiar el clima
     */
    @Override
    public void cambiarClima() {
        System.out.println("Concentración para controlar el clima del entorno");
    }

    /**
     * Metodo que le permite al avatar controlar el fuego
     */
    @Override
    public void controlarFuego() {
        System.out.println("Concentracion para poder controlar el fuego");
    }

    /**
     * Metodo que le permite al avatar lanzar bolas de fuego
     */
    @Override
    public void lanzarBolasFuego() {
        System.out.println("Concentracion para lanzar bolas de fuego de sus palmas");
    }

    /**
     * Metodo que le permite al avatar lanzar fuego por la boca
     */
    @Override
    public void alientoFuego() {
        System.out.println("Concentracion para poder lanzar fuego por la boca");
    }

    /**
     * Metodo que le permite al avatar controlar la tierra
     */
    @Override
    public void controlarTierra() {
        System.out.println("Concentracion para poder controlar la tierra");
    }

    /**
     * Metodo que le permite al avatar crear muros de piedra
     */
    @Override
    public void crearParedes() {
        System.out.println("Concentracion para crear un muro de piedra");
    }

    /**
     * Metodo que le permite al avatar crear un escudo a partir de piedra
     */
    @Override
    public void crearEscudoPiedra() {
        System.out.println("Concentración para crear un escudo a partir de rocas");
    }

    /**
     * Metodo toString del avatar
     * @return Datos creados del avatar mostrados en pantalla
     */
    @Override
    public String toString() {
        return  "Avatar" + "\n" +
                "Nombre:" + nombre + "\n" +
                "Nacion: " + nacion + "\n" +
                "Genero: " + genero + "\n" +
                "Edad: " + edad + "\n" +
                "¿Esta vivo? " + (estaVivo ? "Si" : "No")  + "\n" +
                "Energia: " + energia + "\n";
    }
}