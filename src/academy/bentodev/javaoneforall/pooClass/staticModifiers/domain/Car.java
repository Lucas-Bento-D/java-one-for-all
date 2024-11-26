package academy.bentodev.javaoneforall.pooClass.staticModifiers.domain;

public class Car {
    private String name;
    private double maxVelocity;
    // Quando uma propridade é setada como static, ela vira uma propriedade da classe em si e não mais da classe instanciada
    // Ou seja: se instanciamos um 'car1' pra classe 'Car' e mudamos a propriedade static, estaremos mudando qualquer outra instancia de 'Car'
    // Sabendo disso, podemos também mudar a prop static chamando diretamente a classe, ou seja: Car.limitVelocity = 12
    // isso mudara o valor da prop para qualquer instancia após isso.
    private static double limitVelocity = 250;

    public Car(String name,  double maxVelocity){
        this.name = name;
        this.maxVelocity = maxVelocity;
    }

    public void print(){
        System.out.println("-------------------------");
        System.out.println(this.name);
        System.out.println(this.maxVelocity);
        // um warning que pegamos é o uso do this para uma prop static, isso acontece, pois 'limitVelocity' é propriedade direta da classe e não da classe instanciada
        // isso se dá, pois quando usamos o this, estamos falando da classe no momento instanciada
        // e quando ela é estatica, ela é da classe geral, pegando em qualquer instancia da classe apresentada.
        // esse warning não impede de usarmos o this, mas não é uma boa pratica
        System.out.println(this.limitVelocity);
        // Usando a classe geral para pegar a propriedade, tiramos o warning
        System.out.println(Car.limitVelocity);
        System.out.println("-------------------------");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setMaxVelocity(double maxVelocity) {
        this.maxVelocity = maxVelocity;
    }

    public double getMaxVelocity() {
        return maxVelocity;
    }

    public void setLimitVelocity(double limitVelocity) {
        this.limitVelocity = limitVelocity;
    }

    public double getLimitVelocity() {
        return limitVelocity;
    }
}
