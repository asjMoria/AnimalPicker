import java.util.Scanner;

public class Main 
{
	public static void main(String[] args)
	{
		Scanner userIn = new Scanner(System.in);
		
		System.out.println("Would you like to see a dog or a cat?");
		String ans = userIn.nextLine().toLowerCase();
		
		if (ans.equals("cat"))
		{
			System.out.println("INSERT CAT IMAGE HERE");
		}
		else 
		{
			System.out.println("INSERT DOG IMAGE HERE");
		}
		
	}
}
