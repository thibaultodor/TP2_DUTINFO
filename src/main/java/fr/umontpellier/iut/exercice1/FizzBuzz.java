package fr.umontpellier.iut.exercice1;

public class FizzBuzz {

    public String getValue(int i) {
        if (i%15 == 0){
            return("FizzBuzz");
        }
        if (i%5==0){
            return("Buzz");
        }
        if (i%3==0){
            return("Fizz");
        }
        return ""+i;    // Retourne valeur de i en string.
    }

    public String[] computeList(int i) {
        int t = 0;
        String[] a = new String[i];
        while(t<i) {
            a[t] = getValue(t+1);
            t++;
        }
        return a;
    }

    public String toString(int i){
        String res = ("");
        for(int b=0;b<this.computeList(i).length;b++){
            res = res + this.computeList(i)[b] + " ";
        }
        return res;
    }
}