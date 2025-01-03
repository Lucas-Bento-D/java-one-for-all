package academy.bentodev.javaoneforall.Exeptions.runtime.test;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {

        /**
         * O tratamento de erros é necessário para um código consistente e efeciente.
         * Como visto na linha 20, com base em alguma lógica, podemos lançar um erro(nesse caso: um erro de argumento).
         * nas linhas 12-16, nós fazemos o try catch que basicamente tenta uma lógica e se ela não der certo, retorna um erro,
         * porem, sem travar a aplicação na linha do erro.
         * Vale lembrar que erros do tipo runtime tem tratamentos opcionais, pois o programa irá compilar, mas o correto é
         * sempre tratar o erro.
         */

        try{
            division(1, 0);
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        System.out.println("O tratamento de erro é muito importante para a programação");
    }
    private static int division(int num1, int num2){


        /**
         * o erro lançado na linha 28, é um unchecked error, pois ele não acontece no tempo de compilação
         */
        // Aqui estamos lançando um erro de argumento ilegal caso o num2 for 0
        if(num2==0) throw new IllegalArgumentException("Argumento invalido! Divisão por 0 é uma divisão invalida");

        return num1/num2;
    }
}
