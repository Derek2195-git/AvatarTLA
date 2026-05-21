package Modelo;

public abstract class MaestroUnElemento extends Personaje {
    protected int nivelDeDominio;

    /**
     * Constructor de la clase de maestro de un elemento
     * @param nombre Nombre del maestro
     * @param nacion Nacion de donde proviene el maestro
     * @param genero Genero del maestro
     * @param edad Edad del maestro
     * @param estaVivo Estado del maestro (Si esta vivo o muerto)
     * @param nivelDominio Nivel de dominio que posee el maestro de un elemento
     * @param energia Energia del maestro
     */
    public MaestroUnElemento(String nombre, String nacion, String genero, int edad, boolean estaVivo, int nivelDominio, int energia) {
        super(nombre, nacion, genero, edad, estaVivo, energia);
        this.nivelDeDominio = nivelDominio;
    }

    /**
     * Constructor vacio de un maestro de un elemento
     */
    public MaestroUnElemento() {
        super();
        nivelDeDominio = 1;
    }

    /**
     * Metodo abstract para que un maestro ataque
     * @throws EnergiaInsuficienteException Si el maestro no tiene suficiente energia se lanza un error
     */
    public abstract void atacar() throws EnergiaInsuficienteException;

    /**
     * Metodo que incrementa el nivel de dominio del maestro
     */
    public void incrementarNivelDominio() {
        if (nivelDeDominio < 10) {
            nivelDeDominio++;
        }
    }

    /**
     * Metodo que reduce el nivel de dominio del maestro
     */
    public void decrementarNivelDominion() {
        if (nivelDeDominio > 0) {
            nivelDeDominio--;
        }
    }

    /**
     * Getter del nivel de dominio del maestro
     * @return
     */
    public int getNivelDeDominio() {
        return nivelDeDominio;
    }

    /**
     * Metodo toString del maestro
     * @return Datos creados del maestro mostrados en pantalla
     */
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
