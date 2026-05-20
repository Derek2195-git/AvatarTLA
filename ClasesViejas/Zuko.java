package ClasesViejas;

import Modelo.EnergiaInsuficienteException;
import Modelo.MaestroFuego;
import Modelo.MaestroUnElemento;

public class Zuko extends MaestroUnElemento implements MaestroFuego {

    public Zuko() {
        super("Zuko", "Fuego", "Hombre", 13, true, 5, 70);
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
        System.out.println(nombre + "ataca");
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
