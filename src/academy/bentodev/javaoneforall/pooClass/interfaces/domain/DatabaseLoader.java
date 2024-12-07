package academy.bentodev.javaoneforall.pooClass.interfaces.domain;

/**
 * quando queremos estender uma interface para uma classe, nós não usamos o termo "extends" como de costume,
 * utilizamos o termo "implements", ou seja, não estamos extendendo, e sim implementando na classe.
 * uma interface tem um comportamento parecido com a classe abstrata, tendo um "contrato" a ser seguido, ou seja,
 * se tivermos um metodo setado na interface, quando implementarmos ela, precisaremos estrutura-lo como forma de cumprir esse contrato
 */
public class DatabaseLoader implements DataLoader{
    @Override
    public void load(){
        System.out.println("carregando dados");
    }
}
