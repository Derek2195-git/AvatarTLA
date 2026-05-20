package Modelo;

public class Personaje {
    protected String nombre;
    protected String nacion;
    protected String genero;
    protected int edad;
    protected boolean estaVivo;


    public Personaje(String nombre, String nacion, String genero, int edad, boolean estaVivo) {
        this.nombre = nombre;
        this.nacion = nacion;
        this.genero = genero;
        this.edad = edad;
        this.estaVivo = estaVivo;
    }

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

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNacion(String nacion) {
        this.nacion = nacion;
    }

    public void getGenero(String genero) {
        this.genero = genero;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setVivo(boolean estaVivo) {
        this.estaVivo = estaVivo;
    }

    public void presentarse() {
        System.out.println(nombre + " " + nacion);
    }
}
