package academy.bentodev.javaoneforall.pooClass.constructors.domain;

public class Car {
    private String model;
    private String brand;
    private String color;

    // Tempos a possibilidade de setar uma função como construtor, exemplo:
    // public Car(){}
    // Caso essa função não seja setada por nós, o java irá fazer pro traz dos panos, para termos a classe como construtor
    // Contrutores não tem retorno, se tiver, vira um método
    // Contrutores são boas opções para classes, pois podemos iniciar uma classe setando alguma propriedade de forma obrigátoria
    // Se houver propriedades que sejam importantes e necessarias para a classe, é muito mais interessante iniciarmos setando os parametros no construtor, tirando a necessidade de uma função 'init'
    public Car(String model, String brand, String color){
        // Se quisermos, podemos chamar um construtor dentro da propria classe, e para isso, fazemos referencia a ele com a palavra reservada 'this'
        // ou seja:
        this();
        // this de construtor só pode ser usado dentro de construtores e precisa está na primeira linha(executavel) do construtor

        this.model = model;
        this.brand = brand;
        this.color = color;
    }

    // Podemos usar sobrecarga com construtores, bastando estruturar sem os parametros
    public Car(){
        System.out.println("dentro do this");
    }

    public void print(){
        System.out.println(this.model);
        System.out.println(this.brand);
        System.out.println(this.color);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}
