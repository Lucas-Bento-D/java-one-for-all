package academy.bentodev.javaoneforall.NIO.Test;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class ListAllFiles extends SimpleFileVisitor<Path>{
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
        System.out.println(file.getFileName());
        return FileVisitResult.CONTINUE;
    }

    //método que é executado um momento antes da visita ao arquivo e retorna um FileVisitResult
    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        System.out.println("pre visit: " + dir.getFileName());
        return FileVisitResult.CONTINUE;
    }

    //método que é executado se a visita a um arquivo falhar e retorna um FileVisitResult
    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
        return super.visitFileFailed(file, exc);
    }

    //método que é executado após a visita ao arquivo e retorna um FileVisitResult
    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        System.out.println("post visit: " + dir.getFileName());
        return FileVisitResult.CONTINUE;
    }
}

public class SimpleFileVisitorTest02 {
    public static void main(String[] args) throws IOException {
        Path root = Paths.get("./pasta");
        Files.walkFileTree(root, new ListAllFiles());
    }
}
