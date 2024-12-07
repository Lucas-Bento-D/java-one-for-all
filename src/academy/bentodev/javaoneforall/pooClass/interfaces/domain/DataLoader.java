package academy.bentodev.javaoneforall.pooClass.interfaces.domain;

/**
 * Em interfaces todos os métodos são publics e abstracts, entretanto podemos também construir métodos concretos
 * Interfaces não podem ser instanciadas
 */
public interface DataLoader {
    /**
     * Em uma interface, todos seus atributos são constantes
     */
    int MAX_DATA_SIZE = 10;
    void load();

    /**
     * usando o termo "default", conseguimos setar um metodo concreto na interface, mas esse metodo continua sendo publico
     */
    default void checkPermission(){
        System.out.println("checando permissão");
    }

    /**
     * podemos fazer funções estaticas nas interfaces
     */
    public static void retriveMaxDataSize(){

    }
}
