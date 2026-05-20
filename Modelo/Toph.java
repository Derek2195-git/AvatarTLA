package Modelo;

public class Toph extends MaestroUnElemento implements MaestroTierra {


    public Toph() {
        super("Toph", "Tierra", "Mujer", 13, true, 7, 60);
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
        System.out.println(nombre + "ataca");
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
