package Modelo;

public class CiudadanoFuego extends MaestroUnElemento implements MaestroFuego {

    public CiudadanoFuego() {
        super("Zuko", "Fuego", "Hombre", 13, true, 5, 70);
    }


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
