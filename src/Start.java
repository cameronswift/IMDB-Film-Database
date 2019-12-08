import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class Start /* Class used for navigating the program */
{
	static Scanner input = new Scanner(System.in);
	static ArrayList<Person> people = new ArrayList<Person>(); // linear data structures to store data
	static ArrayList<FilmTitle> films = new ArrayList<FilmTitle>();
	
	public static void main(String[] args) throws FileNotFoundException 
	{
		films = FilmTitle.readFile("SampleDataset-FilmTitle.csv"); //filling ArrayList up with Films
		people = Person.readPerson("SampleDataset-Person.csv"); //filling ArrayList up with people
		menu();
	}	
		//MENU
	public static void menu()
	{
		String choice = "";
		do {
		System.out.println("-- FILM DATABASE SYSTEM --");
		System.out.println("-- 1. Display Regions --");
		System.out.println("-- 2. Movies from Specific Region --");
		System.out.println("-- 3. Partial Name Film Search --");
		System.out.println("-- 4. Find Films using Person --");
		System.out.println("-- 5. Find People who worked on film --");
		System.out.println("-- q. Quit --");
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
			System.out.println("-- Enter Partial Film Title (title) --");
			String titleInput = input.next();
			FilmTitle.searchFilms(titleInput);
			break;
		}
		case "4": { //task d a
			System.out.println("-- Enter Person (nconst) --");
			String p = input.next();
			Person.displayTitleAndCategory(p);
			break;
		}
		case "5": { //task d b
			System.out.println("-- Enter title (title) --");
			String t = input.next();
			Person.displayPeopleInFilm(t);
			break;
		}
		case "6": {//task e
			
			break;
		}
		case "7": {//task f
			
			break;
		}
		case "q": {
			System.exit(0);
		}
		default:
			System.out.println("-- WRONG INPUT ENTERED, TRY AGAIN --");
			menu();
		}} while (!choice.equals("Q"));
	}
/*==================================================================================================================================================================================
(TESTING PURPOSES)(TESTING PURPOSES)(TESTING PURPOSES)(TESTING PURPOSES)(TESTING PURPOSES)(TESTING PURPOSES)(TESTING PURPOSES)(TESTING PURPOSES)(TESTING PURPOSES)(TESTING PURPOSES)*/
	public static void displayAll() //simple method to show all films or people 
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