package academy.bentodev.javaoneforall.String.Test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String name = "Lucas Bento";
        name.concat(" dev");
        System.out.println(name);

        /**
         *
         */
        StringBuilder text = new StringBuilder("Lucas Bento");
        text.append(" dev");
        System.out.println(text);
    }
}
