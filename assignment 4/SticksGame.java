import java.util.Scanner;
public class SticksGame
{

   public static void playGameOnce(Player player1, Player player2, int totalSticks, boolean training)
   {
      if (training == false)
      {
         System.out.println();
      }
      player1.startGame(training);
      player2.startGame(training);
      if (training == false)
      {
         System.out.println();
      }
      Scanner scanner = new Scanner(System.in);
      int numSticks = totalSticks;
      
      while(numSticks > 0)
      {
         numSticks = player1.move(numSticks, training);
         if(numSticks <= 0) 
         {
            if (training == false)
            {
               System.out.println();
            }
            player1.endGame(false, training);
            player2.endGame(true, training);
            return; 
         }
         if (training == false)
         {
            System.out.println();
         }
         
         numSticks = player2.move(numSticks, training);
         if(numSticks <= 0)
         {
            if (training == false)
            {
               System.out.println();
            }
            player1.endGame(true, training);
            player2.endGame(false, training);
            return;
         }
         if (training == false)
         {
            System.out.println();
         }
      }
   }  
   
   public static void main(String[] args)
   {
      System.out.println("Welcome to the game of sticks!");
      Scanner scanner = new Scanner(System.in);
      System.out.print("How many sticks are there on the table initally? (14  or  21  or 53)? ");
      int totalSticks = scanner.nextInt();
      while (totalSticks !=14 || totalSticks !=21 || totalSticks !=53)
      {
         System.out.println("Please enter a valid input");
         totalSticks = scanner.nextInt();
      }
      
      System.out.println("Options:");
      System.out.println("(1) HUMAN vs HUMAN");
      System.out.println("(2) HUMAN vs AI");
      System.out.println( "(3) AI vs AI");
      int option = scanner.nextInt();
    
      // Choose which game: 1 = human v human, 2 = human v AI, 3 = AI(1) v AI(2) 
      while (option >= 4 || option <= 0)
      {
         System.out.println("Wrong choice, please input number 1 or 2 or 3");
         option = scanner.nextInt();
      }
      
      if (option == 1)
      {
         Player player1 = new Human("Player 1");
         Player player2 = new Human("Player 2");
         playGameOnce(player1, player2, totalSticks, false);
         playAgain(player1, player2, totalSticks);
      }
      else if (option == 2)
      {
         Player player1 = new Human("Player 1");
         Player player2 = new AI("AI", totalSticks);
         playGameOnce(player1, player2, totalSticks, false);
         playAgain(player1, player2, totalSticks);
      }
      else if (option == 3)
      {
         Player player1 = new AI("AI 1", totalSticks);
         Player player2 = new AI("AI  2", totalSticks);
         System.out.println("Training AI, please wait!");
         for (int i = 0; i<= 100000; i++)
         { 
            playGameOnce(player1, player2, totalSticks, true);
         }
         player1 = new Human("Player 1");
         playGameOnce(player1, player2, totalSticks, false);
         playAgain(player1, player2, totalSticks);
      }
   }   
   
   public static void playAgain(Player player1, Player player2, int totalSticks)
   {
      System.out.println("Do you want to play/play again? 1 = yes, 2 = no.");
      Scanner scanner = new Scanner(System.in);           
      int decision = scanner.nextInt();
      while(decision < 1 || decision > 2)
      {
         System.out.println("Please pick 1 or 2");
         System.out.println("Do you want to play again? 1 = yes, 2 = no.");
         decision = scanner.nextInt();
      }
      
      if (decision == 1)
      {
         playGameOnce(player1, player2, totalSticks, false);
         playAgain(player1, player2, totalSticks);
      }
      else
      {
         return;
      }
   }
}