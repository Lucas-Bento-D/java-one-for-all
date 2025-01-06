package academy.bentodev.javaoneforall.Exeptions.exception.domain;

import java.io.FileNotFoundException;

public class Person {
    public void save() throws InvalidLoginException, FileNotFoundException{
        System.out.println("Salvando perssoa");
    }
}
