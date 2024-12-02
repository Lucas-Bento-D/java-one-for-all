package academy.bentodev.javaoneforall.pooClass.Enumeration.domain;

public class Client {
    private String name;
    private ClientType clientType;

    public Client(String name, ClientType clientType){
        this.name = name;
        this.clientType = clientType;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", clientType=" + clientType +
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
