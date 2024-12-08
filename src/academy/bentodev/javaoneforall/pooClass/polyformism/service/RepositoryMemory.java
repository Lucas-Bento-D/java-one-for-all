package academy.bentodev.javaoneforall.pooClass.polyformism.service;

import academy.bentodev.javaoneforall.pooClass.polyformism.repository.Repository;

public class RepositoryMemory implements Repository {
    @Override
    public void save(){
        System.out.println("Salvando o arquivo em memoria");
    }
}
