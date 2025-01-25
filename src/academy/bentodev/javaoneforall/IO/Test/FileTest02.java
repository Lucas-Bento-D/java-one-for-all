package academy.bentodev.javaoneforall.IO.Test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) throws IOException {
        File dir = new File("teste");
        boolean isCreated = dir.mkdir(); // metodo para criar diretorio
        System.out.println(isCreated);

        File fileDir = new File(dir, "arquivoTeste.txt");
        boolean fileCreated = fileDir.createNewFile();
        System.out.println(fileCreated);

        File renameFileDir = new File(dir,"arquivoTeste_renomeado.txt");
        boolean isrenamed = fileDir.renameTo(renameFileDir); // metdo para renomar arquivos
        System.out.println(isrenamed);

        File renameDir = new File("new_teste");
        boolean isRenamedDir = dir.renameTo(renameDir);
        System.out.println(isRenamedDir);

    }

}
