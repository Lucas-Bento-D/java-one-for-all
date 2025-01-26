package academy.bentodev.javaoneforall.NIO.Test;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributes;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.PosixFileAttributes;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class BasicFileAttributesTest01 {
    /**
     * O objetivo deste exemplo é especificar o uso do método setLastModified que altera a data da ultima modificaçã do arquivo
     * Como podemos ver, usamos tanto o jeito antigo com a classe File quanto o novo com Path, Paths, Files e FileTime
     * @param args
     */
    public static void main(String[] args) {
//        BasicFileAttributes, DosFileAttributes, PosixFileAttributes
        LocalDateTime date = LocalDateTime.now().minusDays(10);

        /**
         * Trabalhando com a classe File, mudamos a data de modificaão de um arquivo.
         */

        File file = new File("pasta/novo.txt");
        try{
            boolean isCreated = file.createNewFile();
            /**
             * date.toInstant(ZoneOffset.UTC) -> traz a data com os milisegundos
             * date.toInstant(ZoneOffset.UTC).toEpochMili() traz a data em milisegundos(tipo long)
             */
            long longDate = date.toInstant(ZoneOffset.UTC).toEpochMilli();
            boolean isModified = file.setLastModified(longDate);
            System.out.println(isModified);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        /**
         * Trabalhando com as classes Path, Paths, FileTime e Files para inserir uma data de modificação
         */

        Path anotherFile = Paths.get("pasta/novo_path.txt");
        try{
            Path createAnotherFile = Files.createFile(anotherFile);
            FileTime fileTime = FileTime.from(date.toInstant(ZoneOffset.UTC));
            boolean isCreatedAnotherFile = Files.exists(createAnotherFile);
            Files.setLastModifiedTime(createAnotherFile, fileTime);
            System.out.println(Files.isReadable(createAnotherFile));
            System.out.println(Files.isWritable(createAnotherFile));
            System.out.println(Files.isExecutable(createAnotherFile));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
