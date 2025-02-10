package academy.bentodev.javaoneforall.generics.Test;

import academy.bentodev.javaoneforall.generics.Domain.Car;

import java.util.ArrayList;
import java.util.List;

public class GenericMethodsTst01 {
    public static void main(String[] args) {
        createArrWithObj(new Car("BMW"));
    }
    // Podemos implementar um metodo com tipagem generica tambem
    private static <T> void createArrWithObj(T t){
        List<T> list = List.of(t);
        System.out.println(list);

    }
}
// Podemos setar qualquer classe com um ou mais tipos genericas
class ThreeAttributes<T,X,I>{
    private T t;
    private X x;
    private I i;

}
