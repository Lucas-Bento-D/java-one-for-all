package academy.bentodev.javaoneforall.pooClass.heritage.domain;

public class Person {
//    o modificador de acesso 'protected' dá acesso as variaveis
    // dentro da propria classe, pelas classes do mesmo pacote e pelas classes filhas também
    // ou seja, para a classe Employee, as propriedades protegidas são acessiveis, pois essa é uma classe filha de Person
    // assim como é acessivel para Address, pois esta no mesmo pacote
    protected String name;
    protected String cpf;
    protected Address address;

    public Person(String name, String cpf){
        this.name = name;
        this.cpf = cpf;
    }
    public void print(){
        System.out.println(this.name);
        System.out.println(this.cpf);
        if(address == null) return;
        System.out.println(this.address.getStreet());
        System.out.println(this.address.getCep());
    }
    public void setAddress(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
