package fr.umontpellier.iut.exercice1;
import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        FizzBuzz principal;
        principal = new FizzBuzz();

        Scanner saisie = new Scanner(System.in);

        System.out.println("Veuillez saisir la taille de votre chaine FizzBuzz :");
        int i = saisie.nextInt();

        System.out.println("\n"+principal.toString(i));
    }

}
