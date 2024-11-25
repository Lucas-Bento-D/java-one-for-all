package academy.bentodev.javaoneforall.conditionalStructs;

public class ConditionalStructures {
    public static void main(String[] args){
        // if
        int age = 12;
        boolean isAuthorazedBuy = age >= 18;
        if(isAuthorazedBuy){
            System.out.println("pode comprar bebida alcolica");
        }
        if(!isAuthorazedBuy) System.out.println("Não pode comprar bebida alcolica");

        // else
        if(isAuthorazedBuy){
            System.out.println("pode comprar bebida alcolica");
        }else{
            System.out.println("else executado");
        }
    }
}
