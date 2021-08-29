import java.util.HashMap;
import java.util.Map;

public class MapUebungen {
    public static void A1() {
        Map<String, Integer> mp = Map.of("Onur", 2, "Ummar", 4, "Kevin", 5, "Okan", 6, "Akif", 9);
        for (Map.Entry<String, Integer> elem : mp.entrySet()) {
            System.out.println(elem.getKey() + " -> " + elem.getValue());
        }
    }

    public static void A2() {
        for (int i = 0; i < 5; i++){
            int i = (int) Math.random();
            double d = Math.random();
            Map<Double, Integer> mp = new HashMap<>();
        }


    }

    public static void main(String[] args) {
        A1();
        A2();
    }
}
