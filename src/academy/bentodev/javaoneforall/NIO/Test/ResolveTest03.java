package academy.bentodev.javaoneforall.NIO.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ResolveTest03 {
    /**
     * "home/lucas/dev" - caminho relativo
     * "/home/lucas/dev" - caminho absoluto
     * @param args
     */
    public static void main(String[] args) {
        Path relativeDir = Paths.get("home/lucas");
        Path file = Paths.get("dev/arquivo.txt");
        Path resolve = relativeDir.resolve(file); // o método resolve pode ser usado para juntar os paths, mas ele não é muito inteligente, então é importante usar com cuidado
        System.out.println(resolve);

        Path absolutePath = Paths.get("/home/lucas");
        Path anotherRelativePath = Paths.get("dev");

        Paths.get("files.txt");
        /**
         * Um path absuluto resolve com um relativo, porem um relativo não resolve com um absoluto
         */
        System.out.println("1 " + absolutePath.resolve(anotherRelativePath));
        System.out.println("2 " + absolutePath.resolve(file));
        System.out.println("3 " + anotherRelativePath.resolve(absolutePath));
        System.out.println("4 " + anotherRelativePath.resolve(file));
        System.out.println("5 " + file.resolve(absolutePath));
        System.out.println("6 " + file.resolve(anotherRelativePath));
    }
}
