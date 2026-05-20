package Modelo;

public class CiudadanoAgua extends MaestroUnElemento implements MaestroAgua {
    public CiudadanoAgua() {
        super("Katara", "Agua", "Mujer", 12, true, 4, 70);

    }

    public CiudadanoAgua(String nombre, String nacion, String genero, int edad, int nivelDominio, int energia) {
        super(nombre, nacion, genero, edad, true, nivelDominio, energia);
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