import java.util.Scanner;

public class Main 
{
	public static void main(String[] args)
	{
		Scanner userIn = new Scanner(System.in);
		
		boolean validAnswer = false;
		
		while (!validAnswer)
		{
			validAnswer = true;
			System.out.println("Would you like to see a dog or a cat?");
			String ans = userIn.nextLine().toLowerCase();
			
			if (ans.equals("cat"))
			{
				System.out.println(" _._     _,-\'\"\"`-._\n(,-.`._,\'(       |\\`-/|\n    `-.-\' \\ )-`( , o o)\n          `-    \\`_`\"\'-");
			}
			else if (ans.equals("dog"))
			{
				System.out.println("                                  .-.\n     (___________________________()6 `-,\n     (   ______________________   /\'\'\"`\n     //\\\\                      //\\\\\n     \"\" \"\"                     \"\" \"\"");
			}
			else
			{
				System.out.println("Cannot identify animal.");
				validAnswer = false;
			}
		}
	}
}
