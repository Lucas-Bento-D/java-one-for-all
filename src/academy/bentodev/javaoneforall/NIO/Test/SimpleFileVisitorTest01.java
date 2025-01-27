package academy.bentodev.javaoneforall.NIO.Test;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * Exemplo feito para usarmos o metodo walkFileTree e percorrer os arquivos de um diretorio.
 * Vale citar o uso da classe ListAllFiles que extendeu o SompleFileVisitor e com polimorfismo reescreveu a funcao visitFile
 * que retornava um FileVisitResult que é um enum. Nesse caso usamos o CONTINUE
 */
class ListAllFiles extends SimpleFileVisitor<Path>{
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
        boolean isJavaFile = file.getFileName().toString().endsWith(".java");
        if( isJavaFile ) System.out.println(file.getFileName());
        return FileVisitResult.CONTINUE;
    }
}

public class SimpleFileVisitorTest01 {
    public static void main(String[] args) throws IOException {
        Path root = Paths.get(".");
        Files.walkFileTree(root, new ListAllFiles());
    }
}
