package academy.bentodev.javaoneforall.pooClass.association.test;

import java.util.Scanner;

public class ReadKeyboardInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String inputName = input.nextLine();
        System.out.print("Digite sua idade: ");
        int inputAge = input.nextInt();
        System.out.print("Digite M ou F para seu sexo: ");
        char sex = input.next().charAt(0);

        System.out.println(inputName);
        System.out.println(inputAge);
        System.out.println(sex);
    }
}
