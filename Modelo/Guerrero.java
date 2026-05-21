package Modelo;

import java.util.ArrayList;

public class    Guerrero extends Personaje {
    public Guerrero() {
        super("Sokka", "Agua", "Hombre", 12, true, 0);
    }

    public void atacar() throws EnergiaInsuficienteException {
        if (energia < 10) {
            throw new EnergiaInsuficienteException();
        }
        System.out.println(nombre + " ataca con todas sus fuerzas!");
        energia -= 10;
    }

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
