import java.util.*;

// Functional interface
@FunctionalInterface
interface StringProcessor {
    String process(String str);
}

class Assignmen1 {
    public static void main(String[] args) {
        // List of strings
        List<String> words = Arrays.asList("apple", "orange", "banana", "grape", "cherry");

        // Sorting in reverse alphabetical order using lambda
        words.sort((s1, s2) -> s2.compareTo(s1));
        System.out.println("Sorted list in reverse alphabetical order: " + words);

        // Implementing StringProcessor using a lambda expression
        StringProcessor processor = str -> str.toUpperCase();

        // Processing and printing each word in uppercase
        System.out.println("Uppercase words:");
        words.forEach(word -> System.out.println(processor.process(word)));
    }
}
