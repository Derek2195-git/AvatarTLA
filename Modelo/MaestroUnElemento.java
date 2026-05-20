package Modelo;

public abstract class MaestroUnElemento extends Personaje {
    // Va de 1 a 10
    protected int nivelDeDominio;

    protected String nombre;
    protected String nacion;
    protected String genero;
    protected int edad;
    protected boolean estaVivo;

    public MaestroUnElemento(String nombre, String nacion, String genero, int edad, boolean estaVivo, int nivelDominio) {
        super(nombre, nacion, genero, edad, estaVivo);
        this.nivelDeDominio = nivelDominio;
    }

    public MaestroUnElemento() {
        super();
        nivelDeDominio = 1;
    }

    public abstract void atacar();
    public void incrementarNivelDominio() {
        if (nivelDeDominio < 10) {
            nivelDeDominio++;
        }
    }

    public int getNivelDeDominio() {
        return nivelDeDominio;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
