package academy.bentodev.javaoneforall.Exeptions.runtime.test;

public class RuntimeExceptionTest03 {
    public static void main(String[] args) {
         openConection();
    }
    private static String openConection(){
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no arquivo");
            return "Conexão aberta";
        } catch (Exception e) {
            throw new RuntimeException(e);
        }finally {
            /**
             * Bloco finally é um bloco do try catch que sempre sera executado, independente de acontecer erro ou não.
             */
            System.out.println("Fehcando recurso liverado pelo SO");
        }

    }
}
