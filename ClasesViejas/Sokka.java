package ClasesViejas;

import Modelo.Personaje;

import java.util.ArrayList;

public class Sokka extends Personaje {
    private ArrayList<String> habilidades;
    public Sokka() {
        super("Sokka", "Agua", "Hombre", 12, true, 0);
        habilidades = new ArrayList<>();
       habilidades.add("Boomerang");
       habilidades.add("Planificacion");
    }
}
