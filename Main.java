import Modelo.*;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Personaje> personajes = new ArrayList<>();

        int opcion = 0;

        do {
            System.out.println("\n -- Avatar: La leyenda de Aang --");
            System.out.println("1. Crear personaje");
            System.out.println("2. Guardar y salir");
            System.out.println("3. Cargar datos de un archivo de texto");
            opcion = teclado.nextInt();

            switch(opcion) {
                case 1 -> crearPersonaje(teclado, personajes);
                case 2 -> {
                    guardarPersonajes(personajes);
                    System.out.println("Saliendo...");
                }
                case 3 -> abrirArchivoPersonajes(personajes);
                default -> System.out.println("Opción no valida, ingresala de nuevo.");
            }
        } while(opcion != 2);
    }

    public static void crearPersonaje(Scanner teclado, ArrayList<Personaje> personajes) {
        System.out.println("¿Que tipo de personaje quieres crear? Elige una opción.");
        System.out.println("1. Maestro \n 2. Guerrero");
        int tipo = teclado.nextInt();
        teclado.nextLine();

        System.out.println("¿Cual es el nombre del personaje?");
        String nombre = teclado.nextLine();
        System.out.println("¿Cual es la nación del personaje?");
        String nacion = teclado.nextLine();
        System.out.println("¿Cual es el genero del personaje?");
        String genero = teclado.nextLine();
        System.out.println("¿Cual es la edad del personaje?");
        int edad = teclado.nextInt();
        System.out.println("¿Cuanta energía tiene el personaje?");
        int energia = teclado.nextInt();

        if (tipo == 1) {
            System.out.println("¿Que elemento domina el personaje? Escribe el numero de la opción correspondiente." +
                    "\n 1. Agua \t 2. Tierra \t 3. Fuego \t 4. Aire \t 5. Todos");
            int elemento = teclado.nextInt();
            System.out.println("En una escala de 1 al 10, ¿que tanto del elemento domina el personaje?");
            int nivelDominio = teclado.nextInt();

            MaestroUnElemento maestro = switch (elemento) {
                case 1 -> new CiudadanoAgua(nombre, nacion, genero, edad, nivelDominio, energia);
                case 2 -> new CiudadanoTierra(nombre, nacion, genero, edad, nivelDominio, energia);
                case 3 -> new CiudadanoFuego(nombre, nacion, genero, edad, nivelDominio, energia);
                case 4 -> new CiudadanoViento(nombre, nacion, genero, edad, nivelDominio, energia);
                default -> null;
            };

            if (elemento == 5) {
                personajes.add(new Aang());
            }

            if (maestro != null) personajes.add(maestro);

            System.out.println("¡Personaje creado!");
        } else if (tipo == 2) {
            Personaje guerrero = new Guerrero(nombre, nacion, genero, edad, energia);
            personajes.add(guerrero);
            System.out.println("¡Personaje creado!");
        } else {
            System.out.println("El personaje no se creó, intentalo de nuevo.");
        }

    }

    public static void guardarPersonajes(ArrayList<Personaje> personajes) {
        String rutaArchivo = "personajes.txt";
        try (
                BufferedWriter escritor = new BufferedWriter(new FileWriter(rutaArchivo))
                ) {
            for (Personaje personajeActual : personajes) {
                // String nombre, String nacion, String genero, int edad, int nivelDominio, int energia
                if (personajeActual instanceof MaestroUnElemento maestro) {
                    escritor.write("Maestro, " + maestro.getNombre() + "," + maestro.getNacion() + "," + maestro.getGenero() + "," +
                            maestro.getEdad() + ","+ maestro.getEnergia() + "," + maestro.getNivelDeDominio());
                } else {
                    // String nombre, String nacion, String genero, int edad, int energia
                    escritor.write("Guerrero, " + personajeActual.getNombre() + "," + personajeActual.getNacion() + "," +
                            personajeActual.getGenero() + "," + personajeActual.getEdad() + "," + personajeActual.getEnergia());
                }
                escritor.newLine();
            }
            System.out.println("Personajes guardados correctamente en: " + rutaArchivo);

        } catch (IOException e) {
            System.out.println("Error de entrada y salida: " + e.getMessage());
        }
    }

    public static void abrirArchivoPersonajes(ArrayList<Personaje> personajes) {
        String rutaArchivo = "personajes.txt";
        try (BufferedReader lector = new BufferedReader(new FileReader(rutaArchivo))){
            String linea;

            while ((linea = lector.readLine()) != null) {
                try {
                    // String nombre, String nacion, String genero, int edad, int energia
                    String[] datos = linea.split(",");
                    String tipo = datos[0];
                    String nombre = datos[1];
                    String nacion = datos[2];
                    String genero = datos[3];
                    int edad = Integer.parseInt(datos[4]);
                    int energia = Integer.parseInt(datos[5]);

                    if (energia < 0) {
                        throw new EnergiaNegativaException();
                    }

                    if (tipo.equalsIgnoreCase("Maestro")) {
                        int nivelDominio = Integer.parseInt(datos[6]);
                        personajes.add(new CiudadanoAgua());
                    } else {
                        personajes.add(new Guerrero(nombre, nacion, genero, edad, energia));
                    }

                    System.out.println("Personaje cargado: " + nombre);
                } catch (EnergiaNegativaException e) {
                    System.out.println(e.getMessage());
                }

            }

            System.out.println("Carga de personajes completa");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
