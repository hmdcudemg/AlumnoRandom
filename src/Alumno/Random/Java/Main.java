package Alumno.Random.Java;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by DEMG on 25/02/2017.
 */
public class Main {
    public static void main(String[] args) {
        alumnoAleatorio();
    }

    private static void alumnoAleatorio() {
        Random rnd = new Random();
        Scanner snd = new Scanner(System.in);
        System.out.println("Introduce un numero de Alumnos?");
        int numAlumnos = snd.nextInt();

        int opc = 1;

        do {
            System.out.println("1.-Generar Número Aleatorio\n2.-Presiona \"0\" para terminar");
            opc = snd.nextInt();

            if (opc == 1) {
                System.out.println("\n Numero Aleatorio= " + (int) (Math.random() * numAlumnos + 1) + " \n");
            }
        } while (opc != 0);
    }
}
