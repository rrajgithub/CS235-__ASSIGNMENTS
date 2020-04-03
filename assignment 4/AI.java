import java.util.Scanner;

public class AI implements Player 
{
   private String playerName;
   private int[][] options;
   private int totalSticks;
   private int[] memory;
    
   public AI(String name, int totalSticks)
   {
      this.playerName = name;
      this.totalSticks = totalSticks;
      this.options = new int[totalSticks][3];
   
      for(int i = 0; i < totalSticks; i++)
      {
         for(int j = 0; j < 3; j++)
         {
            options[i][j] = 1;
         }
      }
      this.options[1][1] = 0;
      this.options[1][2] = 0;
      this.options[2][2] = 0;
      this.memory = new int[totalSticks];
   }
   public int move(int numSticks, boolean training) 
   {  
      int[] optionArray = options[numSticks - 1];
      
      double total = 0;
      for(int i = 0; i < 3; i++)
      {
         total += optionArray[i];
      }

      double a = optionArray[0] / total;
      double b = a + optionArray[1] / total;
      double c = b + optionArray[2] / total;
   
      double x = Math.random();
      int sticks = 0;
  
      if (x <= a)
      {
         sticks = 1;
      }
      else if (x > a & x <= b)
      {
         sticks = 2;
      }
      else 
      {
         sticks = 3;
      }
   
      print(training, numSticks, sticks, total);
   
      memory[numSticks - 1] = sticks;
      numSticks = numSticks - sticks;
      return numSticks;
   }
   
   public void endGame(boolean win, boolean training)
   {
      if (win == true)
      {
         if (training == false)
         {
            System.out.println(playerName + ": You win!");
         }
         for(int i = 0; i < memory.length; i++)
         {
            if (memory[i] == 1)
            {
               options[i][0] += 1;
            }
            else if (memory[i] == 2)
            {
               options[i][1] += 1;
            }
            else if (memory[i] == 3)
            {
               options[i][2] += 1;
            }
         }
      }
      else
      {
         if (training == false)
         {
            System.out.println(playerName + ": You lose.");
         }
      }
      if (training == false)
      {
         System.out.println();
         System.out.println(playerName + " Thank you!'");
      }
      for(int i = 0; i < memory.length; i++)
      {
         memory[i] = 0;
      }
   }
   public void startGame(boolean training)
   {
      if (training == false)
      {
         System.out.println(playerName + " says 'I, the AI, will hope to defeat you!'");
      }
   }
   public void print(boolean training, int numSticks, int sticks, double total)
   {
      if (training == false)
      {
         System.out.println("There are " + numSticks + " stick(s) on the board");
         System.out.println(total);
         System.out.println(playerName + " selects " + sticks  + " stick(s).");
      }
   }
}