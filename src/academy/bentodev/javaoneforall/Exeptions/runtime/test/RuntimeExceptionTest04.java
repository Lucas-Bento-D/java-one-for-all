package academy.bentodev.javaoneforall.Exeptions.runtime.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class RuntimeExceptionTest04 {
    /**
     * Podemos capturar multiplas exeções em um try catch simplesmente adicionando varios catches, isso é ultil para
     * tratar por exemplo a consulta em uma api, onde o consultor pode ter varios erros de entrada.
     * Quando o catch for usado varias vezes,  e acontecer um erro no try, o código irá executar o bloco catch que mais
     * se adeque ao erro. Caso o erro que aconteça não esteja em um catch especifico criado, podemos criar um catch de erro mais
     * generico, como o RuntimeException por exemplo, mas lembre-se a lógica deve ser classes de erros especificas primeiro
     * depois classes mais genericas, pois o erro generico irá anular as classes mais especializadas.
     * @param args
     */
    public static void main(String[] args) {
        try{
            throw new IllegalArgumentException();
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Dentro de ArrayIndexOutOfBoundsException");
        }catch (IndexOutOfBoundsException e){
            System.out.println("Dentro de IndexOutOfBoundsException");
        } catch (IllegalArgumentException e) {
            System.out.println("Dentro de IllegalArgumentException");
        } catch (ArithmeticException e) {
            System.out.println("Dentro de ArithmeticException");
        } catch (RuntimeException e) {
            System.out.println("Dentro de RuntimeException");
        }

        /**
         * Caso tivermos tipos de erros que tenham a mesma linha de herança, mas não sendo nenhum mais generico que o outro
         * podemos utilizar um catch para varios erros utilizando o pipe. Caso utilizarmos o catch com classes mais genericas
         * e classes mais especializadas, teremos um erro por que a classe generica irá sempre ativar antes da especializada.
         * Ou seja, não podemos utilizar o RuntimeException junto com o IllegalArgumentException, pois o RuntimeException
         * sempre irá ser ativado e Illegal não.
         */
        try{
            maybeThrowsError();
        } catch (SQLException | FileNotFoundException e) {
            System.out.println("um erro ou outro");
        }
    }
    private static void maybeThrowsError() throws SQLException, FileNotFoundException {

    }
}
