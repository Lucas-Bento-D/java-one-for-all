package academy.bentodev.javaoneforall.pooClass.polyformism.test;

import academy.bentodev.javaoneforall.pooClass.polyformism.repository.Repository;
import academy.bentodev.javaoneforall.pooClass.polyformism.service.DBRepository;

/**
 * Esse caso foi escrito para exemplificar que um código orientado a interfaces, pode ser melhor para manutenção.
 * ao tipar dbrepo como Repository(interface), consigo instanciar qualquer uma das classes que implementam essa interface,
 * trazendo para o código um jeito mais fácil de mudar a instancia, pois o metodo save poderá ser acessado por qualquer uma das classes
 * mas sem precisar necessariamente mudar a tipagem já que Repository é instanciado em todas as outras classes.
 */
public class RepositoryTest {
    public static void main(String[] args) {
        DBRepository dbrepo = new DBRepository();
        dbrepo.save();
    }
}
