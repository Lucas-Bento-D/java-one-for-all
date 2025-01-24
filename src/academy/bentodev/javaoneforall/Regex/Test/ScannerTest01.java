package academy.bentodev.javaoneforall.Regex.Test;

public class ScannerTest01 {
    public static void main(String[] args) {
        String text = "Lvei, Eren, Mikasa";
        String[] names = text.split(",");
        for (String name: names){
            System.out.println(name.trim());
        }
    }
}
