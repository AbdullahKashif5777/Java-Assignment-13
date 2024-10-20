package javaapplication19;
import java.util.*;

public class Structures {

    public void demonstrateArrayList() {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.set(1, "Blueberry");
        fruits.remove("Cherry");
        System.out.println("ArrayList contents:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }

    public void demonstrateLinkedList() {
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.set(1, 25);
        numbers.remove(Integer.valueOf(30));
        System.out.println("LinkedList contents:");
        numbers.forEach(System.out::println);
    }

    public void demonstrateHashSet() {
        HashSet<String> animals = new HashSet<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Horse");
        animals.remove("Cat");
        animals.add("Lion");
        animals.remove("Horse");
        System.out.println("HashSet contents:");
        for (String animal : animals) {
            System.out.println(animal);
        }
    }
    
    public void demonstrateTreeSet() {
        TreeSet<Integer> sortedNumbers = new TreeSet<>();
        sortedNumbers.add(15);
        sortedNumbers.add(20);
        sortedNumbers.add(10);
        sortedNumbers.remove(10);
        sortedNumbers.add(12);
        sortedNumbers.remove(20);
        System.out.println("TreeSet contents:");
        for (Integer number : sortedNumbers) {
            System.out.println(number);
        }
    }

    public void demonstrateHashMap() {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(2, "Twenty");
        map.remove(3);
        System.out.println("HashMap contents:");
        map.forEach((key, value) -> System.out.println(key + ": " + value));
    }

    public void demonstrateHashtable() {
        Hashtable<String, Integer> table = new Hashtable<>();
        table.put("John", 25);
        table.put("Jane", 30);
        table.put("Tom", 35);
        table.put("Jane", 32);
        table.remove("Tom");
        System.out.println("Hashtable contents:");
        for (String key : table.keySet()) {
            System.out.println(key + ": " + table.get(key));
        }
    }

    public void demonstrateTreeMap() {
        TreeMap<Integer, String> sortedMap = new TreeMap<>();
        sortedMap.put(3, "Three");
        sortedMap.put(1, "One");
        sortedMap.put(2, "Two");
       
        sortedMap.put(2, "Twenty");
    
        sortedMap.remove(3);
       
        System.out.println("TreeMap contents:");
        sortedMap.forEach((key, value) -> System.out.println(key + ": " + value));
    }

    
    public void demonstrateStack() {
        Stack<String> stack = new Stack<>();
        
        stack.push("A");
        stack.push("B");
        stack.push("C");
        
        stack.pop();
        stack.push("D");
        
        stack.pop();
       
        System.out.println("Stack contents:");
        for (String item : stack) {
            System.out.println(item);
        }
    }

    public void demonstrateQueue() {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(1);
        queue.add(2);
        queue.add(3);

        queue.remove();
        queue.add(4);

        queue.remove();

        System.out.println("Queue contents:");
        for (Integer num : queue) {
            System.out.println(num);
        }
    }

    public void demonstrateVector() {
        Vector<String> vector = new Vector<>();

        vector.add("Apple");
        vector.add("Banana");
        vector.add("Cherry");

        vector.set(1, "Blueberry");
        vector.remove("Cherry");
        System.out.println("Vector contents:");
        vector.forEach(System.out::println);
    }

    public void demonstratePriorityQueue() {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        priorityQueue.add(5);
        priorityQueue.add(2);
        priorityQueue.add(8);

        priorityQueue.remove(2);
        priorityQueue.add(3);

        priorityQueue.remove(8);

        System.out.println("PriorityQueue contents:");
        for (Integer num : priorityQueue) {
            System.out.println(num);
        }
    }

    public void demonstrateSet() {
        Set<String> set = new HashSet<>();
        set.add("One");
        set.add("Two");
        set.add("Three");

        set.remove("Two");
        set.add("Twenty");

        set.remove("Three");

        System.out.println("Set contents:");
        for (String value : set) {
            System.out.println(value);
        }
    }

    public static void main(String[] args) {
        Structures structures = new Structures();
        structures.demonstrateArrayList();
        structures.demonstrateLinkedList();
        structures.demonstrateHashSet();
        structures.demonstrateTreeSet();
        structures.demonstrateHashMap();
        structures.demonstrateHashtable();
        structures.demonstrateTreeMap();
        structures.demonstrateStack();
        structures.demonstrateQueue();
        structures.demonstrateVector();
        structures.demonstratePriorityQueue();
        structures.demonstrateSet();
    }
}
