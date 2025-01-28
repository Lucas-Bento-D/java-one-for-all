package academy.bentodev.javaoneforall.NIO.Test;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipOutputStreamTest01 {
    public static void main(String[] args) {
        Path zipFile = Paths.get("pasta/arquivo.zip");
        Path zipDir = Paths.get("pasta/subpasta1/subsubpasta2");
        zip(zipFile, zipDir);
    }

    private static void zip(Path fileZip, Path filesToZip){
        try(ZipOutputStream zipStream = new ZipOutputStream(Files.newOutputStream(fileZip));
            DirectoryStream<Path>stream = Files.newDirectoryStream(filesToZip)){

            for (Path file: stream ){
                ZipEntry zipEntry = new ZipEntry(file.getFileName().toString());
                zipStream.putNextEntry(zipEntry);
                Files.copy(file, zipStream);
                zipStream.closeEntry();
            }
            System.out.println("zipado com sucesso");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
