package academy.bentodev.javaoneforall.String.Test;

public class StringPerformanceTest {
    public static void main(String[] args) {
        long init = System.currentTimeMillis();
        concatStringBuilder(100_000);
        long end = System.currentTimeMillis();

        System.out.println("tempo gasto para string " + (end - init) + "ms");
    }

    /**
     * TRabalhar com string pode ser um pouco complicado a nivel de performance depdendo caso, então a
     * nivel de performance temos: StringBuilder > StringBuffer > String
     * Entretanto o uso das classes depende da demanda do projeto e regras de negocio, então com nosso conhecimento atual, sempre utilizaremos
     * a classe String, mesmo sendo a menos performática(decisão tomada com base no não gerenciamento de micro performances, visto que
     * seria uma adição de complexidade desnecessaria).
     * @param size
     */
    private static void concatStringBuilder(int size){
        StringBuilder text = new StringBuilder(size);
        for (int i = 0; i < size; i++) {
            text.append(i);
        }
    }

    private static void concatStringBuffer(int size){
        StringBuffer text = new StringBuffer(size);
        for (int i = 0; i < size; i++) {
            text.append(i);
        }
    }

    private static void concatString(int size){
        String text = "";
        for (int i = 0; i < size; i++) {
            text += i;
        }
    }
}
