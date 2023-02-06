import java.util.*;

public class SelectionSort {
    public static void main(String[] args) {
        String[] list = {"E", "X", "A", "M", "P", "L", "E"};

        for (int i = 0; i < list.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < list.length; j++) {
                if (list[j].compareTo(list[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            String temp = list[minIndex];
            list[minIndex] = list[i];
            list[i] = temp;
        }

        System.out.println(Arrays.toString(list));
    }
}