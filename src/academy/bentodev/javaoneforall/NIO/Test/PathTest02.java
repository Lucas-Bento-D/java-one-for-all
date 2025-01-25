package academy.bentodev.javaoneforall.NIO.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathTest02 {
    /**
     * Como vemos nesse exemplo, podemos dizer que a classe File foi substituida pelo conjunto Path, Paths e Files.
     * Isso acontece em nome da coesão do código, pois para ser mais organizado, dividiu a responsabilidade da criação de
     * arquivos, manipulação e get de informações de caminho.
     * Isso deixa o código um pouco mais complexo por usarmos mais coisa, mas é uma alternativa mais moderna e segue melhor o
     * paradigma de responsabilidade unica so SOLID.
     * @param args
     */
    public static void main(String[] args) {
        Path dir = Paths.get("pasta");
        try {
            if(Files.notExists(dir)){
                System.out.println("nao existe");
                Path fileDir = Files.createDirectory(dir);
            }else{
                System.out.println("existe");
            }
            Path newDir = Paths.get("pasta/filhodepasta/netodepasta");
            Path isCreatedNewDir = Files.createDirectories(newDir);
            Path filePath = Paths.get(newDir.toString(), "teste.txt");

            if(Files.notExists(filePath)) Files.createFile(filePath);

            Path source = filePath;
            Path target = Paths.get(newDir.toString(), "renamed_test.txt");
            Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
