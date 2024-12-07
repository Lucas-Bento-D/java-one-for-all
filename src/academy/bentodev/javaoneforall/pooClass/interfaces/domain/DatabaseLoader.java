package academy.bentodev.javaoneforall.pooClass.interfaces.domain;

/**
 * quando queremos estender uma interface para uma classe, nós não usamos o termo "extends" como de costume,
 * utilizamos o termo "implements", ou seja, não estamos extendendo, e sim implementando na classe.
 * uma interface tem um comportamento parecido com a classe abstrata, tendo um "contrato" a ser seguido, ou seja,
 * se tivermos um metodo setado na interface, quando implementarmos ela, precisaremos estrutura-lo como forma de cumprir esse contrato.
 *
 * Diferente do extends, podemos implementar varias interfaces, claro, respeitando o contrato de todas elas
 */
public class DatabaseLoader implements DataLoader, DataRemover{
    @Override
    public void load(){
        System.out.println("carregando dados do banco de dados");
    }
    @Override
    public void remove(){
        System.out.println("Removendo dados do banco de dados");
    }
}
