package Modelo;

public abstract class MaestroUnElemento extends Personaje {
    // Va de 1 a 10
    protected int nivelDeDominio;

    public MaestroUnElemento(String nombre, String nacion, String genero, int edad, boolean estaVivo, int nivelDominio, int energia) {
        super(nombre, nacion, genero, edad, estaVivo, energia);
        this.nivelDeDominio = nivelDominio;
    }

    public MaestroUnElemento() {
        super();
        nivelDeDominio = 1;
    }

    /**
     * Metodo que permite a un maestro atacar
     * @throws EnergiaInsuficienteException En caso de que no haya suficiente energia, se arroja una excepcion
     */
    public abstract void atacar() throws EnergiaInsuficienteException;

    public void incrementarNivelDominio() {
        if (nivelDeDominio < 10) {
            nivelDeDominio++;
        }
    }

    public void decrementarNivelDominion() {
        if (nivelDeDominio > 0) {
            nivelDeDominio--;
        }
    }

    public int getNivelDeDominio() {
        return nivelDeDominio;
    }

    @Override
    public String toString() {
        return  "Maestro de un elemento" + "\n" +
                "Nombre:" + nombre + "\n" +
                "Nacion: " + nacion + "\n" +
                "Genero: " + genero + "\n" +
                "Edad: " + edad + "\n" +
                "¿Esta vivo? " + (estaVivo ? "Si" : "No")  + "\n" +
                "Energia: " + energia + "\n";
    }
}
