import java.sql.Array;
import java.util.*;

public class Fingeruebung {

    public static void A1() {
        Integer[] ary = {5, 3, 4, 1, 2};
        System.out.println(Arrays.toString(ary));
        List<Integer> list = Arrays.asList(ary);
        Collections.sort(list);
        System.out.println(list);
    }

    public static void A3() {
        Integer[] ary = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(ary));
        List<Integer> list = Arrays.asList(ary);
        List<Integer> list2 = new ArrayList<Integer>();
        Collections.shuffle(list);
        System.out.println(list);
        //Collections.reverse(list);
        //System.out.println(list);
        list2.addAll(list);
        System.out.println("t " + list2);
    }

    public static void A4() {
        System.out.println("Methode 1:\n" +
                "Da List ein Subtyp von Collections ist, kann man mithilfe der Collections Methode Copy die Liste Kopieren");
        Integer[] aryy = new Integer[10];
        List<Integer> list3 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        List<Integer> list4 = new ArrayList<Integer>(Arrays.asList(aryy)); //Länge der neuen Liste
        Collections.copy(list4, list3);
        System.out.println(list3);
        System.out.println("Copy: " + list4);
        System.out.println(list4.size());

        System.out.println("Methode 2: Über die Liste Iterieren und mithilfe indizierten zugriffs die einzelnen Indexstellen raus kopieren in eine neue Liste");
        System.out.println("siehe Arrays...");

        System.out.println("Methode 3: mit der Methode cpylist.addAll(oldlist)");
        Integer[] ary = {1, 2, 3, 4, 5};
        List<Integer> list = Arrays.asList(ary);
        List<Integer> list2 = new ArrayList<Integer>();
        list2.addAll(list);
        System.out.println(list);
        System.out.println("Copy: " + list2);

        System.out.println("Methode 4: mithilfe der Referenzierung auf die Liste kann man eine 'Kopie' erstellen");
        List<Integer> l1 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> l2 = new ArrayList<Integer>(l1);
        System.out.println(l1);
        System.out.println("Copy: " + l2);

    }

    public static void DublettenEntfernen(List<String> liste){

        Set<String> list = new HashSet<>(liste);
        System.out.println(list);
    }

    public static void main(String[] args) {
        System.out.println("Aufgabe.1");
        A1();
        System.out.println("Aufgabe.3");
        A3();
        System.out.println("Aufgabe.4");
        A4();
        System.out.println("Aufgabe Dubletten Entfernen");
        List<String> list = new ArrayList<>(Arrays.asList("Akif","Onur","Ummar","Akif"));
        //System.out.println(list);
        DublettenEntfernen(list);
    }
}
