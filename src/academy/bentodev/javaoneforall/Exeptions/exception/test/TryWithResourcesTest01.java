package academy.bentodev.javaoneforall.Exeptions.exception.test;

import academy.bentodev.javaoneforall.Exeptions.exception.domain.Reader1;
import academy.bentodev.javaoneforall.Exeptions.exception.domain.Reader2;

import java.io.*;

public class TryWithResourcesTest01 {
    public static void main(String[] args) {
        readArchive();
    }

    /**
     * Como vemos em readArchive2, as vezes o c[odigo pode ficar verboso demais, no exemplo o metodo close também pode
     * lançar um erro e ele precisa ser tratado, com isso teriamos um try catch dentro de outro try catch, oque deixaria
     * o código bem ruim para leitura e manutenção futuramente. Felizmente o java disponibiliza agora o try with resourses,
     * que tem o objetivo de ser um try  com alguns recursos adicionais, o recurso usado no exemplo foi o metodo close
     * automatico. Enquanto no metodo readArchive2 nós precisavamos adicionar o metodo close para fechar a leitura/escrita
     *  do recurso( nesse caso o reader), já no readArchive, usamos o try with resources para abrir a leitura e executar o
     *  método close automaticamente(interface AutoCloseable), também perdendo a necessidade de usar o bloco finally
     */
    public static void readArchive(){

        try(Reader1 reader1 = new Reader1();
            Reader2 reader2 = new Reader2()){

        }catch (IOException e){
        }
    }

    public static void readArchive2(){
        Reader reader = null;
        try{
            reader = new BufferedReader(new FileReader("test.txt"));
        }catch (FileNotFoundException e){
            e.printStackTrace();
        } finally {
            try{
                reader.close();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
