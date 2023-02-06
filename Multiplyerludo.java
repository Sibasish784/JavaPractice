import java.util.Scanner;
import java.util.Random;

 class Dcoderkk{l`l
   public static void main(String args[]){ 
    Scanner sc = new Scanner(System.in);
    Random randomDice = new Random();
    
    int player1, player2, dice;
    String namePlayer1, namePlayer2;
    
    System.out.println("-------------MULTIPLAYER DICE-------------\n");
    
    System.out.println("Player 1 type your name: ");
    namePlayer1 = sc.next();
    System.out.println("\nPlayer 2 type your name: ");
    namePlayer2 = sc.next();
    
    System.out.println("\n------------CHOOSE THE NUMBERS------------\n");
    
    System.out.println(namePlayer1 + " choose a number between 1 and 6: ");
    player1 = sc.nextInt();
    System.out.println("\n" + namePlayer2 + " choose a number between 1 and 6: ");
    player2 = sc.nextInt();
     
    if (player1 > 6 || player2 > 6){
      System.out.println("Invalid Value");
    } else if (player1 == player2){
      System.out.println("Error! " + namePlayer1 + " and " + namePlayer2 + " Can't choose the same numbers!!!");
    } else {
    dice = randomDice.nextInt(6) + 1;
    
    System.out.println("\n----------------DICE RESULT---------------\n");
    System.out.println("Dice: " + dice);
    
      if (player1 == dice){
        System.out.println("\n------------------RESULT------------------\n");
        System.out.println(namePlayer1 + " Win");
    } else if (player2 == dice){
        System.out.println("\n------------------RESULT------------------\n");
        System.out.println(namePlayer2 + " Win");
    } else {
        System.out.println("\n------------------RESULT------------------\n");
        System.out.println("\nDraw\n");
    }
    }
    sc.close();
   }
 }