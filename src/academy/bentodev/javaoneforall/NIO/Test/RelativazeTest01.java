package academy.bentodev.javaoneforall.NIO.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativazeTest01 {

    /**
     *
     * @param args
     */

    public static void main(String[] args) {
        Path dir = Paths.get("/home/lucas");
        Path clazz = Paths.get("/home/lucas/devdojo/HelloWorld.java");
        Path pathToClazz = dir.relativize(clazz); // método basicamete te dá o caminho com base no seu diretorio que chama ele até um novo diretorio que é inserido como parametro
        System.out.println(pathToClazz);

        Path newAbsolutePath = Paths.get("/home/lucas");
        Path localAbsolutePath = Paths.get("/usr/local");
        Path devDojoAbsltPath = Paths.get("/home/lucas/devdojo/HelloWorld.java");
        Path r1 = Paths.get("temp");
        Path r2 = Paths.get("temp/temp.1341");

        System.out.println("1 "+newAbsolutePath.relativize(devDojoAbsltPath));
        System.out.println("2 "+devDojoAbsltPath.relativize(newAbsolutePath));
        System.out.println("3 "+newAbsolutePath.relativize(localAbsolutePath));
        System.out.println("4 "+r1.relativize(r2));
        System.out.println("5 "+newAbsolutePath.relativize(r1));
    }
}
