package academy.bentodev.javaoneforall.conditionalStructs;

public class ConditionalStructures03 {
    public static void main(String[] args) {
        double salary = 6000;
        String messageDonate = "Eu vou doar 500 reais";
        String messageNotDonate = "Vou doar não!";
        // Ternary -> conditional ? true option : false option
        String messageResolve = salary >= 5000 ? messageDonate : messageNotDonate;
        System.out.println(messageResolve);
    }
}
