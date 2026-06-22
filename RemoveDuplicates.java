import java.util.ArrayList;
import java.util.Random;

public class RemoveDuplicates {

    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {

        ArrayList<E> uniqueList = new ArrayList<>();

        for (E element : list) {
            if (!uniqueList.contains(element)) {
                uniqueList.add(element);
            }
        }

        return uniqueList;
    }

    public static void main(String[] args) {

        Random random = new Random();
        ArrayList<Integer> originalList = new ArrayList<>();

        for (int i = 0; i < 50; i++) {
            originalList.add(random.nextInt(20) + 1);
        }

        System.out.println("Original List: " + originalList);

        ArrayList<Integer> newList = removeDuplicates(originalList);

        System.out.println("No Duplicates: " + newList);
    }
}
