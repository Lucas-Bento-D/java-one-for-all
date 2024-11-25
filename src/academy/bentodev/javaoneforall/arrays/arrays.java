package academy.bentodev.javaoneforall.arrays;

public class arrays {
    public static void main(String[] args) {
//        No java, você precisa dizer quanto de espaço de memoria que o array vai utilizar
        int[] ages = new int[3];
        ages[0] = 82;
        ages[1] = 12;
        ages[2] = 123;

        for(int i = 0; i < ages.length; i++) System.out.println("idade " + i + ": " + ages[i]);

        // foreach
        //forma 2 de montar um array - essa forma de inicialização não pode ser usada em arrays multi dimensionais
        int[] numbers = {1,2,3,4};
        //forma 3
        int[] numbers2 = new int[]{1,2,3,4};
        for(int i = 0; i < numbers.length; i++) System.out.println("idade " + i + ": " + numbers[i]);

        // foreach não dá o indice especifico, ele basicamente percorre o array de forma mais simples que o for usual
        for(int n:numbers2){
            System.out.println(n);
        }

    }
}
