import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        System.out.println("Initial List: " + numbers);

        numbers.add(1, 15);
        System.out.println("After inserting '15' at index 1: " + numbers);

        int value = numbers.get(2);
        System.out.println("Element at index 2: " + value);

        numbers.set(3, 35);
        System.out.println("After updating index 3 to '35': " + numbers);

        Collections.swap(numbers, 0, 2);
        System.out.println("After swapping index 0 and index 2: " + numbers);

        System.out.println("Size of list: " + numbers.size());
        System.out.println("Contains '10'? " + numbers.contains(10));

        numbers.remove(Integer.valueOf(40));
        numbers.remove(0);
        System.out.println("After removals: " + numbers);

        numbers.add(5);
        numbers.add(50);
        Collections.sort(numbers);
        System.out.println("Sorted List: " + numbers);

        System.out.println("\nIterating through elements:");
        for (int n : numbers) {
            System.out.println(" - " + n);
        }

        numbers.clear();
        System.out.println("Is the list empty now? " + numbers.isEmpty());
    }
}