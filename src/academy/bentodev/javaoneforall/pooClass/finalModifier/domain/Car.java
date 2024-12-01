package academy.bentodev.javaoneforall.pooClass.finalModifier.domain;

/**
 * podemos setar uma classe como "final", isso faz com que essa classe
 * não possa ser extendida para outra classe, pois os metodos não poderão
 * ser modificados(como recentemente vimos com toString por exemplo)
 */

public class Car {
    private String name;
    /**
     * o termo "final" é usado para setar constantes no código
     * geralmente uma constate sempre estará aliada a um metodo "static"
     * OBS.: Uma boa pratica é a constante ser sempre nomeada toda em maiuscula
     *
     * Podemos inicializar a constante pelo bloco de inicialização tambem
     * Exemplo 1 - com static:
     * static{
     *     LIMIT_VELOCITY = 250;
     * }
     *
     * Exemplo 2 - sem static:
     * {
     *     LIMIT_VELOCITY = 250;
     * }
     *
     * Alem desses modos, podemos inicializar junto com o bloco de construção da classe
     *
     * Exemplo (não funciona caso a constante tenha o metodo static):
     * public Car(){
     *     LIMIT_VELOCITY = 250;
     * }
     */

    private static final  double LIMIT_VELOCITY = 250;

    /**
     * Para constantes com tipagem de referencia, quando setamos como final
     * não estamos setando um valor para a constante e sim pra onde ela sempre vai fazer referencia
     * ou seja, o valor de "BUYER" é o objeto "Buyer", mas isso não quer dizer que dentro do objeto
     * já tenha algum valor imodificavel, apenas quer dizer que a referencia dele é imodificavel
     */
    private final Buyer BUYER = new Buyer();

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Buyer getBUYER() {
        return BUYER;
    }

    /**
     * Podemos também setar um  metodo como "final", isso faz com que
     * esse metodo não possa ser sobrescrito
     */
    public final void print(){
        System.out.println(this.name);
    }
}
