package Modelo;

public class Personaje {
    protected String nombre;
    protected String nacion;
    protected String genero;
    protected int edad;
    protected boolean estaVivo;
    protected int energia;

    /**
     * Constructor de la clase personaje, las subclases hacen uso de este
     * @param nombre Nombre del personaje
     * @param nacion Nacion del personaje
     * @param genero Genero del personaje
     * @param edad Edad del personaje
     * @param estaVivo Estado actual del personaje (Si esta vivo o no)
     * @param energia Energia con la que cuenta el personaje
     */
    public Personaje(String nombre, String nacion, String genero, int edad, boolean estaVivo, int energia) {
        this.nombre = nombre;
        this.nacion = nacion;
        this.genero = genero;
        this.edad = edad;
        this.estaVivo = estaVivo;
        this.energia = energia;
    }

    /**
     * Constructor por defecto de personaje, aqui me puse a mi
     */
    public Personaje() {
        nombre = "Derek";
        nacion = "Aire";
        genero = "Hombre";
        edad = 20;
        estaVivo = true;
    }

    /**
     * Getter del nombre
     * @return Nombre del personaje
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Getter de la nación
     * @return Nación de donde proviene el personaje
     */
    public String getNacion() {
        return nacion;
    }

    /**
     * Getter del genero
     * @return Genero del personaje
     */
    public String getGenero() {
        return genero;
    }

    /**
     * Getter de la edad
     * @return Edad del personaje
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Getter del estado del personaje
     * @return Retorna un booleano si el personaje esta vivo o no
     */
    public boolean getVivo() {
        return estaVivo;
    }

    /**
     * Getter de la energía del personaje
     * @return Energia que tiene el peersonaje actualmente
     */
    public int getEnergia() {
        return energia;
    }

    /**
     * Setter del nombre del personaje
     * @param nombre Nombre nuevo para el personaje
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Setter de la nación del personaje
     * @param nacion Nueva nación del personaje
     */
    public void setNacion(String nacion) {
        this.nacion = nacion;
    }

    /**
     * Setter del genero del personaje
     * @param genero Nuevo genero del personaje
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * Setter de la edad del personaje
     * @param edad Nueva edad del personaje
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Setter del estado del personaje
     * @param estaVivo Nuevo estado del personaje (Si esta vivo o no)
     */
    public void setVivo(boolean estaVivo) {
        this.estaVivo = estaVivo;
    }

    /**
     * Setter de la energia del personaje
     * @param energia Nueva energia del personaje
     */
    public void setEnergia(int energia) { this.energia = energia; }

    /**
     * Presentar el nombre y nación del personaje
     */
    public void presentarse() {
        System.out.println(nombre + " " + nacion);
    }

    /**
     * Metodo toString del personaje
     * @return Datos creados del personaje mostrados en pantalla
     */
    @Override
    public String toString() {
        return  "Nombre:" + nombre + "\n" +
                "Nacion: " + nacion + "\n" +
                "Genero: " + genero + "\n" +
                "Edad: " + edad + "\n" +
                "¿Esta vivo? " + (estaVivo ? "Si" : "No")  + "\n" +
                "Energia: " + energia + "\n";
    }
}
