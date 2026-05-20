package Controlador;

import Modelo.*;
import Vista.Vista;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Controlador {
    private Vista vista;
    private ArrayList<Personaje> personajes;

    public Controlador() {
        this.vista = new Vista();
        this.personajes = new ArrayList<>();
    }

    public void iniciar() {
        int opcion = 0;

        do {
            vista.mostrarMenu();
            opcion = vista.leerNumeroEntero();
            switch(opcion) {
                case 1 -> crearPersonaje();
                case 2 -> {
                    vista.mostrarCadena("Escribe la ruta y el nombre del archivo el cual se guardará");
                    String ruta = vista.leerCadena();
                    guardarPersonajes(ruta);
                    vista.mostrarCadena("Saliendo...");
                }
                case 3 -> {
                    vista.mostrarCadena("Escribe la ruta del archivo a cargar");
                    String ruta = vista.leerCadena();
                    abrirArchivoPersonajes(ruta);
                }
                case 4 -> mostrarPersonajesCreados();
                case 5 -> {
                    vista.mostrarCadena("Escribe el nombre del personaje");
                    String nombrePersonaje = vista.leerCadena();
                    atacarConUnPersonaje(nombrePersonaje);
                }
                case 6 -> {
                    vista.mostrarCadena("Escribe el nombre del personaje");
                    String nombrePersonaje = vista.leerCadena();
                    Personaje personajeEncontrado = buscarPersonaje(nombrePersonaje);
                    if (personajeEncontrado != null) {
                        vista.mostrarCadena(personajeEncontrado.toString());
                    } else {
                        vista.mostrarCadena("No se encontró ningun personaje con el nombre " + nombrePersonaje);
                    }
                }
                default -> vista.mostrarCadena("Opción no valida, ingresala de nuevo.");
            }
        } while(opcion != 2);
    }

    public void crearPersonaje() {
        vista.mostrarCadena("¿Que tipo de personaje quieres crear? Elige una opción.");
        vista.mostrarCadena("1. Maestro \n2. Guerrero");
        int tipo = vista.leerNumeroEntero();
        vista.mostrarCadena("¿Cual es el nombre del personaje?");
        String nombre = vista.leerCadena();
        if (nombre.matches(".*\\d.*")) {
            vista.mostrarCadena("El nombre no puede contener numeros");
            return;
        }
        if (buscarPersonaje(nombre) != null) {
            vista.mostrarCadena("Ya existe un personaje con ese nombre, prueba con otro.");
            return;
        }
        vista.mostrarCadena("¿Cual es la nación del personaje?");
       String nacion = vista.leerCadena();
        if (nacion.matches(".*\\d.*")) {
            vista.mostrarCadena("La nación no puede contener numeros");
            return;
        }

        vista.mostrarCadena("¿Cual es el genero del personaje?");
        String genero = vista.leerCadena();
        if (genero.matches(".*\\d.*")) {
            vista.mostrarCadena("El genero no puede contener numeros");
            return;
        }

        vista.mostrarCadena("¿Cual es la edad del personaje?");
        int edad = vista.leerNumeroEntero();
        if (edad < 0) {
            vista.mostrarCadena("La edad no puede ser negativa");
            return;
        }
        vista.mostrarCadena("¿Cuanta energía tiene el personaje?");
        int energia = vista.leerNumeroEntero();
        if (energia < 0) {
            vista.mostrarCadena("La energía no puede ser negativa, intentalo de nuevo");
            return;
        }

        if (tipo == 1) {
            vista.mostrarCadena("¿Que elemento domina el personaje? Escribe el numero de la opción correspondiente." +
                    "\n 1. Agua \t 2. Tierra \t 3. Fuego \t 4. Aire \t 5. Todos");
            int elemento = vista.leerNumeroEntero();
            if (elemento < 1 || elemento > 5) {
                vista.mostrarCadena("Elemento no valido. Elige una opción de entre 1 a 5");
                return;
            }
            if (elemento == 5) {
                personajes.add(new Avatar(nombre, nacion, genero, edad, energia));
            } else {
                vista.mostrarCadena("En una escala de 1 al 10, ¿que tanto del elemento domina el personaje?");
                int nivelDominio = vista.leerNumeroEntero();
                if (nivelDominio < 1 || nivelDominio > 10) {
                    vista.mostrarCadena("El nivel de dominio debe estar entre 1 a 10");
                    return;
                }

                MaestroUnElemento maestro = switch (elemento) {
                    case 1 -> new CiudadanoAgua(nombre, nacion, genero, edad, nivelDominio, energia);
                    case 2 -> new CiudadanoTierra(nombre, nacion, genero, edad, nivelDominio, energia);
                    case 3 -> new CiudadanoFuego(nombre, nacion, genero, edad, nivelDominio, energia);
                    case 4 -> new CiudadanoViento(nombre, nacion, genero, edad, nivelDominio, energia);
                    default -> null;
                };


                if (maestro != null) {
                    personajes.add(maestro);
                }
            }

            vista.mostrarCadena("¡Personaje creado!");
        } else if (tipo == 2) {
            Personaje guerrero = new Guerrero(nombre, nacion, genero, edad, energia);
            personajes.add(guerrero);
            vista.mostrarCadena("¡Personaje creado!");
        } else {
            vista.mostrarCadena("El personaje no se creó, intentalo de nuevo.");
        }

    }

    public void guardarPersonajes(String rutaArchivo) {
        try (
                BufferedWriter escritor = new BufferedWriter(new FileWriter(rutaArchivo))
        ) {
            for (Personaje personajeActual : personajes) {
                if (personajeActual instanceof MaestroUnElemento maestro) {
                    if (maestro instanceof MaestroTierra) {
                        escritor.write("Maestro,Tierra," + maestro.getNombre() + "," + maestro.getNacion() + "," + maestro.getGenero() + "," +
                                maestro.getEdad() + ","+ maestro.getEnergia() + "," + maestro.getNivelDeDominio());
                    } else if (maestro instanceof MaestroAire) {
                        escritor.write("Maestro,Aire," + maestro.getNombre() + "," + maestro.getNacion() + "," + maestro.getGenero() + "," +
                                maestro.getEdad() + ","+ maestro.getEnergia() + "," + maestro.getNivelDeDominio());
                    } else if (maestro instanceof MaestroFuego) {
                        escritor.write("Maestro,Fuego," + maestro.getNombre() + "," + maestro.getNacion() + "," + maestro.getGenero() + "," +
                                maestro.getEdad() + ","+ maestro.getEnergia() + "," + maestro.getNivelDeDominio());
                    } else if (maestro instanceof MaestroAgua) {
                        escritor.write("Maestro,Agua," + maestro.getNombre() + "," + maestro.getNacion() + "," + maestro.getGenero() + "," +
                                maestro.getEdad() + ","+ maestro.getEnergia() + "," + maestro.getNivelDeDominio());
                    }
                } else if (personajeActual instanceof Avatar) {
                    escritor.write("Avatar,Todos," + personajeActual.getNombre() + "," + personajeActual.getNacion() + "," + personajeActual.getGenero() + "," +
                            personajeActual.getEdad() + ","+ personajeActual.getEnergia());
                }else {
                    // String nombre, String nacion, String genero, int edad, int energia
                    escritor.write("Guerrero," + personajeActual.getNombre() + "," + personajeActual.getNacion() + "," +
                            personajeActual.getGenero() + "," + personajeActual.getEdad() + "," + personajeActual.getEnergia());
                }
                escritor.newLine();
            }
            vista.mostrarCadena("Personajes guardados correctamente en: " + rutaArchivo);

        } catch (IOException e) {
            vista.mostrarCadena("Error de entrada y salida: " + e.getMessage());
        }
    }

    public void abrirArchivoPersonajes(String rutaArchivo) {
        try (BufferedReader lector = new BufferedReader(new FileReader(rutaArchivo))){
            String linea;

            while ((linea = lector.readLine()) != null) {
                try {

                    String[] datos = linea.split(",");
                    String tipo = datos[0];
                    if (tipo.trim().equalsIgnoreCase("Maestro")) {
                        String elemento = datos[1].trim();
                        String nombre = datos[2].trim();
                        String nacion = datos[3].trim();
                        String genero = datos[4].trim();
                        int edad = Integer.parseInt(datos[5].trim());
                        int energia = Integer.parseInt(datos[6].trim());
                        int nivelDominio = Integer.parseInt(datos[7].trim());

                        if (energia < 0) throw new EnergiaNegativaException();

                        MaestroUnElemento maestro = switch (elemento) {
                            case "Agua" -> new CiudadanoAgua(nombre, nacion, genero, edad, nivelDominio, energia);
                            case "Tierra" -> new CiudadanoTierra(nombre, nacion, genero, edad, nivelDominio, energia);
                            case "Fuego" -> new CiudadanoFuego(nombre, nacion, genero, edad, nivelDominio, energia);
                            case "Viento" -> new CiudadanoViento(nombre, nacion, genero, edad, nivelDominio, energia);
                            default -> null;
                        };

                        if (maestro != null)  {
                            personajes.add(maestro);
                            vista.mostrarCadena("Personaje cargado: " + nombre);
                        }
                    } else if((tipo.trim().equalsIgnoreCase("Avatar"))) {
                        String nombre = datos[2].trim();
                        String nacion = datos[3].trim();
                        String genero = datos[4].trim();
                        int edad = Integer.parseInt(datos[5].trim());
                        int energia = Integer.parseInt(datos[6].trim());

                        if (energia < 0) throw new EnergiaNegativaException();

                        personajes.add(new Avatar(nombre, nacion, genero, edad, energia));
                        vista.mostrarCadena("Personaje cargado: " + nombre);

                    } else {
                        String nombre = datos[1];
                        String nacion = datos[2];
                        String genero = datos[3];
                        int edad = Integer.parseInt(datos[4]);
                        int energia = Integer.parseInt(datos[5]);
                        if (energia < 0) {
                            throw new EnergiaNegativaException();
                        }

                        personajes.add(new Guerrero(nombre, nacion, genero, edad, energia));
                        vista.mostrarCadena("Personaje cargado: " + nombre);
                    }


                } catch (EnergiaNegativaException e) {
                    vista.mostrarCadena("Error: " + e.getMessage());
                }

            }

            vista.mostrarCadena("Carga de personajes completa");

        } catch (IOException e) {
            vista.mostrarCadena("Error de entrada y salida: " + e.getMessage());
        }

    }

    public void mostrarPersonajesCreados() {
        if (personajes.isEmpty()) vista.mostrarCadena("No hay personajes cargados");
        else vista.mostrarPersonajes(personajes);
    }

    public void atacarConUnPersonaje(String nombrePersonaje) {
        Personaje personajeAEncontrar = buscarPersonaje(nombrePersonaje);
        if (personajeAEncontrar == null) {
            vista.mostrarCadena("No se encontró ningun personaje con el nombre " + nombrePersonaje);
            return;
        }


        if (personajeAEncontrar instanceof MaestroUnElemento maestro) {
            try {
                maestro.atacar();
            } catch (EnergiaInsuficienteException e) {
                vista.mostrarCadena(e.getMessage());
            }
        } else if (personajeAEncontrar instanceof Guerrero guerrero){
            try {
                guerrero.atacar();
            } catch (EnergiaInsuficienteException e) {
                vista.mostrarCadena(e.getMessage());
            }
        } else if (personajeAEncontrar instanceof Avatar avatar) {
            try {
                avatar.atacar();
            } catch (EnergiaInsuficienteException e) {
                vista.mostrarCadena(e.getMessage());
            }
        }
    }

    public Personaje buscarPersonaje(String nombrePersonaje) {
        Personaje personajeABuscar = null;
        for (Personaje personajeActual : personajes) {
            if (personajeActual.getNombre().equalsIgnoreCase(nombrePersonaje)) {
                personajeABuscar = personajeActual;
                return personajeABuscar;
            }
        }


        return personajeABuscar;

    }
}
