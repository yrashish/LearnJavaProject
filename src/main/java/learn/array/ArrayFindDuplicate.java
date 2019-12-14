package learn.array;

import java.util.HashSet;
import java.util.Set;

public class ArrayFindDuplicate {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 5, 6, 2, 2};
        Set<Integer> set = new HashSet<>(array.length);
        System.out.println("Duplicate Elements are!");
        for (int i = 0; i < array.length; i++) {
            if (set.add(array[i]) == false) {
                System.out.println(array[i]);
            }
        }
    }
}
