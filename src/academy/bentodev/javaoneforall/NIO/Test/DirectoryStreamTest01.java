package academy.bentodev.javaoneforall.NIO.Test;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Com a classe DirectoryStream, listamos todos os arquivos de um path especifico
 */

public class DirectoryStreamTest01 {
    public static void main(String[] args) {
        Path dir = Paths.get(".");
        try(DirectoryStream<Path> stream = Files.newDirectoryStream(dir)){
            for (Path path: stream){
                System.out.println(path.getFileName().toString());
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
