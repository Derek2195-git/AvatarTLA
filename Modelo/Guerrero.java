package Modelo;

import java.util.ArrayList;

public class    Guerrero extends Personaje {
    private ArrayList<String> habilidades;
    public Guerrero() {
        super("Sokka", "Agua", "Hombre", 12, true, 0);
        habilidades = new ArrayList<>();
        habilidades.add("Boomerang");
        habilidades.add("Planificacion");
    }

    public void atacar() throws EnergiaInsuficienteException {
        if (energia < 10) {
            throw new EnergiaInsuficienteException();
        }
        System.out.println(nombre + " ataca con todas sus fuerzas!");
        energia -= 10;
    }

    /**
     * Constructor
     * @param nombre h
     * @param nacion s
     * @param genero d
     * @param edad k
     * @param energia l
     */
    public Guerrero(String nombre, String nacion, String genero, int edad, int energia) {
        super(nombre, nacion, genero, edad, true, energia);
    }
}
