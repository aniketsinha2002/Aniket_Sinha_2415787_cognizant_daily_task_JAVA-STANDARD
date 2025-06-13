// ACTIVITY - STREAM + LAMBDA
// Problem Statement:
// Given a list of employee names, filter names starting with 'A', convert them to uppercase, and print them.


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamLambda {
    public static void main(String[] args) {
        List<String> employeeNames = Arrays.asList("Alice", "Bob", "Annie", "Charlie", "Andrew");

        List<String> filteredNames = employeeNames.stream()
                .filter(name -> name.startsWith("A"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        filteredNames.forEach(System.out::println);
    }
}
