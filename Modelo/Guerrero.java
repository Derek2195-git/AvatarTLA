package Modelo;

import java.util.ArrayList;

public class    Guerrero extends Personaje {
    private ArrayList<String> habilidades;

    /**
     * El constructor vacio por defecto crea a Sokka
     */
    public Guerrero() {
        super("Sokka", "Agua", "Hombre", 12, true, 0);
    }

    /**
     * Metodo que permite a un guerrero atacar
     * @throws EnergiaInsuficienteException En caso de que no haya suficiente energia, se arroja una excepcion
     */
    public void atacar() throws EnergiaInsuficienteException {
        if (energia < 10) {
            throw new EnergiaInsuficienteException();
        }
        System.out.println(nombre + " ataca con todas sus fuerzas!");
        energia -= 10;
    }

    /**
     * Constructor
     * @param nombre Nombre del guerrero
     * @param nacion Nacion del guerrero
     * @param genero Genero del guerrero (Si es hombre o mujer)
     * @param edad Edad del guerrero
     * @param energia Energía del guerrero
     */
    public Guerrero(String nombre, String nacion, String genero, int edad, int energia) {
        super(nombre, nacion, genero, edad, true, energia);
    }

    @Override
    public String toString() {
        return  "Guerrero" + "\n" +
                "Nombre:" + nombre + "\n" +
                "Nacion: " + nacion + "\n" +
                "Genero: " + genero + "\n" +
                "Edad: " + edad + "\n" +
                "¿Esta vivo? " + (estaVivo ? "Si" : "No")  + "\n" +
                "Energia: " + energia + "\n";
    }
}
