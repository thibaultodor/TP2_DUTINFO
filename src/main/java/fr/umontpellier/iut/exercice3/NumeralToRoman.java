package fr.umontpellier.iut.exercice3;

class NumeralToRoman {

    public String getRoman(int number){
        String somme = "";
        int reste = number;

        while (reste != 0) {
            if (number == 1 || number == 2 || number == 3) {
                somme = somme + "I";
                reste = reste - 1;
            }
            if (number == 5) {
                return "V";
            }
            if (number == 10) {
                return "X";
            }
            if (number == 50) {
                return "L";
            }
            if (number == 100) {
                return "C";
            }
            if (number == 500) {
                return "D";
            }
            if (number == 1000) {
                return "M";
            }
        }
        return  somme;
    }
}
