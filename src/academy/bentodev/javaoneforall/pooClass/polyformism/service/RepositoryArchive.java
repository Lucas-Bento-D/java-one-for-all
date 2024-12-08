package academy.bentodev.javaoneforall.pooClass.polyformism.service;

import academy.bentodev.javaoneforall.pooClass.polyformism.repository.Repository;

public class RepositoryArchive implements Repository {
    @Override
    public void save(){
        System.out.println("Salvando o arquivo");
    }
}
