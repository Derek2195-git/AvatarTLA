package Vista;

import Modelo.Personaje;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Vista {
    private Scanner teclado = new Scanner(System.in);

    public void mostrarMenu() {
        System.out.println("\n -- Avatar: La leyenda de Aang --");
        System.out.println("1. Crear personaje");
        System.out.println("2. Guardar y salir");
        System.out.println("3. Cargar datos de un archivo de texto");
        System.out.println("4. Mostrar personajes");
        System.out.println("5. Hacer que un personaje ataque");
        System.out.println("6. Buscar un personaje a partir de su nombre");
    }

    public void mostrarCadena(String mensaje) {
        System.out.println(mensaje);
    }

    public int leerNumeroEntero(){
        boolean numeroIngresado = false;
        int numeroLeido = 0;
        while (!numeroIngresado) {
            try {
                int numero = teclado.nextInt();
                teclado.nextLine();
                numeroIngresado = true;
                numeroLeido = numero;
            } catch (InputMismatchException e) {
                teclado.nextLine();
                System.out.println("Entrada inválida, escribe un número.");
            }
        }
        return numeroLeido;
    }

    public String leerCadena() {
        return teclado.nextLine();
    }

    public void mostrarPersonajes(ArrayList<Personaje> personajes) {
        personajes.forEach(System.out::println);
    }
}
