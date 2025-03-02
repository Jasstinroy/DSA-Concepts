import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> list = new ArrayList<>();

        // Add elements to the ArrayList
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");

        System.out.println("ArrayList after adding elements: " + list);

        // Access an element by index
        System.out.println("Element at index 1: " + list.get(1)); // Output: Banana

        // Modify an element in the ArrayList
        list.set(2, "Blueberry");
        System.out.println("ArrayList after modifying index 2: " + list);

        // Remove an element by index
        list.remove(3); // Removes "Date"
        System.out.println("ArrayList after removing index 3: " + list);

        // Remove an element by value
        list.remove("Banana"); // Removes "Banana"
        System.out.println("ArrayList after removing 'Banana': " + list);

        // Check if the ArrayList contains an element
        System.out.println("Does the list contain 'Apple'? " + list.contains("Apple")); // true
        System.out.println("Does the list contain 'Banana'? " + list.contains("Banana")); // false

        // Get the size of the ArrayList
        System.out.println("Size of the ArrayList: " + list.size()); // Output: 2

        // Check if the ArrayList is empty
        System.out.println("Is the ArrayList empty? " + list.isEmpty()); // Output: false

        // Clear all elements in the ArrayList
        list.clear();
        System.out.println("ArrayList after clearing: " + list);

        // Check again if the ArrayList is empty
        System.out.println("Is the ArrayList empty now? " + list.isEmpty()); // Output: true
    }
}
