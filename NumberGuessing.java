import java.util.Scanner;
import java.util.Random;
public class NumberGuessing {

	public static void main(String[] args)
	{
      System.out.println("Enter any number=");
      //Takes the input from the user in console
      Scanner sc = new Scanner(System.in);
      int number =sc.nextInt();
      // Generate a random target number between 0 and 99
        Random random = new Random();
        int target = random.nextInt(100);
        // Keep checking the user's guess until it matches the target number
        while(number!= target)
        {
            if(number>target)
        {
        	System.out.println("The given number is bigger than the target enter again");
        	 number =sc.nextInt();
        	
        }
		else if(number<target)
        {
        	System.out.println("The given number is lower then the target enter again");
        	 number =sc.nextInt();
        }
		
	}
		System.out.println("Congratliations you are guessing is correct");


}
}
