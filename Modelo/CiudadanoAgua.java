package Modelo;

public class CiudadanoAgua extends MaestroUnElemento implements MaestroAgua {
    /**
     * El constructor vacio del maestro crea a Katara
     */
    public CiudadanoAgua() {
        super("Katara", "Agua", "Mujer", 12, true, 4, 70);

    }
    /**
     * Constructor del personaje
     * @param nombre Nombre del maestro
     * @param nacion Nacion de donde proviene el maestro
     * @param genero Genero del maestro (Si es hombre o mujer)
     * @param edad Edad del maestro
     * @param nivelDominio Nivel de dominio de un elemento que posee el maestro
     * @param energia Energia actual del maestro
     */
    public CiudadanoAgua(String nombre, String nacion, String genero, int edad, int nivelDominio, int energia) {
        super(nombre, nacion, genero, edad, true, nivelDominio, energia);
    }

    @Override
    public void atacar() throws EnergiaInsuficienteException {
        if (energia < 10) {
            throw new EnergiaInsuficienteException();
        }
        System.out.println(nombre + " ataca usando su dominio del agua!");
        energia -= 10;
    }

    @Override
    public void controlarAgua() {
        System.out.println("Concentracion para poder controlar el agua");
    }

    @Override
    public void sangreControl() {
        System.out.println("Controlar la sangre");
    }

    @Override
    public void sanar() {
        System.out.println("Concentracion para sanar");
    }

    @Override
    public void controlPlantas() {
        System.out.println("Concentracion en el suelo para controlar plantas");
    }
}