import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Start /* Class used for navigating the program */
{
	static Scanner input = new Scanner(System.in);
	static ArrayList<Person> people = new ArrayList<Person>(); // linear data structures to store data
	static ArrayList<FilmTitle> films = new ArrayList<FilmTitle>();
	
	public static void main(String[] args) throws FileNotFoundException 
	{
		/* READ methods will be called here for FilmTitle & Person class.
		 * Methods will store Film & Person data in memory then program continues
		 * from here. From then a repeating menu will present itself to the user,
		 * to aid in the progression of the program.*/
		films = FilmTitle.readFile("SampleDataset-FilmTitle.csv"); //filling ArrayList up with Films
		people = Person.readPerson("SampleDataset-Person.csv"); //filling ArrayList up with people
		
		for (int i=0;i<people.size();i++)
		{
			System.out.println(people.get(i).personToString());
		}
		//MENU
		String choice = "";
		do {
		System.out.println("-- FILM DATABASE SYSTEM --");
		System.out.println("-- 1. Display Regions --");
		System.out.println("-- 2. Movies from Specific Region --");
		System.out.println("-- 3. xxxx --");
		System.out.println("-- 4. xxxx --");
		System.out.println("-- 5. Find Film using Person (nconst) --");
		choice = input.next();
		switch (choice)
		{
		case "1": { //task a
			FilmTitle.listRegions();
			break;
		}
		case "2": { //task b
			System.out.println("-- Enter Region (region) --");
			String regionInput = input.next().toUpperCase();
			FilmTitle.getFilmTitlesUsingRegion(regionInput);
			break;
		}
		case "3": { //task c
	
			break;
		}
		case "4": { //task d a
			Person.displayTitleAndCategory();
			break;
		}
		case "5": { //task d b
			break;
		}
		default:
			System.out.println("Wrong Input Entered");
			System.exit(0);
		}} while (!choice.equals("Q"));
	}
	
	public static void displayAll() //simple method to show all films or people.
	{
		System.out.println("-- Display ALL Films or People ? --");
		System.out.println("-- 1. Films --");
		System.out.println("-- 2. People --");
		String choice = "";
		choice = input.next();
		switch (choice)
		{
		case "1":
		{
			for (int i = 0; i<films.size(); i++)
			{
				System.out.println(films.get(i).filmToString());
			}
			break;
		}
		case "2":
		{
			for (int i = 0; i<people.size(); i++)
			{
				System.out.println(people.get(i).personToString());
			}
			break;
		}
		}
	}
}