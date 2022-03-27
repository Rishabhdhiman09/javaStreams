import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntegerStream {
    public static void main(String[] args) {
        IntStream.range(1, 10)
                .forEach(System.out::print);

        System.out.println();
        // Intstream with skip
        IntStream.range(1, 10)
                .skip(5)
                .forEach(System.out::print);

        System.out.println();
        // Intstream with sum
        System.out.println(
                IntStream.range(1, 10)
                        .sum()
        );

        System.out.println();
        // Intstream with sorting

        Stream.of("Rishbh", "Rahul", "Simran")
                .sorted()
                .findFirst()
                .ifPresent(System.out::print);
        System.out.println();
        // Intstream with array
        String[] names = {
                "Rishabh", "Simran", "Ankit", "Vishal", "Aakash"
        };
        Arrays.stream(names)
                .filter(x -> x.startsWith("A"))
                .sorted()
                .forEach(System.out::println);

        // average of square of an int array

        int[] nums = {
                1,2,3,4,5,6
        };

        Arrays.stream(nums)
                .map(x -> x*x)
                .average()
                .ifPresent(System.out::println);

        // using collect
        String[] people = {
                "Rishabh", "Simran", "Ankit", "Vishal", "Aakash"
        };
        List<String> selectedPeople = Arrays.stream(people)
                .filter(x -> x.startsWith("A"))
                .sorted()
                .collect(Collectors.toList());

        selectedPeople.forEach(System.out::println);



        // reduction
        int sum = Arrays.stream(nums)
                .reduce(0, (int a, int b) -> a + b);
        System.out.println(sum);
    }
}
