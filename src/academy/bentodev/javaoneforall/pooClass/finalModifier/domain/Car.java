package academy.bentodev.javaoneforall.pooClass.finalModifier.domain;

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

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
