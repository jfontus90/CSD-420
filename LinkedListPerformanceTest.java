import java.util.LinkedList;
import java.util.Iterator;

public class LinkedListPerformanceTest {

    // Fill list with n integers
    public static LinkedList<Integer> buildList(int size) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            list.add(i);
        }
        return list;
    }

    // Traverse using Iterator
    public static long testIterator(LinkedList<Integer> list) {
        long start = System.nanoTime();

        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            it.next();
        }

        long end = System.nanoTime();
        return end - start;
    }

    // Traverse using get(index)
    public static long testGet(LinkedList<Integer> list) {
        long start = System.nanoTime();

        for (int i = 0; i < list.size(); i++) {
            list.get(i);
        }

        long end = System.nanoTime();
        return end - start;
    }

    public static void runTest(int size) {
        LinkedList<Integer> list = buildList(size);

        System.out.println("\n===== Testing with " + size + " elements =====");

        long iteratorTime = testIterator(list);
        long getTime = testGet(list);

        System.out.println("Iterator time: " + iteratorTime / 1_000_000.0 + " ms");
        System.out.println("get(index) time: " + getTime / 1_000_000.0 + " ms");

        // Explanation in output (for your report)
        System.out.println("\nComment:");
        System.out.println("Iterator is much faster because it traverses sequentially (O(n)).");
        System.out.println("get(index) is slower because LinkedList must search from the head each time (O(n^2)).");
    }

    public static void main(String[] args) {

        runTest(50_000);
        runTest(500_000);
    }
}