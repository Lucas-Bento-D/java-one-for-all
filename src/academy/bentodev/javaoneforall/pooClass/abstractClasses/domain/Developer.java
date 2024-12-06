package academy.bentodev.javaoneforall.pooClass.abstractClasses.domain;

public class Developer extends Employee{
    public Developer(String name, double salary){
        super(name, salary);
    }

    /**
     * Mesmo sem chamar o BonusCalc() dentro do construtor de "Developer", ele é executado.
     * Isso se dá pois quando instanciamos developer e com isso acessamos o construtor "Employee"
     * chamamos a função BonusCalc(), entretanto, quem executa essa função, é o construtor "Developer".
     * Já que "Developer" está sobreescrevendo a função em questão, a função executada vai ser a sobreescrita
     * e não a setada em "Employee"
     */
    @Override
    public void BonusCalc(){
        this.salary = this.salary + this.salary * 0.07;
    }

    /**
     * Uma regra importante é: Uma classe abstrata não tem obrigação
     * de cumprir com contrato de instanciar metodos, mas a primeira classe
     * concreta que extender uma abstrata, precisará cumprir.
     */

    public void print(){

    }
}
