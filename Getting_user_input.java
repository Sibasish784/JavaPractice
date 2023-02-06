import java.util.*;

public class Getting_user_input {
    public static void main(String[] args) {
        System.out.println("Taking Input From The User:" );
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1" );
        int a = sc.nextInt();
        System.out.println("Enter number 2" );
        int b = sc.nextInt();
        int Sum = a + b;
        System.out.println("The Sum Is");
        System.out.println(Sum);
    }
}
