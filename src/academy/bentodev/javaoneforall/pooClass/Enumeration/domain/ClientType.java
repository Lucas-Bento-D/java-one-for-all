package academy.bentodev.javaoneforall.pooClass.Enumeration.domain;

/**
 * Usamos enumeração quando queremos que algo seja tipado por uma escolha ou outra
 * Nosso exemplo foi o tipo de cliente, tendo opção de ser pessoa fisica ou juridica
 * com isso, levando para a classe "Client" quando setarmos o "ClientType" ele poderá ser
 * apenas PHISYCAL_PERSON ou JURY_PERSON
 */
public enum ClientType {
    PHISYCAL_PERSON,
    JURY_PERSON
}
