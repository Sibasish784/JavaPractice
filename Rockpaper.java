            /* Rock Paper Scissor Game */
              
import java.util.Random;
import java.util.*;

 class Sibasish
 {
   public static void main(String args[]){ 

   int no,rno;

// USER INPUT TAKING
   
   Scanner sc=new Scanner(System.in);
   
    System.out.println(" Enter your choice  : 0 = Rock ");
    System.out.println(" Enter your choice  : 1 = Paper");
    System.out.println(" Enter your choice  : 2 = Scissor"); 
       no=sc.nextInt();
   
    switch (no){
         
        case 0: System.out.println(" Your choice is ROCK");
                break;
         
        case 1: System.out.println(" Your choice is PAPER");
                break;
                
        case 2: System.out.println(" Your choice is SCISSOR");
                break;
                
                }
                
// RANDOM NUMBERS CREATION METHOD 
                         
  Random random=new Random();
   rno=random.nextInt(2);
   
       System.out.println("...........Computer Turn................");            
      
      switch (rno){
        
            case 0: System.out.println("Computers choice is Rock");
                    break;
             
            case 1:System.out.println("Computers choice is Paper");
                   break;
             
            case 2:System.out.println("Computers choice is Scissor");
                   break;
               
               }       
           
   if(no==0 && rno==0)
      {
       
       System.out.println(" Game is Tie");       
        
      }  
        
     if(no==0 && rno==1)
      {
        
        System.out.println(" Computer Win");
        
      } 
      
      if(no==0 && rno==2)
        {
          
          System.out.println("You Win");
          
        }
        
     if(no==1 && rno==0)
     {
       
       System.out.println("You Win");
     }           
    
    if(no==1 && rno==1)
    {
      
      System.out.println("Game tie");
    }
     
     if(no==1 && rno==2)
     {
       
       System.out.println("Computer Win");
       
     }
     
     if(no==2 && rno==0)
      {
        
        System.out.println("Computer Win");
        
      }
      
      if(no==2 && rno==1)
         {
           
           System.out.println("You Win");
           
         }    
      
      if(no==2 && rno==2)
         
         {
           
           System.out.println("Game Tie");
           
         }
      
      }
    }