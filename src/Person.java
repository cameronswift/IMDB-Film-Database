import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Person 
{
	public String comma = ",";
	public String titleId;
	public String ordering;
	public String nconst;
	public String category;
	public String job;
	public String characters;
	
	public Person(String csvLine) 
	{
		String csvParts[] = csvLine.split(comma);
		titleId = csvParts[0];
		ordering = csvParts[1];
		nconst = csvParts[2];
		category = csvParts[3];
		job = csvParts[4];
		characters = csvParts[5];
	}
	
	public void displayTitleAndCategory(String p)
	{
	}
	
	public void displayPeopleInFilm(String titleId)
	{
	}
	
	public void highestCredits()
	{
	}
	
	public void highestCreditsCategory()
	{
	}
	
	public static ArrayList<Person> readPerson(String filename) throws FileNotFoundException 
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
}

