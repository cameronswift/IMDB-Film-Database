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
		String id;
		for (int i = 0;i<Start.films.size(); i ++)
		{
			if (Start.films.get(i).getTitle().contains(title))
			{
				id = Start.films.get(i).getTitleId();
				for(int j = 0; j<Start.people.size(); j++)
				{
					if (id.equals(Start.people.get(j).getTitleId())) 
					{
						System.out.printf("-- Name: %s || Category: %s --\n",
								Start.people.get(j).getnConst(), Start.people.get(j).getCategory());
					}
				}
			}
		}
		
	}
	
	public void highestCredits()
	{
	}
	
	public void highestCreditsCategory()
	{
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

