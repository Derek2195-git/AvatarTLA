package Modelo;

public class Katara extends MaestroUnElemento implements MaestroAgua {
    public Katara() {
        super("Katara", "Agua", "Mujer", 12, true, 4);

    }

    @Override
    public void atacar() {
        System.out.println(nombre + "ataca");
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
