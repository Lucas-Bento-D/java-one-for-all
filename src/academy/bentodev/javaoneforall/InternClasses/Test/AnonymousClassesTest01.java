package academy.bentodev.javaoneforall.InternClasses.Test;

/**
 * Muitas vezes vamos perceber que não vale a pena criar toda uma classe nova para utilizar poliformismo em métodos de outra classe
 * extendida ou implementada, as vezes por ser um caso especifico. Nesse caso nós usamos classes anonimas.
 * a sintaxe é basicamente implementar um construtor e abrir um objeto após isso acontecer, com isso podemos usar o poliformismo
 * para sobreescrever algum método especifico e utilizar naquele código e com isso o ciclo de vida da classe anonima acaba.
 * Apesar de poderosa, a classe anonima tem alguns pontos de atenção, o primeiro sendo o ciclo de vida curtissimo, oque pede
 * usos rapidos e especificos para o contexto e o segundo sendo a criação de novos métodos, pois sabendo que o tipo do construtor
 * tem toda uma interpretação já esperada pelo Java, vai contra a tipagem criar um método novo e chama-lo fora do escopo da classe
 * anonima, mas por meio de acesso em um método existente, o método pode ser usado, ou seja, se houver um novo método, ele só pode
 * ser chamado por outro método sobreposto dentro da propria classe anonima.
 * Vale ressaltar também que podemos fazer classes anonimas de interfaces e para isso precisamos construir a interface e aplicar a
 * classe anonima assim o Java entende que a classe anonima é filha daquela interface.
 */
class Animal{
    public void walk(){
        System.out.println("Animal walking");
    }
}


public class AnonymousClassesTest01 {
    public static void main(String[] args) {
        Animal animal = new Animal(){
            @Override
            public void walk() {
                System.out.println("Walking in the shadows");
            }
        };
        animal.walk();
    }
}
