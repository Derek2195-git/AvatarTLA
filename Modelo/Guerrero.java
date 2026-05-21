package Modelo;

import java.util.ArrayList;

public class    Guerrero extends Personaje {
    /**
     * Constructor vacio de Guerrero, por defecto toma a Sokka
     */
    public Guerrero() {
        super("Sokka", "Agua", "Hombre", 12, true, 0);
    }

    /**
     * Metodo para que el guerrero ataque
     * @throws EnergiaInsuficienteException Error arrojado en caso de que la energía no sea suficiente
     */
    public void atacar() throws EnergiaInsuficienteException {
        if (energia < 10) {
            throw new EnergiaInsuficienteException();
        }
        System.out.println(nombre + " ataca con todas sus fuerzas!");
        energia -= 10;
    }

    /**
     * Constructor del guerrero
     * @param nombre Nombre del guerrero
     * @param nacion Nacion del guerrero
     * @param genero Genero del guerrero
     * @param edad Edad del guerrero
     * @param energia Energia del guerrero
     */
    public Guerrero(String nombre, String nacion, String genero, int edad, int energia) {
        super(nombre, nacion, genero, edad, true, energia);
    }

    /**
     * Metodo toString del guerrero
     * @return Datos creados del guerrero mostrados en pantalla
     */
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
