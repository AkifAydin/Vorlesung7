import com.sun.jdi.Value;

import java.security.Key;
import java.util.*;

public class MapUebungen {

    public static void mapInvert(Map <String, Map<Integer, Object>> elem){
        //System.out.println(elem);
        Map<Map<Integer, Object>, String> invertedMap = new HashMap<>();
        for (Map.Entry<String, Map<Integer, Object>>entry: elem.entrySet()){
               invertedMap.put(entry.getValue(),entry.getKey());
        }
        for (Map.Entry<Map<Integer,Object>,String> element : invertedMap.entrySet()){
            System.out.println(element.getKey() + "->" + element.getValue());
        }


        //System.out.println(invertedMap);
    }



    public static void main(String[] args) {
        System.out.println("Aufgabe.1");
        Map<String, List<Integer>> mp = new HashMap<>();
        System.out.println("Aufgabe.2");
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            String zuf = Integer.toString(random.nextInt(10));
            List<Integer> lst = new ArrayList<>();
            int ran = random.nextInt(15);
            for (int y = 0; y < ran; y++) {
                lst.add(random.nextInt(10));
            }
            mp.put(zuf, lst);
        }
        for (Map.Entry<String, List<Integer>> elem : mp.entrySet()) {
            System.out.println(elem.getKey() + " -> " + elem.getValue());
        }
        System.out.println("Aufgabe.3");
        int len = -1;
        int len2 = -1;
        int counter = -1;
        for (Map.Entry<String, List<Integer>> elems : mp.entrySet()) {
            len = Math.max(len, elems.getValue().size()); //[4, 0, 5, 4, 7, 0, 0, 7, 3, 3, 9, 2, 7] 13
            if (len2 == len) continue;
            else {
                counter++; // die index stelle wo der größte Value ist
                len2 = len; // um die beiden längen vergleichen zu können
            }
            //System.out.println(len);
        }
        //new map with the biggest value length
        int index = 0;
        Map<String, List<Integer>> newlst = new HashMap<>();
        for (Map.Entry<String, List<Integer>> elems : mp.entrySet()) {
            if (index == counter) {
                newlst.put(elems.getKey(), elems.getValue());
                break;
            }
            index++;
        }
        System.out.println(newlst);

        System.out.println("Aufgabe.4"); //Map in zweidimensionales Array
        Object[] ary = newlst.entrySet().toArray();
        System.out.println(Arrays.toString(ary));
        //Object[] ary2 = mp.entrySet().toArray();
        //System.out.println(Arrays.toString(ary2));
        System.out.println("Aufgabe.5 && Aufgabe.6");
        Map<String, Map<Integer, Object>> newmp = new HashMap<>();
        Map<Integer,Object> inob = new HashMap<>();
        for (int i = 0; i < random.nextInt(10); i++) {
            String str = Integer.toString(random.nextInt(10));
            for (int y = 0; y< random.nextInt(10);y++){
                Integer obj = random.nextInt(10);
                Integer in = random.nextInt(10);
                inob.put(in,obj);
            }
            newmp.put(str, inob);
            //for (Map.Entry<String,Map<Integer,Object>> el: newmp) {
            //    newmp.put()
            //}
        }
        System.out.println(newmp);
        System.out.println("Aufgabe.7");
        mapInvert(newmp);


    }
}
