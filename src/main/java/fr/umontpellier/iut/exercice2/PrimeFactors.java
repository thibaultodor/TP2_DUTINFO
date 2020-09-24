package fr.umontpellier.iut.exercice2;

import java.util.List;
import java.util.ArrayList;

public class PrimeFactors {
    public List<Integer> computeFactors(int number) {
        List<Integer> list = new ArrayList<Integer>();
        int [] nbpremier = new int[] {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
        int taille = 0;
        int copie = number;

        if (number == 1){
            return list;
        }

        while (taille < nbpremier.length){
            if (nbpremier[taille] == number) {
                list.add(number);
                return list;
            }
            taille++;
        }   //On verifie si le nombre n'est pas premier a l'aide du tableau.

        taille=0;

        while (copie != 1) {
            if (copie%nbpremier[taille] == 0){
                list.add(nbpremier[taille]);
                copie = copie / nbpremier[taille];
                taille = 0;
            }
            else{
                taille++;
            }
        }
        return list;
    }
}
