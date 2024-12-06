package academy.bentodev.javaoneforall.pooClass.abstractClasses.domain;

public class Manager extends Employee{
    public Manager(String name, double salary){
        /**
         * Lembre-se: o uso do super, é para fazer referencia a classe pai,
         * nesse caso, diretamente ao construtor "employee"
         */
        super(name, salary);
    }

    @Override
    public void BonusCalc() {
        this.salary = this.salary + this.salary * 0.14;
    }
}
