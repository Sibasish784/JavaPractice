import java.util.*;
//A game of snake and ladders.
public class Snakeladder
{
    public static void main(String[]args)
    {
        String p1 , p2 ;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a valid name for player 1:-");
        p1 = input.nextLine();
        System.out.println("Enter a valid name for player 2:-");;
        p2 = input.nextLine();
        int n1 = 0 , n2 = 0 , c =1 , np1 , np2 , n;
        while(c!=0)
        {
            System.out.println();
            System.out.println();
            System.out.println(p1+"'s turn. Press enter to roll...");
            input.nextLine();
            System.out.println("Dice is rolling....");
            n=(int)Math.floor(Math.random()*6 + 1);
            n1 = n1+=n;
            System.out.println(p1+" got "+n);
            if(n1>=100)
            {
                System.out.println(p1+" won!!!!");
                System.exit(0);
            }
            else if(n1%12==0)
            {
                np1 = (int)Math.floor(Math.random()*9 + 1);
                System.out.println("UGH!!! A snake has bitten you!");
            System.out.println("Moving from "+n1+" to "+(n1-np1));
                n1-=np1;
            }
            else if(n1%10==0)
            {
                np1 = (int)Math.floor(Math.random()*9 + 1);
                System.out.println("YAY!! You got a ladder!");
                System.out.println("Moving from "+n1+" to "+(n1+np1));
                n1+=np1;
            }
            else
                System.out.println("Moving to "+n1);
            System.out.println();
            System.out.println();
            System.out.println(p2+"'s turn. Press enter to roll...");
            input.nextLine();
            System.out.println("Dice is rolling....");
            n = (int)Math.floor(Math.random()*6 + 1);
            n2 = n2+=n;
            System.out.println(p2+" got "+n);
            if(n2>=100)
            {
                System.out.println(p2+" won!!!!");
                System.exit(0);
            }
            else if(n2%12==0)
            {
                np2 = (int)Math.floor(Math.random()*9 + 1);
                System.out.println("UGH!!! A snake has bitten you!");
                System.out.println("Moving from "+n2+" to "+(n2-np2));
                n2-=np2;
            }
            else if(n2%10==0)
            {
                np2 = (int)Math.floor(Math.random()*9 + 1);
                System.out.println("YAY!! You got a ladder!");
                System.out.println("Moving from "+n2+" to "+(n2+np2));
                n2+=np2;
            }
            else
                System.out.println("Moving to "+n2);
        }
        input.close();
    }
}