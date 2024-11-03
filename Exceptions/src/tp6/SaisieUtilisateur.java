package tp6;

import java.util.Scanner;
import java.util.InputMismatchException;

public class SaisieUtilisateur {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez entrer un nombre à virgule flottante :");

        try {
            float nombre = scanner.nextFloat();
            System.out.println("Vous avez entré : " + nombre);
        } catch (InputMismatchException e) {
            System.out.println("Erreur : Vous n'avez pas entré un nombre valide.");
        } finally {
            scanner.close();
        }
    }
}

