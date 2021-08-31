import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streaming {
    List<String> words = Arrays.asList("one", "two", "three" );
    Stream<String> stringStream = words.stream();
    private Object EmployeeSamples;
    Stream<String> secondStream = words.stream();

    public static void main(String[] args) {

        System.out.println("Die Elemente Quadrieren");
        Double[] nums = { 1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0 };
        Double[] squares = Stream.of(nums).map(e -> e * e).toArray(Double[]::new);
        System.out.println(Arrays.toString(squares));

        System.out.println("von stelle 3.0 bis 5.0");
        Double[] num = { 1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0 };
        Double[] square = Stream.of(num).map(e -> e * e).limit(5).skip(2).toArray(Double[]::new);
        System.out.println(Arrays.toString(square));

        System.out.println("nur Elemente größer als 2.0 in neues Array");
        Double[] bereich = Stream.of(nums).filter(i-> i>2.0).toArray(Double[]::new);
        System.out.println(Arrays.toString(bereich));

        System.out.println("nur erstes Element");
        Double ersteZahl = Stream.of(nums).findFirst().get();
        System.out.println(ersteZahl);

        System.out.println("Duplikate innerhalb eines Arrays entfernen");
        Integer[] noDups = Stream.of(new Integer[]
                { 1, 2, 3, 4, 1, 5, 6, 3, 4, 1, 2 }).distinct().toArray(Integer[]::new);
        System.out.println(Arrays.toString(noDups));

        System.out.println("Mithilfe eines Intstreams random werte generieren in einem wertebereich");
        IntStream infinit = new Random().ints().limit(10);
        System.out.println(Arrays.toString(infinit.toArray()));

    }
}
