import java.util.Iterator;
import java.util.Map;

public class MapBasics {
    public static void main(String[] args) {
        Map<Integer, String> mis = Map.of(1, "eins", 2, "zwei", 3, "drei");
        for (Integer key : mis.keySet())
            System.out.println(key);
        for (Iterator<Integer> i = mis.keySet().iterator(); i.hasNext(); )
            System.out.println(i.next());
        for (Map.Entry<Integer, String> e : mis.entrySet())
            System.out.println(e.getKey() + ": " + e.getValue());

        System.out.println("höchstens paar von 10 <k,v> möglich");
        Map<Integer, String> mis2 = Map.of(1, "eins", 2, "zwei", 3, "drei", 4, "vier", 5, "fuenf", 6, "sechs", 7, "sieben",
                8, "acht", 9, "neun", 10, "zehn");
        for (Map.Entry<Integer, String> elem : mis2.entrySet())
            System.out.println(elem.getKey() + ":" + elem.getValue());
    }

}
