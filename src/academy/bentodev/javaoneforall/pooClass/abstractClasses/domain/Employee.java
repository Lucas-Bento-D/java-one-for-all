package academy.bentodev.javaoneforall.pooClass.abstractClasses.domain;

/**
 * Para esse caso, percebemos que Employee não fazia sentido, por não ter um
 * cargo especifico e todo cargo que fizessemos, iriamos extender de Employee.
 * Sendo assim, faz muito mais sentido usar o "abstract" para dizer que a classe
 * é um simples "template" a ser extendido por outras classes mais especializadas,
 * como "Manager" por exemplo.
 * OBS.: Uma classe abstrata não pode ser instanciada, ela só poderar ser extendida como
 * uma classe pai, sempre.
 */
public abstract class Employee extends Person {
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        BonusCalc();
    }
    @Override
    public String toString(){
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    /**
     * Se o nosso objetivo é obrigar todas as classes filhas de "Employee" a ter seu proprio BonusCalc()
     * o melhor a se fazer é transformar o metodo em abstrato, então teremos ele existente, mas novamente como um modelo
     * a ser seguido.
     * OBS.: Já que o metodo é um modelo, devemos continuar estruturando ele do mesmo jeito, porém, sem um body,
     * já que todas as subclasses irão ter sua propria lógica para o metodo
     * OBS. 2: Vale falar também que a partir do momento que setamos um metodo abstrato
     * é como se toda classe filha tivesse um contrato a ser seguido: instanciar esse metodo.
     * ou seja, toda classe deve fazer seu proprio "BonusCalc" e se não fizer, teremos um erro de compilação
     * OBS. 3: Metodos abstratos só podem existir dentro de classes abstratas.
     */
//    public void BonusCalc(){
//        this.salary = this.salary + this.salary * 0.1;
//    }
    public abstract void BonusCalc();
}
