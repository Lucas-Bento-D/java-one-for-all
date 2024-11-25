package academy.bentodev.javaoneforall.conditionalStructs;

public class ConditionalStructures02 {
    public static void main(String[] args) {
        // else if

        // age < 15 = categoria infantil
        // age >= 15 && age < 18 = categorial juvenil
        // age > 18 = categoria adulta
        int age = 12;
        String category;

        if(age < 15){
            category = "Categoria infantil";
        } else if (age >= 15 && age < 18) {
            category = "Categoria juvenil";
        }else{
            category = "categoria adulta";
        }
        System.out.println(category);
    }
}
