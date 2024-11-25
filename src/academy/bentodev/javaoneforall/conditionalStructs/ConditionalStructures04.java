package academy.bentodev.javaoneforall.conditionalStructs;

public class ConditionalStructures04 {
    public static void main(String[] args) {
        // Print the week day, consider 1 like sunday
        // Switch
        byte day = 7;
        // Switch input conditionals types: char, int, byte, short, enum, String
        switch (day){
            case 1 :
                System.out.println("domingo");
                System.out.println("final de semana");
                break;
            case 2 :
                System.out.println("segunda");
                break;
            case 3 :
                System.out.println("terça");
                break;
            case 4 :
                System.out.println("quarta");
                break;
            case 5 :
                System.out.println("quinta");
                break;
            case 6 :
                System.out.println("sexta");
                break;
            case 7 :
                System.out.println("sabadão");
                System.out.println("final de semana");
                break;
            default:
                System.out.println("Dia invalido");
        }

    }
}
