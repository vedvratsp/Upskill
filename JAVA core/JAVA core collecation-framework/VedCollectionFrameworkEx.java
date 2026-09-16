import java.util.*;

public class VedCollectionFrameworkEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nChoose a data structure:");
            System.out.println("1. ArrayList");
            System.out.println("2. LinkedList");
            System.out.println("3. HashSet");
            System.out.println("4. TreeSet");
            System.out.println("5. HashMap");
            System.out.println("6. TreeMap");
            System.out.println("7. LinkedHashMap");
            System.out.println("8. PriorityQueue");
            System.out.println("9. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    ArrayListExample();
                    break;
                case 2:
                    LinkedListExample();
                    break;
                case 3:
                    HashSetExample();
                    break;
                case 4:
                    TreeSetExample();
                    break;
                case 5:
                    HashMapExample();
                    break;
                case 6:
                    TreeMapExample();
                    break;
                case 7:
                    LinkedHashMapExample();
                    break;
                case 8:
                    PriorityQueueExample();
                    break;
                case 9:
                    exit = true;
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 9.");
            }
        }
        scanner.close();
    }

    public static void ArrayListExample() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        System.out.println("Elements in ArrayList:");
        for (String fruit : list) {
            System.out.println(fruit);
        }
    }

    public static void LinkedListExample() {
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        System.out.println("Elements in LinkedList:");
        for (String fruit : list) {
            System.out.println(fruit);
        }
    }

    public static void HashSetExample() {
        HashSet<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");

        System.out.println("Elements in HashSet:");
        for (String fruit : set) {
            System.out.println(fruit);
        }
    }

    public static void TreeSetExample() {
        TreeSet<String> set = new TreeSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");

        System.out.println("Elements in TreeSet:");
        for (String fruit : set) {
            System.out.println(fruit);
        }
    }

    public static void HashMapExample() {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Orange");

        System.out.println("Elements in HashMap:");
        for (int key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }
    }

    public static void TreeMapExample() {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Orange");

        System.out.println("Elements in TreeMap:");
        for (int key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }
    }

    public static void LinkedHashMapExample() {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Orange");

        System.out.println("Elements in LinkedHashMap:");
        for (int key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }
    }

    public static void PriorityQueueExample() {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(5);
        queue.add(3);
        queue.add(7);

        System.out.println("Elements in PriorityQueue:");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
