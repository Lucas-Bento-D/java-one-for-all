package academy.bentodev.javaoneforall.NIO.Test;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class BasicFileAttributesTest02 {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Path anotherFile = Paths.get("pasta/novo_path.txt");
        try{
            BasicFileAttributes bFA = Files.readAttributes(anotherFile, BasicFileAttributes.class);
            FileTime creationTime =  bFA.creationTime();
            FileTime lastModified = bFA.lastModifiedTime();
            FileTime lastAccessTime = bFA.lastAccessTime();

            System.out.println("creationTime: " + creationTime);
            System.out.println("lastModified: " + lastModified);
            System.out.println("lastAccessTime: " + lastAccessTime);

            BasicFileAttributeView atributeView = Files.getFileAttributeView(anotherFile, BasicFileAttributeView.class);
            FileTime fileTimeMillis = FileTime.fromMillis(System.currentTimeMillis());

            atributeView.setTimes(lastModified, fileTimeMillis, creationTime);

            creationTime =  atributeView.readAttributes().creationTime();
            lastModified = atributeView.readAttributes().lastModifiedTime();
            lastAccessTime = atributeView.readAttributes().lastAccessTime();
            System.out.println("--------------------------------------------------");
            System.out.println("creationTime: " + creationTime);
            System.out.println("lastModified: " + lastModified);
            System.out.println("lastAccessTime: " + lastAccessTime);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
