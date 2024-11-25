package academy.bentodev.javaoneforall.repetitionStructs;

public class repetitionStructs {
    public static void main(String[] args) {
        // while, do while, for
        int count = 11;
        while(count < 10){
            count ++;
            System.out.println(count);
        }
        // do executa pelo menos uma vez antes de verificar a condicional do while
        do{
            System.out.println(count);
        }while(count < 10);

        // for
        for(int i = 0; i <10; i++){
            System.out.println("for");
        }

        // Break
        for (int i = 0; i <= 50; i++) {
            if(i>25) break;
            System.out.println(i);
        }

        // continue
        for (int i = 50; i <= 0; i--) {
            if(i<25) continue;
            System.out.println(i);
        }
    }
}
