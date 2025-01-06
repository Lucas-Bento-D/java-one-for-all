package academy.bentodev.javaoneforall.Exeptions.runtime.test;

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
    }
}
