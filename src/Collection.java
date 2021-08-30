import java.util.*;

public class Collection {

    public static void Listen() {
        List<Integer> li = new ArrayList<Integer>(Arrays.asList(new Integer[]{1, 1, 2, 1, 1, 3, 1, 1, 6}));
        Iterator<Integer> iiter = li.iterator();
        while (iiter.hasNext()) {
            if (iiter.next() == 1)
                iiter.remove();
        }
        System.out.println((li));
    }

    public static void ListenEinsVorkommen(){
        List<Integer> li = new ArrayList<Integer>(Arrays.asList(new Integer[]{1,1,2,1,1,3,1,1,6}));
        for(int i = 0; i <li.size(); i++){
            if (li.get(i) == 1)
                li.remove(i);
        }
        System.out.println((li));
    }

    public static void main(String[] args) {
        Listen();
        ListenEinsVorkommen();
    }

}