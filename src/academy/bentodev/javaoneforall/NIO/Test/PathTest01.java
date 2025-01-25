package academy.bentodev.javaoneforall.NIO.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest01 {
        /**
         * A classe Path também trabalha com arquivos e tem alguns métodos que como feito no exemplo, pode pegar o caminho
         * de um arquivo.
         */
    public static void main(String[] args) {
        Path p1 = Paths.get("/home/lucas-bento/Development/Personal/java-one-for-all/files.txt");
        System.out.println(p1.getFileName().toFile().toPath());
    }
}
