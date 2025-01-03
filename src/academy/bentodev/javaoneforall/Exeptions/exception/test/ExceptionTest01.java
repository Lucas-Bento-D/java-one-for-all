package academy.bentodev.javaoneforall.Exeptions.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {
        createNewFile();
    }
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
