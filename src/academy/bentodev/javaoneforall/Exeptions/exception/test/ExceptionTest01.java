package academy.bentodev.javaoneforall.Exeptions.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {
        createNewFile();
    }

    /**
     * Sobre o tratamento de try/catch, nós podemos jogar a responsabilidade para quem estiver utilizando essa função
     * para isso podemos ussar "throws IOException" por exemplo para especificar que a função poderá retornar um erro.
     * Trazendo isso pro nosso uso atual, poderiamos utilizar o termo para createNewFile e a função main iria precisar
     * tratar caso desse erro, ou seja, o tratamento seria responsabilidade de main.
     */
    private static void createNewFile(){
        File file = new File("archive/test.txt");
        try{
            boolean isCreated = file.createNewFile();
            System.out.println(isCreated);
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
