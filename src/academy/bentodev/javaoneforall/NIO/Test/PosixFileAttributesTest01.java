package academy.bentodev.javaoneforall.NIO.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.*;
import java.util.Set;

/**
 * Exemplo focado na troca de permissões de um arquivo , usando a classe posixFileAttributes, posixFileAttributeView e PosixFilePermissions
 */
public class PosixFileAttributesTest01 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("/home/lucas-bento/file.txt");
        PosixFileAttributes pFA = Files.readAttributes(path, PosixFileAttributes.class);
        System.out.println(pFA.permissions());

        PosixFileAttributeView fileAttributeViewPosix = Files.getFileAttributeView(path, PosixFileAttributeView.class);
        Set<PosixFilePermission> posixPermissions = PosixFilePermissions.fromString("rw-r-----");

        fileAttributeViewPosix.setPermissions(posixPermissions);
        System.out.println(fileAttributeViewPosix.readAttributes().permissions());
    }
}
