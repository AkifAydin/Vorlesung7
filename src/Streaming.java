import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class Streaming {
    List<String> words = Arrays.asList("one", "two", "three" );
    Stream<String> stringStream = words.stream();
    private Object EmployeeSamples;
    Stream<String> secondStream = words.stream();

    public static void main(String[] args) {

        System.out.println("Die Elemente Quadrieren");
        Double[] nums = { 1.0, 2.0, 3.0, 4.0, 5.0 };
        Double[] squares = Stream.of(nums).map(e -> e * e).toArray(Double[]::new);
        System.out.println(Arrays.toString(squares));

        System.out.println("nur Elemente größer als 2.0 in neues Array");
        Double[] bereich = Stream.of(nums).filter(i-> i>2.0).toArray(Double[]::new);
        System.out.println(Arrays.toString(bereich));

        System.out.println("nur erstes Element");
        Double ersteZahl = Stream.of(nums).findFirst().get();
        System.out.println(ersteZahl);

    }
}
