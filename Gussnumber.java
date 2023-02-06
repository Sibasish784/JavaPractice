//Compiler version JDK 11.0.2
import java.util.Random;
import java.util.Scanner;

 class Guessnumber
 {
   public static void main(String args[])
   { 
     int counter =0;
     // counter for chances
      Scanner sc = new Scanner(System.in);     
      Random rn = new Random();
      int ran_no = rn.nextInt(10);
      // random no from 0 t0 100
      System.out.println("WELCOME but you are late");
      System.out.println("Guess the Number between if you have power");
      System.out.println("1 to 10");
     
    while (true){
       counter++;
  int user_no = sc.nextInt();
     if (user_no==ran_no)
        {
         System.out.println("congratulations...");
             break;
        }
     else if(user_no > ran_no)
        {
         System.out.println("The number "+user_no+ " is too Big...");
        }
     else
       {
        System.out.println("The number "+user_no+ " is too Small...");
        }
    }
     System.out.println("The number was "+ran_no+"." +" \nyou guessed in " +counter+ " chances...");
   }
 }