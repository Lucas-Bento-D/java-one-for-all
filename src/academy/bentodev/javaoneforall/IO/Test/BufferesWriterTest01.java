package academy.bentodev.javaoneforall.IO.Test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * A classe BufferedWriter é indicada para trabalhar com grandes arquivos, pois tem foco em performance.
 * Essa performance é explicada pelo jeito que a classe escreve em um arquivo, tendo a escrita primeiro na memoria, depois
 * inserindo ela no disco.
 */
public class BufferesWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");

        /**
         * Enquanto a classe FileWriter recebe um File como parametro, a BufferedWriter recebe um FileWriter.
         * Vale lembrar que do mesmo jeito que FileWriter, a BufferedFileWriter precisa fechar para n'ao continuar alocando
         * espaco em memoria, entao podemos usar o try com recursos para ela tambem
         */
        try(FileWriter fW = new FileWriter(file, true);
            BufferedWriter bW = new BufferedWriter(fW)){
            bW.newLine(); // metodo que adiciona uma linha nova no texto, baseado em cada sistema operacional
            bW.write("O devDojo e bom sim viu2");
            bW.flush(); // metodo usado para forçar a escrita imediata de qualquer saída de caracteres
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
