package academy.bentodev.javaoneforall.Exeptions.exception.domain;

public class Employee extends Person{
    /**
     * Quando fazemos a sobreescrita de um método que pode lançar um erro, não precisamos necessariamente fazer o metodo
     * sobreescrito ter a possibilidade de lançar os mesmo erros, visto que podemos ter lógica diferente do metodo original.
     */
    public void save(){
        System.out.println("Salvando funcionario");
    }
}
