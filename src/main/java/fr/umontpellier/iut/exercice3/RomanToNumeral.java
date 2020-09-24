package fr.umontpellier.iut.exercice3;

public class RomanToNumeral {

    public int getNumeral(String romanNumber) {

        int resultat = 0;
        char chiffreavant = '0';
        char [] nbrm = new char[] {'I','X','C'};
        int j=1;

        for (char chiffre : romanNumber.toCharArray()) {
            j=1;
            if (chiffre == 'I') {
                resultat = resultat + 1;
            }
            if (chiffre == 'V') {
                resultat = resultat + 5;
                for(int i = 0;i<1;i++) {    //Pour les chiffre en dessous de X on verifie que I.
                    if (chiffreavant == nbrm[i]) {
                        resultat = resultat - (2 * j);
                        i = 1;
                    }
                    j = j * 10;
                }
            }

            if (chiffre == 'X') {
                resultat = resultat + 10;
                for(int i = 0;i<1;i++) {
                    if (chiffreavant == nbrm[i]) {
                        resultat = resultat - (2 * j);
                        i = 1;
                    }
                    j = j * 10;
                }
            }
            if (chiffre == 'L') {
                resultat = resultat + 50;
                for(int i = 0;i<2;i++) {    //Pour les chiffre en dessous de C on verifie que I et X.
                    if (chiffreavant == nbrm[i]) {
                        resultat = resultat - (2 * j);
                        i = nbrm.length;
                    }
                    j = j * 10;
                }
            }
            if (chiffre == 'C') {
                resultat = resultat + 100;
                for(int i = 0;i<2;i++) {
                    if (chiffreavant == nbrm[i]) {
                        resultat = resultat - (2 * j);
                        i = nbrm.length;
                    }
                    j = j * 10;
                }
            }
            if (chiffre == 'D') {
                resultat = resultat + 500;
                for(int i = 0;i<nbrm.length;i++) {  //Pour les chiffre en dessous de M on verifie tout le tableau.
                    if (chiffreavant == nbrm[i]) {
                        resultat = resultat - (2 * j);
                        i = nbrm.length;
                    }
                    j = j * 10;
                }
            }
            if (chiffre == 'M') {
                resultat = resultat + 1000;
                for(int i = 0;i<nbrm.length;i++) {
                    if (chiffreavant == nbrm[i]) {
                        resultat = resultat - (2 * j);
                        i = nbrm.length;
                    }
                    j = j * 10;
                }
            }
            chiffreavant = chiffre;
        }
        return resultat;
    }
}
