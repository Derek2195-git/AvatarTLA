package Modelo;

public class Personaje {
    protected String nombre;
    protected String nacion;
    protected String genero;
    protected int edad;
    protected boolean estaVivo;
    protected int energia;

    /**
     * Constructor del personaje
     * @param nombre Nombre del personaje
     * @param nacion Nacion de donde proviene el personaje
     * @param genero Genero del personaje (Si es hombre o mujer)
     * @param edad Edad del personaje
     * @param estaVivo Si el personaje esta vivo, siempre se mantiene como verdadero
     * @param energia Energia actual del personaje
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
     * Por defecto me puse a mi como personaje :D
     */
    public Personaje() {
        nombre = "Derek";
        nacion = "Aire";
        genero = "Hombre";
        edad = 21;
        estaVivo = true;
    }


    public String getNombre() {
        return nombre;
    }

    public String getNacion() {
        return nacion;
    }

    public String getGenero() {
        return genero;
    }

    public int getEdad() {
        return edad;
    }

    public boolean getVivo() {
        return estaVivo;
    }

    public int getEnergia() {
        return energia;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNacion(String nacion) {
        this.nacion = nacion;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setVivo(boolean estaVivo) {
        this.estaVivo = estaVivo;
    }

    public void setEnergia(int energia) { this.energia = energia; }

    public void presentarse() {
        System.out.println(nombre + " " + nacion);
    }

    /**
     * Metodo toString de un personaje
     * @return Retorna la información que contiene el personaje
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
