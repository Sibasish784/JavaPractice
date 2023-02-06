import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        

        char[] list = {'E', 'X', 'A', 'M', 'P', 'L', 'E'};
  
        for (int i = 0; i < list.length; i++) {
            for (int j = 1; j < list.length - i; j++) {
                if (list[j - 1] > list[j]) {
                    char temp = list[j - 1];
                    list[j - 1] = list[j];
                    list[j] = temp;
                }
            }
        }
  
        System.out.println(Arrays.toString(list));
    }
}