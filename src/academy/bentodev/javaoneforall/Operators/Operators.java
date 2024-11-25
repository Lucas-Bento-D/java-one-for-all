package academy.bentodev.javaoneforall.Operators;

public class Operators {
    public static void main(String[] args) {
        // basic operators -> + - * /
        int n1 = 10;
        int n2 = 22;

        // if you use string + number + number, you will have a concatanation not math account, for example
        System.out.println("Valor: " + n2 + n1);
        // if you use number + number before string, you will have math account
        System.out.println(n2 + n1 + "Valor: " + n2 + n1);

        // A result of math account of integer numbers, always integer number
        System.out.println(n1/n2);
        // To catch a result of division, the divisor needs be double/float
        System.out.println(10/22.0);
        // OR
        System.out.println(n1/ (double) n2);

        // % -> rest
        // rest of math account
        // think: math account with 2 as divisor have 1 as rest to odd and 0 as even
        int rest = 21 % 2;
        System.out.println(rest);


        // < > <= >= == !=
        boolean isTenBiggerThanTwelve = 10 > 20;
        boolean isTenSmallThanTwelve = 10 < 20;
        boolean isTenEqualTwelve = 10 == 20;
        boolean isTenEqualTen = 10 == 10;
        boolean isTenDiferentTen = 10 != 10;
        
        System.out.println(isTenEqualTen);

        // Logic operators
        // && || ! (and, or, negation)

        int age = 26;
        float salary = 3500F;
        boolean isInLaw = age > 30 && salary >= 4612 || age < 30 && salary >= 3381;
        System.out.println(isInLaw);

        // Atribuition operators
        // = += -= *= /= %=
        double bonus = 1000;
        System.out.println(bonus += 10);
        System.out.println(bonus -= 100);
        System.out.println(bonus *= 10);
        System.out.println(bonus /= 10);
        System.out.println(bonus %= 2);

        // ++ --
        int count = 0;
        count += 1;
        count ++;
        count --;
        //diference is execute time
        ++ count;
        -- count;
        System.out.println(count);

    }
}
