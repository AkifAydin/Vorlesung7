import java.util.*;

public class MapBasics {

    public static void MapAuslesen() {
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

    public static void MapFuellen() {
        String[] mykeys = {"Onur", "Akif", "Ummar"};
        String[] myvals = {"bigbrain", "garbagecollector", "master"};
        Map<String, String> mp = new HashMap<>();
        for (int i = 0; i < mykeys.length; i++) {
            mp.put(mykeys[i], myvals[i]);
        }
        for (Map.Entry<String, String> elem : mp.entrySet()) {
            System.out.println(elem.getKey() + " -> " + elem.getValue());
        }
    }

    public static void ZeichenHauefigkeit() {
        String str = "ein kurzer Teststring mit: aoaoei";
        Map<Character, Integer> mp = new HashMap<>();
        char[] c = str.toCharArray();
        System.out.println(Arrays.toString(c));
        int count = 0;
        for (int i = 0; i < c.length; i++) {
            for (int y = 0; y < c.length; y++) {
                if (c[i] == c[y]) {
                    count++;
                }
            }
            mp.put(c[i], count);
            count = 0;

        }
        for (Map.Entry<Character,Integer> elem: mp.entrySet()) {
            System.out.println(elem.getKey() + " -> " + elem.getValue());
        }
    }

    public static void main(String[] args) {
        MapAuslesen();
        MapFuellen();
        ZeichenHauefigkeit();
    }

}
