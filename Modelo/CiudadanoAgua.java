package Modelo;

public class CiudadanoAgua extends MaestroUnElemento implements MaestroAgua {

    /**
     * Constructor por defecto de un maestro de agua, por defecto toma a Katara
     */
    public CiudadanoAgua() {
        super("Katara", "Agua", "Mujer", 12, true, 4, 70);

    }

    /**
     * Constructor de un maestro de agua
     * @param nombre Nombre del maestro
     * @param nacion Nacion del maestro
     * @param genero Genero del maestro
     * @param edad Edad que tiene el maestro
     * @param nivelDominio Nivel de dominio que tiene el maestro sobre el agua
     * @param energia Energia que tiene el maestro
     */
    public CiudadanoAgua(String nombre, String nacion, String genero, int edad, int nivelDominio, int energia) {
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
        System.out.println(nombre + " ataca usando su dominio del agua!");
        energia -= 10;
    }

    /**
     * Metodo que le permite al maestro controlar el agua
     */
    @Override
    public void controlarAgua() {
        System.out.println("Concentracion para poder controlar el agua");
    }

    /**
     * Metodo que le permite al maestro controlar la sangre de un cuerpo
     */
    @Override
    public void sangreControl() {
        System.out.println("Controlar la sangre");
    }

    /**
     * Metodo que le permite al maestro sanar heridas
     */
    @Override
    public void sanar() {
        System.out.println("Concentracion para sanar");
    }

    /**
     * Metodo que le permite al maestro controlar la vegetación
     */
    @Override
    public void controlPlantas() {
        System.out.println("Concentracion en el suelo para controlar plantas");
    }
}