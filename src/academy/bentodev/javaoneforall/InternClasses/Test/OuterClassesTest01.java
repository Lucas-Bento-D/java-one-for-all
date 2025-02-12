package academy.bentodev.javaoneforall.InternClasses.Test;

/**
 * Apesar da sintaxe esquisita, a classe interna é bastante poderosa por ter acesso a atributos e métodos da classe pai.
 * Para realizar a montagem do construtor da classe interna, precisamos primeiro inicializar o construtor da classe pai e
 * a partir disso abrir o construtor da classe interna, com isso, acessar métodos e lógicas dessa classe.
 */
public class OuterClassesTest01 {
    private String name = "Monkey D. Luffy";

    class Intern {
        public void printOuterClassAttribute(){
            System.out.println(name);
            System.out.println(this); // referencia a classe de escopo, nesse caso, Intern
            System.out.println(OuterClassesTest01.this); // referencia a classe pai, no nosso caso, OuterClassesTest01
        }
    }
    public static void main(String[] args) {
        OuterClassesTest01 outerClass = new OuterClassesTest01();
        Intern intern = outerClass.new Intern();
        intern.printOuterClassAttribute();
    }
}
