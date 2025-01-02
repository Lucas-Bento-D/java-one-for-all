package academy.bentodev.javaoneforall.Exeptions.test;

/**
 * O StackOverflow error é um erro onde o código estoura a stack da aplicação por chamar demais algum método.
 * De modo geral, error é algo que acontece na JVM que não conseguimos recuperar no tempo de execução, tendo como unica
 * alternativa parar a execução para resolução do problema.
 */

public class StackOverFlowError01 {
    public static void main(String[] args) {
        recurvetion();
    }
    public static void recurvetion(){
        recurvetion();
    }
}
