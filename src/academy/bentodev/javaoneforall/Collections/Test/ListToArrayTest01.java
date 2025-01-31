package academy.bentodev.javaoneforall.Collections.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArrayTest01 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        Integer[] integersArr = numbers.toArray(new Integer[0]); // quando instanciamos um array com [0] o java descobre a quantidade de itens nesse array para monta-lo
        System.out.println(Arrays.toString(integersArr));
        System.out.println("-------------------------");
        Integer[] integersNewArr = new Integer[3];
        integersNewArr[0] = 1;
        integersNewArr[1] = 2;
        integersNewArr[2] = 3;

        List<Integer> arrayToList =  Arrays.asList(integersArr);
        arrayToList.set(0, 12);
        System.out.println(Arrays.toString(integersNewArr));
        System.out.println(arrayToList);


    }
}
