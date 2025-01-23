package academy.bentodev.javaoneforall.ResourceBundle.Test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest01 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        ResourceBundle mBundle = ResourceBundle.getBundle("message", new Locale("pt", "BR"));
        System.out.println(mBundle.getString("good.morning"));

        /**
         * Regra de busca de arquivos .properties
         * 1: busca pelo arquivo com o locale especificado, exemplo: message_en_US
         * 2: se não, busca pelo arquivo com a lingua especificada, exemplo: message_en
         * 3: se não, busca pelo o arquivo com o locale da maquina, exemplo: message_pt_BR
         * 4: se não, busca pelo o o arquivo com a lingua da maquina especificada, exemplo: message_pt
         * 5: se não, busca pelo o arquivo default, exemplo: message
         */
    }
}
