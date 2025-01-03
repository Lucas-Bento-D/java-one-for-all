package academy.bentodev.javaoneforall.Exeptions.runtime.test;

public class RuntimeExceptionTest01 {
    public static void main(String[] args) {
        // termos para lembrar: Checked e Unchecked
        /**
         * Filhos diretas da classe Exception(filho direto da classe Throwable), os erros checkeds são erros já checados
         * e acontecem em tempo compilação, tem como obrigação o tratamento, visto que sem o tratamento  código não compilará.
         * Filhos da classe RuntimeException(filho direto da classe Exception), os erros uncheckeds são erros quase que
         * sempre do programador que fez algum ponto
         * errado, como tratar um numero de forma errada ou um casting que não é possivel fazer.
         */

        // exemplo de erro Checked
        Object object = null;
        int[] nums = {1,2};
        System.out.println(object.toString());
    }
}
