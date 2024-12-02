package academy.bentodev.javaoneforall.pooClass.Enumeration.domain;

/**
 * Usamos enumeração quando queremos que algo seja tipado por uma escolha ou outra
 * Nosso exemplo foi o tipo de cliente, tendo opção de ser pessoa fisica ou juridica
 * com isso, levando para a classe "Client" quando setarmos o "ClientType" ele poderá ser
 * apenas PHISYCAL_PERSON ou JURY_PERSON
 */
public enum ClientType {
    PHISYCAL_PERSON(1, "Pessoa fisica"),
    JURY_PERSON(2, "Pessoa juridica");
    /**
     * Com base na escolha do tipo do enum, conseguimos setar um valor a mais
     * nesse caso, setamos "value" 1 ou 2 dependendo da escolha do parametro do "ClientType"
     * isso deixa o código mais intuitivo e é uma boa pratica.
     * esse valor a mais que setamos com a escolha de parametro pode ser acessado também pela classe que está utilizando o enum
     */
    private final int VALUE;
    private final String RELATORY_NAME;

    ClientType(int value, String relatoryName){
        this.RELATORY_NAME = relatoryName;
        this.VALUE = value;
    }

    public int getVALUE() {
        return VALUE;
    }
    public String getRELATORY_NAME(){
        return RELATORY_NAME;
    }
}
