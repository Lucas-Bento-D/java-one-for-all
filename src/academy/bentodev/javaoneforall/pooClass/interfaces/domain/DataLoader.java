package academy.bentodev.javaoneforall.pooClass.interfaces.domain;

/**
 * Em interfaces todos os métodos são publics e abstracts, entretanto podemos também construir métodos concretos
 */
public interface DataLoader {
    void load();

    /**
     * usando o termo "default", conseguimos setar um metodo concreto na interface, mas esse metodo continua sendo publico
     */
    default void checkPermission(){
        System.out.println("checando permissão");
    }
}
