import java.util.Arrays;

// Sortable.java (Interface)
interface Sortable {
    int compare(Object o1, Object o2);
}

// NameComparator.java (Class implementing Sortable)
class NameComparator implements Sortable {
    @Override
    public int compare(Object o1, Object o2) {
        String name1 = (String) o1;
        String name2 = (String) o2;
        return name1.compareTo(name2);
    }
}

public class SortableInterface {
    public static void main(String[] args) {
        // Create an array of names
        String[] names = {"Alice", "David", "Bob", "Charlie", "Eve"};

        // Use the NameComparator to sort the array
        Sortable comparator = new NameComparator();
        Arrays.sort(names, (o1, o2) -> comparator.compare(o1, o2));

        // Print the sorted array
        for (String name : names) {
            System.out.println(name);
        }
    }
}
