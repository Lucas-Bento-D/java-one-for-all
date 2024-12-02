package academy.bentodev.javaoneforall.pooClass.Enumeration.domain;

/**
 * Podemos criar enums dentro da propria classe
 * Mas isso não é uma boa pratica, sendo melhor criar uma classe enum
 * propria pra ele(deixa o código mais limpo)
 */
public class Client {
    private String name;
    private ClientType clientType;
    private PaymentType paymentType;

    public Client(String name, ClientType clientType, PaymentType paymentType){
        this.name = name;
        this.clientType = clientType;
        this.paymentType = paymentType;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", clientType_value=" + clientType.getVALUE() +
                ", clientType=" + clientType.getRELATORY_NAME() +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setClientType(ClientType clientType) {
        this.clientType = clientType;
    }

    public ClientType getClientType() {
        return clientType;
    }
}
