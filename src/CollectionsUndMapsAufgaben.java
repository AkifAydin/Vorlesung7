import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CollectionsUndMapsAufgaben {
    public static void main(String[] args) {

        System.out.println("Aufgabe.1");
        List<Double> list = new ArrayList<>();
        Random random = new Random();

        System.out.println("Aufgabe.2   (Objekte vom Typ Double können in die Liste hinzugefügt werden.)");
        for(int i = 0; i< 5; i++){
            list.add(random.nextDouble());
        }
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
    }
}
