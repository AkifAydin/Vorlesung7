import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

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

    public static void main(String[] args) {
        Listen();
    }

}