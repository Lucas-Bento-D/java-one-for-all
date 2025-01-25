package academy.bentodev.javaoneforall.IO.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * File -> TRabalha com arquivo em si
 * FileWriter -> Escreve em um arquivo, mas não é otimizada, pois é baixo nivel
 * FileReader -> Le um arquivo, mas não é otimizada, pois é baixo nivel
 * BufferedWriter -> Escrita em um arquivo, mas de uma forma otimizada, trabalhando com dados em memoria
 * BufferedReader -> Le um arquivo, mas de uma forma otimizada, trabalhando com dados em memoria
 */
public class FileWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");

        /**
         * Quando abrimos FileWriter, precisamos fecha-la para n'ao ficar alocando recursos em memoria, para isso podemos
         * utilizar o metodo .close() ou usar o try com recursos, setando a criacao do construtor para ele fechar assim
         * que passar pelo try.
         * Vale lembrar que para isso da certo, a classe precisa ser closeable ou ser filha de closeable para fechar.
         * Nesse caso FileWriter é um OutputStreamWriter e OutputStreamWriter é um Writer e um Writer é um Closeable.
         *
         * o construtor FileWriter é sobrecarregado e pode receber um parametro chamado append que é um boolean, se ele
         * for true, ele vai pegar a string do metodo write e concatenar com oque já exista no arquivo
         */
        try(FileWriter fW = new FileWriter(file, true)){
            fW.write("O devDojo e bom sim viu");

            fW.flush(); // metodo usado para forçar a escrita imediata de qualquer saída de caracteres
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
