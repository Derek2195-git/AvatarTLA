package Modelo;

public class CiudadanoViento extends MaestroUnElemento implements MaestroAire {
    public CiudadanoViento() {
        super("Nomada de viento", "Nomada", "Hombre", 30, true, 5, 50);

    }

    public CiudadanoViento(String nombre, String nacion, String genero, int edad, int nivelDominio, int energia) {
        super(nombre, nacion, genero, edad, true, nivelDominio, energia);
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
    public void atacar() throws EnergiaInsuficienteException {
        if (energia < 10) {
            throw new EnergiaInsuficienteException();
        }
        System.out.println(nombre + "ataca");
        energia -= 10;
    }
}
