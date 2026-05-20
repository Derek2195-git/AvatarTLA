package Modelo;

public class Zuko extends MaestroUnElemento implements MaestroFuego {

    public Zuko() {
        super("Zuko", "Fuego", "Hombre", 13, true, 5);
    }

    @Override
    public void controlarFuego() {
        System.out.println("Concentracion para poder controlar el fuego");
    }

    @Override
    public void atacar() {
        System.out.println(nombre + "ataca");
    }

    @Override
    public void lanzarBolasFuego() {
        System.out.println("Concentracion para lanzar bolas de fuego de sus palmas");
    }

    @Override
    public void alientoFuego() {

    }
}
