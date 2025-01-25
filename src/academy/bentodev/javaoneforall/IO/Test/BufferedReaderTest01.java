package academy.bentodev.javaoneforall.IO.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * BufferedReader segue a mesma ideia de BufferedWriter, trabalha igual ao FileReader, porem tem foco em performance e metodos novos
 */

public class BufferedReaderTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");

        try(FileReader fR = new FileReader(file);
            BufferedReader bR = new BufferedReader(fR)){
            String line;
            while((line = bR.readLine()) != null){
                System.out.println(line);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
