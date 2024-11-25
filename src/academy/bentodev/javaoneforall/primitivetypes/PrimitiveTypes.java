package academy.bentodev.javaoneforall.primitivetypes;

public class PrimitiveTypes {    
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolen
        // syntax for variable declarations is: {type} {varName} = {value}, where 'value' is optional 
        int fatherAge = 45; 
        long bigNumber = 1000000;
        double salary = 2000.0;
        float floatSalary = 2500.0F; // to specify variable is float and add dot 0 for exemplo, we need add 'F' after number
        byte byteAge = 20; // -128 to 127
        short ageShort = 10;
        boolean trueOrFalse = true;
        char character = 'A';

        System.out.println("int: " + fatherAge);
        System.out.println("long: " + bigNumber);
        System.out.println("double: " + salary);
        System.out.println("float: " + floatSalary);
        System.out.println("byte: " + byteAge);
        System.out.println("byte: " + ageShort);
        System.out.println("boolean: " + trueOrFalse);
        System.out.println("char: " + character);

        //Types

        // String isn't a primitive type, it's a type is a class. 
        // Because String isn't a type, we need caller like a class, always the first letter how capital letter
        String word = "anyWord";
        System.out.println(word);

        // On Java 10, has been implemented 'var' where you can omit the type of variable, but isn't a best pratice
        var anyVar = "any variable";
        System.out.println(anyVar);
    }
}