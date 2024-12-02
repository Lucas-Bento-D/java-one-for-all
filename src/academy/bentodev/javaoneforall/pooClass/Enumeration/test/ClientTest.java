package academy.bentodev.javaoneforall.pooClass.Enumeration.test;

import academy.bentodev.javaoneforall.pooClass.Enumeration.domain.Client;
import academy.bentodev.javaoneforall.pooClass.Enumeration.domain.ClientType;

public class ClientTest {
    public static void main(String[] args) {
        /**
         * inconsistencia de dados no parametro "type"
         */
        Client client1 = new Client("Tsubaza", ClientType.PHISYCAL_PERSON);
        Client client2 = new Client("Tsubaza", ClientType.JURY_PERSON);
        Client client3 = new Client("Tsubaza", ClientType.PHISYCAL_PERSON);

        System.out.println(client1);

    }
}
