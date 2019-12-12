import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Person 
{
	public static Scanner input = new Scanner(System.in);
	public String comma = ",";
	public String titleId;
	public String ordering;
	public String nconst;
	public String category;
	public String job;
	public String characters;
	
	public Person(String csvLine) //constructor for Person, each attribute has a place in the array.
	{
		String[] csvParts = new String[5];
		csvParts = csvLine.split(comma);
		titleId = csvParts[0];
		ordering = csvParts[1];
		nconst = csvParts[2];
		category = csvParts[3];
		job = csvParts[4];
		characters = csvParts[5];
	}
	
	public static void displayTitleAndCategory(String p) //task D) A) -- iterates through arrayLists and compares Strings to find films/persons.
	{
		for (int i = 0; i<Start.people.size(); i++)
		{
			if (Start.people.get(i).getnConst().equals(p))
			{
				String temporaryId = Start.people.get(i).getTitleId(); //temporary storage for titleId of (i)
				
				for (int j = 0; j<Start.films.size(); j++)
				{
					if (temporaryId.equals(Start.films.get(j).getTitleId())) //compares Id of person to Id of film. e.g. tt010101 = tt010101?
					{
						System.out.printf("-- Film: %s || Category: %s --\n", 
							Start.films.get(j).getTitle(), Start.people.get(i).getCategory());
					}
				}
			}
		}
	}
	
	public static void displayPeopleInFilm(String title) //task D) B)
	{
		String id;//variable to hold titleId
		for (int i = 0;i<Start.films.size(); i ++)//for filmTitles in films
		{
			if (Start.films.get(i).getTitle().contains(title)) //if title at film(i) = user input title
			{
				id = Start.films.get(i).getTitleId(); //set id to titleId of film(i)
				for(int j = 0; j<Start.people.size(); j++) //for Person in people
				{
					if (id.equals(Start.people.get(j).getTitleId())) //if id = Person(j)'s titleId
					{
						System.out.printf("-- Name: %s || Category: %s --\n", //output the information
								Start.people.get(j).getnConst(), Start.people.get(j).getCategory());
					}
				}
			}
		}
		
	}
	
	public static void highestCredits()
	{
		String nconstHighest = ""; //holds nconst
		int max = 0; //holds counter for most amount of credits
		for (int i = 0; i < Start.people.size(); i++) //for Person in people
		{
			int creditCount = 0; //temporary counter of credits, gets reset every iteration
			String id = Start.people.get(i).getTitleId(); // id variable stores titleId of Person(i)
			for (int j = 0; i < Start.films.size(); i++) //for filmTitles in films
			{
				if (id.equals(Start.films.get(i).getTitleId())) //if id = filmTitle(i)'s titleId
				{
					creditCount++; //increment temporary counter
				}
				if (creditCount > max) //is temporary counter higher than the max so far?
				{
					max = creditCount;
					nconstHighest = Start.people.get(i).getnConst(); //stores the nconst of the Person with highest credits so far
				}
			}
		}
		for (int i = 0; i < Start.people.size(); i++) //prints out films this person has been in.
		{
			if (nconstHighest.equals(Start.people.get(i)))
			{
				
			}
		}
		System.out.printf("The person with the most credits is: %s with %d.\n", nconstHighest, max);
	}
	
	public static void highestCreditsCategory(String cat) //similar to method above with some changes
	{
		String nconstHighest = "";
		int max = 0;
		for (int i = 0; i < Start.people.size(); i++)
		{
			int creditCount = 0;
			String id = Start.people.get(i).getTitleId();
			for (int j = 0; i < Start.films.size(); i++)
			{
				if (id.equals(Start.films.get(i).getTitleId()) && Start.people.get(i).getCategory().equals(cat)) //checks category is = user's chosen category
				{
					creditCount++;
				}
				if (creditCount > max)
				{
					max = creditCount;
					nconstHighest = Start.people.get(i).getnConst();
				}
			}
		}
		System.out.printf("The person with the most credits is: %s with %d in category %s.\n", nconstHighest, max, cat);
	}
	
	public static ArrayList<Person> readPerson(String filename) throws FileNotFoundException  //method that controls the reading process of Person object.
	{	
		ArrayList<Person> tempList = new ArrayList<>();
		File csvFile = new File(filename);
		Scanner csvScan = new Scanner(csvFile);
		csvScan.nextLine(); //skips first row
		while (csvScan.hasNextLine())
		{
			String line = csvScan.nextLine();
			Person nextPerson = new Person(line); //creating new instance of object
			tempList.add(nextPerson); //adding current film to the temporary array list
		}
		csvScan.close();
		return tempList;
	}

	public String personToString() {
		return "Person [titleId=" + titleId + ", ordering=" + ordering + ", nconst=" + nconst + ", category=" + category
				+ ", job=" + job + ", characters=" + characters + "]";
	}
	public String getnConst() //getters
	{
		return this.nconst;
	}
	public String getTitleId()
	{
		return this.titleId;
	}
	public String getCategory()
	{
		return this.category;
	}
}

