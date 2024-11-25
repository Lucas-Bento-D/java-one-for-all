package academy.bentodev.javaoneforall.primitivetypes;

public class Exercises{
    public static void main(String[] args) {
        String name = "dev";
        String address = "rua do algodão";
        String dateRecieve = "20 de maio de 2024";
        float salary = 1000.92F;

        String phrase = "Eu " + name + ", morando no endereço: " + address + ", confirmo que recebi o salário " + salary + ", na data " + dateRecieve;
        System.out.println(phrase);
    }
}