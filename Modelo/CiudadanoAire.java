package Modelo;

public class CiudadanoAire extends MaestroUnElemento implements MaestroAire {

    /**
     * Constructor por defecto de un maestro del aire, por defecto toma a un Nomada de tiempo
     */
    public CiudadanoAire() {
        super("Nomada de viento", "Aire", "Hombre", 30, true, 5, 50);

    }

    /**
     * Constructor de un maestro de aire
     * @param nombre Nombre del maestro
     * @param nacion Nacion del maestro
     * @param genero Genero del maestro
     * @param edad Edad que tiene el maestro
     * @param nivelDominio Nivel de dominio que tiene el maestro sobre el viento
     * @param energia Energia que tiene el maestro
     */
    public CiudadanoAire(String nombre, String nacion, String genero, int edad, int nivelDominio, int energia) {
        super(nombre, nacion, genero, edad, true, nivelDominio, energia);
    }

    /**
     * Metodo que le permite al maestro controlar el aire
     */
    @Override
    public void controlarAire() {
        System.out.println("Concentración para controlar el aire");
    }

    /**
     * Metodo que le permite al maestro lanzar una rafaga de aire
     */
    @Override
    public void lanzarRafaga() {
        System.out.println("Lanza una rafaga de aire con las palmas de las manos");
    }

    /**
     * Metodo que le permite al maestro cambiar el clima
     */
    @Override
    public void cambiarClima() {
        System.out.println("Concentración para controlar el clima del entorno");
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
        System.out.println(nombre + " ataca usando su dominio del aire!");
        energia -= 10;
    }
}
