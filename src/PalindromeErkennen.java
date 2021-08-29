import java.util.*;

public class PalindromeErkennen {
    public static boolean Palindrom(String eingabe) {
        char[] ary = eingabe.replaceAll("\\s","").toLowerCase(Locale.ROOT).toCharArray();
        System.out.println(ary);
        List<Character> ls = new ArrayList<>();
        for (int i = 0; i < ary.length; i++) {
            ls.add(ary[i]);
        }
        ListIterator<Character> iter,prev;
        iter = ls.listIterator();
        prev = ls.listIterator(ls.size());
        
        while ((iter.hasNext() && prev.hasPrevious())&&(prev.previousIndex() > iter.nextIndex())){
            if (iter.next() != prev.previous()) return false;
        }
            return true;
        
    }

    public static void main(String[] args) {
        System.out.println("Trug Tim eine so helle Hose nie mit Gurt".length());
        System.out.println(Palindrom("Trug Tim eine so helle Hose nie mit Gurt"));

    }
}
