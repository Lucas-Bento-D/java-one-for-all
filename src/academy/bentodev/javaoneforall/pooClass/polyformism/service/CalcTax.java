package academy.bentodev.javaoneforall.pooClass.polyformism.service;

import academy.bentodev.javaoneforall.pooClass.polyformism.domain.Computer;
import academy.bentodev.javaoneforall.pooClass.polyformism.domain.Tomato;

public class CalcTax {
    public static  void calcComputerTax(Computer computer){
        System.out.println("Relátorio de imposto do computador");
        double tax = computer.calcTax();
        System.out.println("Nome do computador: " + computer.getName());
        System.out.println("Preço do computador: " + computer.getValue());
        System.out.println("Imposto do computador: " + tax);
        System.out.println("------------------------------------------");
    }
    public static void calcTomatoTax(Tomato tomato){
        System.out.println("Relátorio de imposto do tomate");
        double tax = tomato.calcTax();
        System.out.println("Nome do tomate: " + tomato.getName());
        System.out.println("Preço do tomate: " + tomato.getValue());
        System.out.println("Imposto do tomate: " + tax);
        System.out.println("------------------------------------------");
    }

}
