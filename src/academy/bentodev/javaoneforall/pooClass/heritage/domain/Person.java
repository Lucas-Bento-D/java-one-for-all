package academy.bentodev.javaoneforall.pooClass.heritage.domain;

public class Person {
    private String name;
    private String cpf;
    private Address address;

//    public Person(String name, String cpf){
//        this.name = name;
//        this.cpf = cpf;
//    }
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
