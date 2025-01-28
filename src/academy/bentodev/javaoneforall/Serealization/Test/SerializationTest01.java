package academy.bentodev.javaoneforall.Serealization.Test;

import academy.bentodev.javaoneforall.Serealization.Domain.Class;
import academy.bentodev.javaoneforall.Serealization.Domain.Student;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Exemplo criado para serializar ou disserializar um objeto criado em algum outro momento, utilizando as classes ObjectInputStream
 * e ObjectOutputStream
 */
public class SerializationTest01 {
    public static void main(String[] args) {
        Student student = new Student(1, "Naruto 2", "asdjkl1n201");
        Class classe = new Class("Turma aqui");
        student.setClasse(classe);
//        serialize(student);
        serialized();
    }

    private static void serialize(Student student){
        Path studentSer = Paths.get("pasta/student.ser");
        try(ObjectOutputStream oOS = new ObjectOutputStream( Files.newOutputStream( studentSer ) )){
            oOS.writeObject(student);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void serialized(){
        Path studentSer = Paths.get("pasta/student.ser");

        try(ObjectInputStream oOS = new ObjectInputStream( Files.newInputStream( studentSer ) )){
            Student student = (Student) oOS.readObject();
            System.out.println(student.toString());
        } catch (ClassNotFoundException|IOException e ) {
            e.printStackTrace();
        }
    }
}
