package academy.bentodev.javaoneforall.IO.Test;

import java.io.File;
import java.io.FileReader;

public class FileReaderTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");

        try(FileReader fR = new FileReader(file)){
//            char[] in = new char[1];
//            System.out.println(fR.read(in));
            int i;
            while ((i= fR.read()) != -1){
                System.out.print((char)i);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
