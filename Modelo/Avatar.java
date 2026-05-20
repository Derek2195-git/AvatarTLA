package Modelo;

public class Avatar extends Personaje implements MaestroFuego, MaestroAgua, MaestroAire, MaestroTierra {

    public Avatar() {
        super("Aang", "Nomada", "Hombre", 12, true, 9);
    }

    public Avatar(String nombre, String nacion, String genero, int edad, int energia) {
        super(nombre, nacion, genero, edad, true, energia);
    }

    public void atacar() throws EnergiaInsuficienteException {
        if (energia < 10) {
            throw new EnergiaInsuficienteException();
        }
        System.out.println(nombre + " ataca con su dominio de los 4 elementos!");
        energia -= 10;
    }

    @Override
    public void controlarAgua() {
        System.out.println("Concentración para controlar el agua");
    }

    @Override
    public void sangreControl() {
        System.out.println("Concentración para controlar la sangre a partir del agua");
    }

    @Override
    public void sanar() {
        System.out.println("Concentracion para sanar");
    }

    @Override
    public void controlPlantas() {
        System.out.println("Concentracion en el suelo para controlar plantas");
    }

    @Override
    public void controlarAire() {
        System.out.println("Concentración para controlar el aire");
    }

    @Override
    public void lanzarRafaga() {
        System.out.println("Lanza una rafaga de aire con las palmas de las manos");
    }

    @Override
    public void cambiarClima() {
        System.out.println("Concentración para controlar el clima del entorno");
    }

    @Override
    public void controlarFuego() {
        System.out.println("Concentración para controlar el fuego");
    }

    @Override
    public void lanzarBolasFuego() {
        System.out.println("Concentracion para lanzar bolas de fuego de sus palmas");
    }

    @Override
    public void alientoFuego() {
        System.out.println("Concentracion para poder lanzar fuego por la boca");
    }

    @Override
    public void controlarTierra() {
        System.out.println("Concentración para controlar la tierra");
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