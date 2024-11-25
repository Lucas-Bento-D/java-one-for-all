package academy.bentodev.javaoneforall.pooClass.introduction;

import academy.bentodev.javaoneforall.pooClass.introduction.domain.Car;
import academy.bentodev.javaoneforall.pooClass.introduction.domain.Studant;

public class introduction {
    public static void main(String[] args) {
        Studant studant1 = new Studant();
        studant1.name = "Luan";
        studant1.age = 13;
        studant1.sex = 'M';

        System.out.println(studant1.name);

        Car karensCar = new Car();
        karensCar.setName("Corolla Cross");
        karensCar.setModel("Corolla");
        karensCar.setYear(2024);


        Car lucasCar = new Car();
        lucasCar.setName("Civic");
        lucasCar.setModel("Honda");
        lucasCar.setYear(2018);

        System.out.println(lucasCar.name + " e " + karensCar.name);

    }
}
