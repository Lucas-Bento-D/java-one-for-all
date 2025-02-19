package academy.bentodev.javaoneforall.Optional.Test;

import java.util.List;
import java.util.Optional;

public class OptionalTest01 {
    public static void main(String[] args) {
        Optional<String> o1 = Optional.of("haha");
        Optional<String> o2 = Optional.ofNullable(null);
        System.out.println(o1);

        System.out.println("---------------------------");
        Optional<String> optionalName = Optional.ofNullable(findName("Willian"));
        System.out.println(optionalName);
    }
    private static String findName( String name){
        List<String> list = List.of("Willian", "DevDojo");
        int i = list.indexOf(name);
        if(i != -1) return list.get(i);
        return null;
    }
}
