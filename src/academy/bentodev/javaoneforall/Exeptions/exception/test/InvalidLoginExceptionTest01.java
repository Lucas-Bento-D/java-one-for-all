package academy.bentodev.javaoneforall.Exeptions.exception.test;

import academy.bentodev.javaoneforall.Exeptions.exception.domain.InvalidLoginException;

import java.sql.SQLOutput;
import java.util.Scanner;

public class InvalidLoginExceptionTest01 {
    public static void main(String[] args) {
        try{
            login();
        } catch (InvalidLoginException e) {
            e.printStackTrace();
        }
    }
    private static void login() throws InvalidLoginException {
        Scanner keyboard = new Scanner(System.in);

        String DBuser = "Goku";
        String DBpass = "ssj";

        System.out.println("Usuario");
        String userInputed = keyboard.nextLine();
        System.out.println("Senha");
        String passInputed = keyboard.nextLine();

        if(!DBuser.equals(userInputed) || !DBpass.equals(passInputed)){
            throw new InvalidLoginException("Usuario ou senha invalidos");
        }
        System.out.println("Usuario logado com sucesso");

    }
}
