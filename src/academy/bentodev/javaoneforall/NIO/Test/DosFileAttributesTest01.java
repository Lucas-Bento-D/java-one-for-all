package academy.bentodev.javaoneforall.NIO.Test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;
import java.nio.file.attribute.FileAttributeView;

public class DosFileAttributesTest01 {
    public static void main(String[] args) {
        Path path = Paths.get("pasta/teste.txt");
        try{
            if(Files.notExists(path)) Files.createFile(path);
            Files.setAttribute(path, "dos:hidden", true);
            Files.setAttribute(path, "dos:readonly", true);
            DosFileAttributes teste = Files.readAttributes(path, DosFileAttributes.class);
            System.out.println(teste.isHidden());
            System.out.println(teste.isReadOnly());

            DosFileAttributeView fileAttributeView = Files.getFileAttributeView(path, DosFileAttributeView.class);
            fileAttributeView.setHidden(false); // tamb[em seta o arquivo como hidden
            System.out.println(teste);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
