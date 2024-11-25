package academy.bentodev.javaoneforall.repetitionStructs;

public class Exercicies {
    public static void main(String[] args) {
        // Print all numbers even up to a milion


        double totalValue = 50000;
        for (int i = 1; i <= totalValue ; i++) {
            double instalmentValue = totalValue/i;
            if(instalmentValue < 1000) break;
            System.out.println("Parcela: " + i + " de " + instalmentValue);
        }
    }
}
