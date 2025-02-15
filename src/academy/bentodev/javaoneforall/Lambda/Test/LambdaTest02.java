package academy.bentodev.javaoneforall.Lambda.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LambdaTest02 {
    public static void main(String[] args) {
        List<String> names = List.of("nome", "nome2", "nome3");

        /**
         * Podemos tamb[em utilizar o methos reference para simplificar ainda mais uma lambda
         * sintaxe: {Type}::{method name}
         */
        List<Integer> newNames = map(names, String::length);

    }
    private static <T, R> List<R> map(List<T> list, Function<T, R> function){

        List<R> result = new ArrayList<>();
        for (T item: list){
            R apply = function.apply(item); //aplica metodo de lambda tendo como parametro T e como retorno R
            result.add(apply);
        }
        return result;
    }
}
