package Modelo;

import java.util.ArrayList;
import java.util.Collection;

public class Sokka extends Personaje{
    private ArrayList<String> habilidades;
    public Sokka() {
        super("Sokka", "Agua", "Hombre", 12, true, 0);
        habilidades = new ArrayList<>();
       habilidades.add("Boomerang");
       habilidades.add("Planificacion");
    }
}
