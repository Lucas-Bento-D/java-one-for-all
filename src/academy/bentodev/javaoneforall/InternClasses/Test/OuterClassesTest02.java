package academy.bentodev.javaoneforall.InternClasses.Test;


/**
 * Continuando com sintaxes estranhas, também conseguimos adicionar uma classe interna dentro de um método, mas isso não é utilizado de
 * fato quando se programa com Java, mas podemos exemplificar para entender algumas coisas.
 * a classe interna dentro do método pode acessar os atributos e métodos da classe pai, podendo até mudar, ela também consegue
 * acessar um atributo do método pai, mas esses atributos são obrigatoriamente "final" não podendo ser alterados(o mesmo vale para parametros)
 */
public class OuterClassesTest02 {
    private String name = "Modoriya";

    void print(){
        final String surname = "Izuku";
        class LocalClass{
            public void printLocal(){
                System.out.println(name);
                System.out.println(surname);
            }
        }
        new LocalClass().printLocal();
    }

    public static void main(String[] args) {
        OuterClassesTest02 outer = new OuterClassesTest02();
        outer.print();
    }
}
