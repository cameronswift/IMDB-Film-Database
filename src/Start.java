import java.util.ArrayList;
import java.util.Scanner;

public class Start /* Class used for navigating the program */
{
	ArrayList<FilmTitle> films = new ArrayList<FilmTitle>();
	ArrayList<Person> people = new ArrayList<Person>(); // linear data structures to store data
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		/* READ methods will be called here for FilmTitle & Person class.
		 * Methods will store Film & Person data in memory then program continues
		 * from here. From then a repeating menu will present itself to the user,
		 * to aid in the progression of the program.*/
		String choice = "";
		do {
		System.out.println("-- FILM DATABASE SYSTEM --");
		System.out.println("-- 1. View Films --");
		System.out.println("-- 2. xxxx --");
		System.out.println("-- 3. xxxx --");
		System.out.println("-- 4. xxxx --");
		choice = input.next();
		switch (choice)
		{
		case "1": {
			//method call
			break;
		}
		case "2": {
			//method call
			break;
		}
		case "3": {
			//method call
			break;
		}
		case "4": {
			//method call
			break;
		}
		default:
			System.out.println("Wrong Input Entered");
			System.exit(0);
		}} while (!choice.equals("Q"));
	}
}