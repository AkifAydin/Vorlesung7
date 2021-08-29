import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ListIteratoren {
    public static void main(String[] args) {
        List<Character> li = new ArrayList<Character>(
                Arrays.asList(new Character[]{'a', 'b', 'c'}));
        ListIterator<Character> liter = li.listIterator();
// Listen von vorne nach hinten durchlaufen
        while (liter.hasNext()) {
            System.out.println(("next_i: " + liter.nextIndex()));
            System.out.println(("prev_i: " + liter.previousIndex()));
            System.out.println(("e : " + liter.next()));
        }
// Listen von hinten nach vorne durchlaufen
        System.out.println(("-------------------------------------"));
        while (liter.hasPrevious()) {
            System.out.println(("next_i: " + liter.nextIndex()));
            System.out.println(("prev_i: " + liter.previousIndex()));
            System.out.println(("e : " + liter.previous()));
        }
    }
}
