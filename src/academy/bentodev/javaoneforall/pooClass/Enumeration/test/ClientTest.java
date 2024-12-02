package academy.bentodev.javaoneforall.pooClass.Enumeration.test;

import academy.bentodev.javaoneforall.pooClass.Enumeration.domain.Client;
import academy.bentodev.javaoneforall.pooClass.Enumeration.domain.ClientType;
import academy.bentodev.javaoneforall.pooClass.Enumeration.domain.PaymentType;

public class ClientTest {
    public static void main(String[] args) {
        /**
         * inconsistencia de dados no parametro "type"
         */
        Client client1 = new Client("Tsubaza", ClientType.PHISYCAL_PERSON, PaymentType.DEBIT);
        Client client2 = new Client("Akira", ClientType.JURY_PERSON, PaymentType.DEBIT);
        Client client3 = new Client("Tsubaza", ClientType.PHISYCAL_PERSON, PaymentType.DEBIT);

        System.out.println(client2);

        System.out.println(PaymentType.DEBIT.DiscountCalc(100));
        System.out.println(ClientType.getClientTypeByName("Pessoa juridica12"));
    }
}
