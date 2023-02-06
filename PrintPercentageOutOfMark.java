import java.util.*;

public class PrintPercentageOutOfMark {
    public static void main(String[] args) {
        System.out.println("Enter Marks of 5 subjects whose full mark is 100");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Mark of 1st subject: ");
                float Mark1 = sc.nextFloat();
        System.out.println("Enter Mark of 2st subject: ");
                float Mark2 = sc.nextFloat();
        System.out.println("Enter Mark of 3st subject: ");
                float Mark3 = sc.nextFloat();
        System.out.println("Enter Mark of 4st subject: ");
                float Mark4 = sc.nextFloat();
        System.out.println("Enter Mark of 5st subject: ");
                float Mark5 = sc.nextFloat();

                float sum = Mark1 + Mark2 + Mark3 + Mark4 + Mark5;
        System.out.println("The total Mark Is: ");
        System.out.println(sum);
                float Percentage1 = sum / 500;
                float Percentage = Percentage1 * 100;
        System.out.println("The total Percentage Is: ");
        System.out.println(Percentage);
    }
}
